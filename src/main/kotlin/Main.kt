import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

fun main() {
    try {
        val jsonText = File("input.json").readText()
        val jsonLexer  = JsonGrammarLexer(CharStreams.fromString(jsonText))
        val jsonParser = JsonGrammarParser(CommonTokenStream(jsonLexer))
        val json = jsonParser.json().toAST() as JObject

        /*val templateText = File("template.html").readText()
        val templateLexer  = TemplateGrammarLexer(CharStreams.fromString(templateText))
        val templateParser = TemplateGrammarParser(CommonTokenStream(templateLexer))
        val template = templateParser.template()

        val interpreter = Interpreter(json)
        interpreter.run(template)*/

        val templateText = File("template.html").readText()
        val interpreter = Interpreter(json)
        interpreter.run(templateText)

        File("output.html").writeText(interpreter.output.toString().trim())
        println("Output gerado: output.html")
        println(interpreter.output.toString())
    } catch(e: Exception) {
        println("ERRO: ${e.message}")
        e.printStackTrace()
    }
}