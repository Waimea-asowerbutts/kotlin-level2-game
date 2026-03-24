/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:   PROJECT NAME HERE
 * Project Author: PROJECT AUTHOR HERE
 * GitHub Repo:    GITHUB REPO URL HERE
 * ---------------------------------------------------------------------
 * Notes:
 * PROJECT NOTES HERE
 * =====================================================================
 */


fun printAsHorizTable(squares: List<String>, width: Int = 10) {
    squares.size
    val line="─".repeat(width + 2)
    val top = "╭$line╮"
    val bot = "╰$line╯"

    fun printAsCol(s: String) = print("│ ${s.padStart(width)} ")

    println(top)

    for (square in squares)
        printAsCol("%,d".format(square))

    println("│")

    println(bot)
}

fun main() {

    val board = (1..16).map { "Square $it" }
    board.chunked(5)

    println("Pinned game")

    for (i in 1..16) {

        val squares = mutableListOf<String>()


        squares.add("Square $i")

        println(squares)

        println("╭────────────╮")
        println("│            │")
        println("╰────────────╯")

    }
}