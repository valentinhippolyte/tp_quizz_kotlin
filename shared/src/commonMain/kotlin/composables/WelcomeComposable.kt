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

data class Welcome(
    val title: String,
    val description: String
)
@Composable
fun WelcomeComposable(welcome: Welcome) {
    Box {
        Card {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colors.background)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = welcome.title,
                    style = MaterialTheme.typography.h4,
                    modifier = Modifier.padding(8.dp)
                )

                Text(
                    text = welcome.description,
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(8.dp)
                )

                Button(
                    onClick = {},
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "Allez au quizz")
                }
            }
        }
    }
}