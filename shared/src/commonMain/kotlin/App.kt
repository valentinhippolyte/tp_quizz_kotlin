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
                   "Qu'est-ce qu'un langage de programmation ?",
                   3,
                   listOf(
                       Answer(0,"Un manuel d'instructions"),
                       Answer(1,"Un outil pour réparer les ordinateurs"),
                       Answer(2,"Une méthode de communication entre les humains"),
                       Answer(3,"Un ensemble de règles grammaticales pour écrire du code"),
                   )
               ),
               Question(
                   1,
                   "Quel est le rôle d'un fichier avec l'extension \".html\" dans le développement web ?",
                   1,
                   listOf(
                       Answer(0,"Stocker des données sensibles"),
                       Answer(1,"Définir la structure d'une page web"),
                       Answer(2,"Exécuter des scripts côté serveur"),
                       Answer(3,"Contrôler les animations sur une page"),
                   )
               ),
               Question(
                   2,
                   "Qu'est-ce qu'une boucle dans la programmation?",
                   1,
                   listOf(
                       Answer(0,"Un bug difficile à résoudre"),
                       Answer(1,"Une structure de contrôle répétitive"),
                       Answer(2,"Un type de virus informatique"),
                       Answer(3,"Un moyen de crypter des données"),
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