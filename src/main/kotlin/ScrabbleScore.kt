import com.sun.tools.javac.Main

class ScrabbleScore {

    fun scoreWord(word: String): Int{
        //calculate using the scoreLetter method below, the scrabble value of the word passed as a parameter
        return word.sumOf{ scoreLetter(it) }
    }

    //the program if the user enters in any chars other than capital letters...try fix this.
    //Reference: https://exercism.org/tracks/kotlin/exercises/scrabble-score/solutions?page=1
    private fun scoreLetter(char: Char): Int {
        return when (char.uppercase()) {
            in "AEIOULNRST" -> 1
            in "DG" -> 2
            in "BCMP" -> 3
            in "FHVWY" -> 4
            in "K" -> 5
            in "JX" -> 8
            in "QZ" -> 10
            else -> 0
        }
    }

    fun letterValues() = """
        
        
           Letter                             Value
           A, E, I, O, U, L, N, R, S, T       1
           D, G                               2
           B, C, M, P                         3
           F, H, V, W, Y                      4
           K                                  5
           J, X                               8
           Q, Z                               10
           
           
           """.trimIndent()
}