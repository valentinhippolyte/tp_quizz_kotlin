import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import dataClass.Answer
import dataClass.Question
import dataClass.Quiz
import screens.QuestionScreen
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    MaterialTheme {
       // use data classes :
       val quiz = Quiz(
           listOf(
               Question(
                   0,
                   "Question 1",
                   0,
                   listOf(
                       Answer(0,"A"),
                       Answer(1,"B"),
                       Answer(2,"C"),
                       Answer(3,"D"),
                   )
               ),
               Question(
                   1,
                   "Question 2",
                   0,
                   listOf(
                       Answer(0,"A"),
                       Answer(1,"B"),
                       Answer(2,"C"),
                       Answer(3,"D"),
                   )
               ),
               Question(
                   2,
                   "Question 3",
                   0,
                   listOf(
                       Answer(0,"A"),
                       Answer(1,"B"),
                       Answer(2,"C"),
                       Answer(3,"D"),
                   )
               )
           )
       )
        QuestionScreen(quiz)
        /*ScoreScreen(
            score = 8,
            totalScore = 10,
            onRetakeClick = {}
        )*/
    }
}

expect fun getPlatformName(): String