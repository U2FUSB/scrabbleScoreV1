import java.util.*

private val input = Scanner(System.`in`)
private val scrabbleScore = ScrabbleScore()

//TODO This program has bugs and incomplete code in it...you will need to fix them so you have the following functionality:
// The main method should:
//    - print out the letterValues to the console
//    - ask the user to enter a word
//    - display the Scrabble Score for the word (the case of the letters shouldn't matter i.e. u is the same as U)
//    - the user should be continually asked to enter a word until they type a sentinel value (e.g. -1) to end the program

fun main() {
    println(scrabbleScore.letterValues())
    while (true) {
        print("Enter a word and compute the Scrabble Score: ")
        val word = input.nextLine()
        //TODO change to use a string template:
        println(word + "has a value of" + scrabbleScore.scoreWord(word))
    }
}


