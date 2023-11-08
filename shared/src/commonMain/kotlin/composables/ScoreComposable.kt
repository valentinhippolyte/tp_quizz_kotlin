import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun ScoreComposable(score: Int, totalScore: Int, onRetakeClick: () -> Unit) {
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