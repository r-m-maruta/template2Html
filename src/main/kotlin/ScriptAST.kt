sealed interface ScriptAST

data class Assign(
    val varId: String,
    val expression: Expression
) : ScriptAST

data class If(
    val condition: Expression
) : ScriptAST

data object Else :  ScriptAST

data object End : ScriptAST

data class Access(
    val varId: String,
) : ScriptAST

sealed interface Arg

data class ArgId(
    val name: String
) : Arg
data class ArgString(
    val value: String
) : Arg
data class ArgNumber(
    val value: Number
) : Arg

data class Shortcode(
    val name: String, val args: List<Arg>
) : ScriptAST

sealed interface Expression

data class Literal(
    val value: Number
) : Expression

data class Variable(
    val varId: String
) : Expression

data class BinaryExpression(
    val left : Expression,
    val operator : Operator,
    val right : Expression
) : Expression

enum class Operator{
    PLUS, MINUS, TIMES, DIVISION;
}