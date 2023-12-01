package screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
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

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = quiz.questions[questionIndex].label,
                style = MaterialTheme.typography.h4,
                modifier = Modifier
                    .padding(8.dp),
                textAlign = TextAlign.Center
            )
        }

        quiz.questions[questionIndex].answers.forEachIndexed { index, answer ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable { selectedAnswer = answer.id }

            ) {
                RadioButton(
                    selected = selectedAnswer == answer.id,
                    onClick = { selectedAnswer = answer.id }
                )

                Text(
                    text = answer.label,
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 8.dp),
                )
            }
        }

        Button(
            onClick = {
                if (selectedAnswer == quiz.questions[questionIndex].correctAnswerId) {
                    score++
                }
                questionIndex += 1
                selectedAnswer = 0
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Icon(imageVector = Icons.Default.ArrowForward, contentDescription = null, tint = Color.White)
                Text(text = "Next", modifier = Modifier.padding(start = 8.dp))
            }
        }
        LinearProgressIndicator(
            progress = (questionIndex.toFloat() / quiz.questions.size.toFloat()),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Row {
            Text(
                text = "score : " + score.toString() + "/" + questionIndex.toInt()
            )
        }
    }
}