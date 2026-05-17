import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class DivByZero(val line: Int) :
    RuntimeException("Divison by zero on line $line")

class Interpreter(val json: JObject) {

    val memory = mutableMapOf<String, Any>()
    val output = StringBuilder()

    fun run(template: String) {
        json.fields.forEach { field ->
            memory[field.name] = field.value
        }

        // divide o template manualmente pelo {{ e }}
        var remaining = template
        while(remaining.isNotEmpty()) {
            val start = remaining.indexOf("{{")
            if(start == -1) {
                output.append(remaining)
                break
            }
            // TEXT antes do script
            if(start > 0) output.append(remaining.substring(0, start))

            // encontra o fim do script
            val end = remaining.indexOf("}}", start)
            val scriptText = remaining.substring(start + 2, end).trim()

            // processa o script
            val lexer  = ScriptGrammarLexer(CharStreams.fromString(scriptText))
            val parser = ScriptGrammarParser(CommonTokenStream(lexer))
            execute(parser.script().toAST())

            remaining = remaining.substring(end + 2)
        }
    }

    enum class State {NORMAL, THEN, ELSE}
    var state = State.NORMAL
    var condition = false


    fun execute(script: ScriptAST) {

        if(state == State.THEN && !condition) return
        if(state == State.ELSE && condition) return

        when(script) {
            is Assign -> memory[script.varId] = script.expression.evaluate()
            is If -> {
                condition = script.condition.evaluate() != 0.0
                state = if(condition) State.THEN else State.ELSE
            }
            is Else -> state = if(condition) State.ELSE else State.THEN
            is End -> state = State.NORMAL
            is Access -> output.append(resolveValue(script.varId))
            is Shortcode -> output.append(generateHTML(script))
        }
    }

    // avalia uma expressão e devolve um número
    fun Expression.evaluate(): Double =
        when(this) {
            is Literal -> value.toDouble()
            is Variable -> when(val v = memory[varId]) {
                is JBoolean -> if(v.value) 1.0 else 0.0
                is JNumber  -> v.value.toDouble()
                is Number   -> v.toDouble()
                is Double   -> v
                null -> throw RuntimeException("Variable not found: $varId")
                else -> throw RuntimeException("Cannot evaluate: $varId")
            }
            is BinaryExpression -> operator.calculate(left, right)
        }

    fun Operator.calculate(left: Expression, right: Expression): Double {
        val leftVal = left.evaluate()
        val rightVal = right.evaluate()
        return when (this) {
            Operator.PLUS       -> leftVal + rightVal
            Operator.MINUS      -> leftVal - rightVal
            Operator.TIMES      -> leftVal * rightVal
            Operator.DIVISION   -> if(rightVal == 0.0)
                throw DivByZero(-1)
            else
                leftVal/rightVal
        }
    }

    // resolve um valor da memória para String
    fun resolveValue(name: String): String =
        when(val v = memory[name]) {
            is JString -> v.value
            is Number -> if(v.toDouble() == v.toLong().toDouble())
                v.toLong().toString()  // 400.0 → "400"
            else
                v.toString()
            is JBoolean -> v.value.toString()
            is String -> v
            null -> throw RuntimeException("Variable not found: $name")
            else -> v.toString()
        }

    // resolve um argumento do shortcode
    fun resolveArg(arg: Arg): String = when(arg) {
        is ArgId     -> resolveValue(arg.name)
        is ArgString -> arg.value
        is ArgNumber -> arg.value.toString()
    }

    fun generateHTML(shortcode: Shortcode): String {
        val args = shortcode.args.map {resolveArg(it)}
        return when(shortcode.name) {
            "img" -> {
                val src = args[0]
                val width = args[1]
                val height = args[2]
                """
                <figure>
                    <img src="$src" width="$width" height="$height">
                </figure>
                """.trimIndent()
            }
            "video" -> {
                val src = args[0]
                val width = args[1]
                val height = args[2]
                """
                <video width="$width" height="$height" controls>
                    <source src="$src" type="video/mp4">
                </video>
                """.trimIndent()
                /*if(src.endsWith(".gif")) {
                    "<img src=\"$src\" width=\"$width\" height=\"$height\" style=\"object-fit:cover;\">"
                } else {
                    """
                        <video width="$width" height="$height" controls>
                            <source src="$src" type="video/mp4">
                        </video>
                                """.trimIndent()
                }*/
            }
            /*"gallery" -> {
                val listName = shortcode.args[0].let {
                    when(it) {
                        is ArgId -> it.name  // só o nome — não resolve o valor!
                        else -> throw RuntimeException("gallery expects a variable name")
                    }
                }
                val array = memory[listName] as? JArray
                    ?: throw RuntimeException("Not a list: $listName")
                val imgs = array.value.filterIsInstance<JObject>().joinToString("\n") { obj ->
                    val src = (obj.fields.find { it.name == "src" }?.value as? JString)?.value
                        ?: throw RuntimeException("Missing src in gallery item")
                    "    <img src=\"$src\">"
                }
                "<div style=\"display:grid; grid-template-columns: repeat(3, 1fr); gap:10px;\">\n$imgs\n</div>"
            }*/
            "gallery" -> {
                val listName = shortcode.args[0].let {
                    when(it) {
                        is ArgId -> it.name
                        else -> throw RuntimeException("gallery expects a variable name")
                    }
                }
                val array = memory[listName] as? JArray
                    ?: throw RuntimeException("Not a list: $listName")

                val imgs = array.value.filterIsInstance<JObject>().joinToString("\n") { obj ->
                    val src = (obj.fields.find { it.name == "src" }?.value as? JString)?.value
                        ?: throw RuntimeException("Missing src in gallery item")
                    "        <img src=\"$src\" style=\"min-width:100%; height:300px; object-fit:cover;\">"
                }

                val total = array.value.filterIsInstance<JObject>().size

                """
                    <div style="overflow:hidden; width:100%; max-width:800px; margin:auto;">
                        <div id="slider" style="display:flex; transition:transform 0.5s ease;">
                    $imgs
                        </div>
                    </div>
                    <script>
                        var current = 0;
                        var total = $total;
                        setInterval(function() {
                            current = (current + 1) % total;
                            document.getElementById('slider').style.transform = 'translateX(-' + (current * 100) + '%)';
                        }, 3000);
                    </script>
                        """.trimIndent()
            }
            "badge" -> {
                val text = args[0]
                val color = args[1]
                """
                <span style="background:$color; padding:4px 8px; border-radius:4px; color:white">$text</span>
                """.trimIndent()
            }
            else -> throw RuntimeException("Unknown shortcode: ${shortcode.name}")

        }
    }

    /*fun run(template: TemplateGrammarParser.TemplateContext) {
        json.fields.forEach { field ->
            memory[field.name] = field.value
        }

        template.part().forEach { part ->
            println("part.text = '${part.text}'")
            println("scriptContent = ${part.scriptContent()?.text}")
            println("---")
            if (part.scriptContent() != null) {
                val scriptText = part.scriptContent().SCRIPT_TEXT().text
                val lexer = ScriptGrammarLexer(CharStreams.fromString(scriptText))
                val parser = ScriptGrammarParser(CommonTokenStream(lexer))
                val ast = parser.script().toAST()
                execute(ast)
            } else {
                output.append(part.text)
            }
        }
    }*/




}
