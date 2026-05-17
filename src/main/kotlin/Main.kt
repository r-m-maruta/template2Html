import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

fun main(args: Array<String>) {
    try {

        if (args.size < 3) {
            println("Uso: java -jar template2Html.jar template.html input.json output.html")
            return
        }

        val jsonText = File(args[1]).readText()
        val jsonLexer  = JsonGrammarLexer(CharStreams.fromString(jsonText))
        val jsonParser = JsonGrammarParser(CommonTokenStream(jsonLexer))
        val json = jsonParser.json().toAST() as JObject

        val templateText = File(args[0]).readText()
        val interpreter = Interpreter(json)
        interpreter.run(templateText)

        File(args[2]).writeText(interpreter.output.toString().trim())
        println("Output gerado: ${args[2]}")
        println(interpreter.output.toString())

    } catch(e: Exception) {
        println("ERRO: ${e.message}")
        e.printStackTrace()
    }
}