package screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dataClass.Quiz

fun Text(text: Int) {

}

@Composable
fun QuestionScreen(
    quiz: Quiz,
) {
    var questionIndex by remember { mutableStateOf(0) }
    var selectedAnswer by remember { mutableStateOf(1) }
    var score by remember { mutableStateOf(0) }


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = quiz.questions[questionIndex].label,
                style = MaterialTheme.typography.h4,
                modifier = Modifier.padding(8.dp)
            )

            quiz.questions[questionIndex].answers.forEachIndexed { index, answer ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable {selectedAnswer = answer.id}
                ) {
                    RadioButton(
                        selected = selectedAnswer == answer.id,
                        onClick = { selectedAnswer = answer.id}
                    )

                    Text(text = answer.label,
                        style = MaterialTheme.typography.body1,
                        modifier = Modifier.width(8.dp),
                    )
                }
            }

            Button(
                onClick = {
                    if (selectedAnswer == quiz.questions[questionIndex].correctId) {
                        score++
                    }
                    questionIndex += 1
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "Valider")
            }
            LinearProgressIndicator(
                progress = (questionIndex.toFloat() / quiz.questions.size.toFloat()),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            Row {
                Text(
                    text = "score : " + score.toString()
                )
            }
        }
    }

}