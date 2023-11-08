package screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp


@Composable
fun ScoreScreen(score: Int, totalScore: Int, onRetakeClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            // Première ligne : Score
            Text(
                text = "Score",
                style = MaterialTheme.typography.h4,
                modifier = Modifier.padding(8.dp)
            )

            // Deuxième ligne : Score sur le total de score
            Text(
                text = "Votre score : $score / $totalScore",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(8.dp)
            )

            // Bouton "Retake the Quiz"
            Button(
                onClick = { onRetakeClick() },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "Retake the Quiz")
            }
        }
    }
}