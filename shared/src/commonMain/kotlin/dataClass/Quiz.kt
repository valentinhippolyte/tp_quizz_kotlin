package dataClass
@kotlinx.serialization.Serializable
data class Quiz(
    val questions: List<Question>
)
