/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   Pinned Game
 * Project Author: Aiden Sowerbutts
 * GitHub Repo:    GITHUB REPO URL HERE
 * ---------------------------------------------------------------------
 * Notes:
 * ???
 * =====================================================================
 */

// Controls the creation of the 16 boxes/squares

fun main() {

    // Title/Introduction to the game
    println("\uD83D\uDCCC Pinned game \uD83D\uDCCC")
    // Player/User input
    println("Please Enter Player 1 name here: ")
    val player1 = readln()

    println("Please Enter Player 2 name here: ")
    val player2 = readln()

    val players = listOf(player1, player2)

    val starter = players.random()

    println("\n$starter Goes first!")

    // introduction of the rules of the game
    println("Rules: " +
            "Welcome $player1,$player2. A row of 16 squares, numbered 1 to 16 from left to right\n" +
            "5 counters (total) are placed randomly on the board - 4 white and 1 black\n" +
            "\n$starter, It's Your turn currently")

    println("Please choose a counter...")

    readln()

    fun printAsHorizTable(items: List<Int>, width: Int = 3) {
        val count = items.size
        val line = "─".repeat(width + 2)
        val top = ("╭" + line) + ("┬" + line).repeat(count - 1) + "╮"
        val bot = ("╰" + line) + ("┴" + line).repeat(count - 1) + "╯"

        fun printAsCol(s: String) = print("│ ${s.padStart(width)} ")

        println(top)

        for (item in items) printAsCol("%,d".format(item))
        println("│")

        println(bot)
    }

    println("Congratulations!, you wasted your time because im not finished with this")

    fun playeable(counters: List<String>){

    var counter1 = ("⚪")

    var counter2 = ("⚫")
}

    val distances = (1..16).toList()

    printAsHorizTable(distances, 8)

    val board = (1..16).map { "Square $it" }
    board.chunked(5)

    for (i in 1..16) {

        val squares = mutableListOf<String>()

        fun printAsHorizTable(items: List<IntRange>) {

        }
    }
}