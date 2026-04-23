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

//This does something (it creates the boxes)
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

fun main() {

    println("\uD83D\uDCCCPinned game \uD83D\uDCCC")
    // Player/User input
    println("Please Enter Player 1 name here: ")
    val player1 = readln()

    println("Please Enter Player 2 name here: ")
    val player2 = readln()

    val players = listOf(player1, player2)

    val starter = players.random()

    println("\n$starter Goes first!")

    println(" Totally Not A RickRoll --> https://www.youtube.com/watch?v=dQw4w9WgXcQ ")

    //working on scoring system. . .

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