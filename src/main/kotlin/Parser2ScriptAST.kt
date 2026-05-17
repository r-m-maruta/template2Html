import ScriptGrammarParser.*

fun ScriptContext.toAST(): ScriptAST =
    if(assign() != null)
        assign().toAST()
    else if (if_() != null)
        if_().toAST()
    else if(else_() != null)
        Else
    else if(end() != null)
        End
    else if (shortcode() != null)
        shortcode().toAST()
    else if (access() != null)
        access().toAST()
    else
        throw IllegalArgumentException("Unknown statement: ${this.text}")

fun AssignContext.toAST(): Assign =
    Assign(ID().text, expression().toAST())

fun If_Context.toAST(): If =
    If(expression().toAST())

fun ShortcodeContext.toAST(): Shortcode =
    Shortcode(ID().text, arg().map { it.toAST()})

fun ArgContext.toAST(): Arg =
    when {
        ID() != null -> ArgId(ID().text)
        STRING() != null -> ArgString(STRING().text.trim('"'))
        NUMBER() != null -> ArgNumber(
            try { NUMBER().text.toInt() }
            catch(e: NumberFormatException) { NUMBER().text.toDouble() }
        )
        else -> throw IllegalArgumentException("Unknown arg: ${this.text}")
    }


fun AccessContext.toAST(): Access =
    Access(ID().text)

fun ExpressionContext.toAST(): Expression =
    when {
        ID()     != null -> Variable(ID().text)
        NUMBER() != null -> Literal(
            try { NUMBER().text.toInt() }
            catch(e: NumberFormatException) { NUMBER().text.toDouble() }
        )
        else -> BinaryExpression(left.toAST(), operator.text.toOperator(), right.toAST())
    }

fun String.toOperator(): Operator =
    when(this) {
        "+" -> Operator.PLUS
        "-" -> Operator.MINUS
        "*" -> Operator.TIMES
        "/" -> Operator.DIVISION
        else -> throw IllegalArgumentException("Unknown operator: $this")
    }