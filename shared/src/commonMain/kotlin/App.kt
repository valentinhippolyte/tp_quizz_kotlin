import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import composables.QuestionComposable
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
       /* val welcome = Welcome("APPQUIZZ", "Bienvenue dans la meilleur app !")*/
        val proposals: Array<String> = arrayOf("1", "2", "3", "4")
        val questions: Array<String> = arrayOf("Question 1", "Quest2", "Quest3", "Quest4", "Quest5", "Quest6")

        QuestionComposable(questions, proposals, 2, 1)
        /*ScoreComposable(
            score = 8,
            totalScore = 10,
            onRetakeClick = {}
        )*/
    }
}

expect fun getPlatformName(): String