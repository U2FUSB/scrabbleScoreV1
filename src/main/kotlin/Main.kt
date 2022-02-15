import java.util.*

private val input = Scanner(System.`in`)
private val scrabbleScore = ScrabbleScore()
private var end = false

fun main() {
    println(scrabbleScore.letterValues())
    do {
        print("Enter a word and compute the Scrabble Score: ")
        val word = input.nextLine()
        //change to use a string template:
        if (!word.contains("-1")) println("$word has a value of ${scrabbleScore.scoreWord(word)}")
        else end = true
    } while (!end)
}


