sealed interface JValue

data class JObject(
    val fields: List<JField>
) : JValue

data class JNumber(
    val value: Number
) : JValue

data class JString(
    val value: String
) : JValue

data class JBoolean(
    val value: Boolean
) : JValue

data class JArray(
    val value: List<JValue>
) : JValue

data object JNull : JValue

data class JField(
    val name: String,
    val value: JValue
)