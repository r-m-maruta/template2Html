import JsonGrammarParser.*

fun JsonContext.toAST(): JValue = value().toAST()

fun ValueContext.toAST(): JValue =
    when {
        `object`() != null -> `object`().toAST()
        array() != null  -> array().toAST()
        STRING() != null -> JString(
            STRING().text.trim('"'))
        NUMBER() != null -> JNumber(
            try { NUMBER().text.toInt() }
            catch (e: NumberFormatException) {NUMBER().text.toDouble() }
        )
        BOOLEAN() != null -> JBoolean(BOOLEAN().text == "true")
        NULL() != null -> JNull
        else -> throw IllegalArgumentException("Unknown value: ${this.text}")
    }

fun ObjectContext.toAST() : JObject =
    JObject(field().map {it.toAST()})

fun FieldContext.toAST() : JField =
    JField(STRING().text.trim('"'), value().toAST())

fun ArrayContext.toAST() : JArray =
    JArray(value().map {it.toAST()})

