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
    println("Pinned game")

    val distances = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)
    printAsHorizTable(distances, 8)


    val board = (1..16).map { "Square $it" }
    board.chunked(5)



    for (i in 1..16) {

        val squares = mutableListOf<String>()

        fun printAsHorizTable(items: List<IntRange>) {

            val scores = listOf(1..16)
            printAsHorizTable(scores)
        }
    }
}