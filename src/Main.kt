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

    println("Enter A Square number: ")
    
    val distances = (1..16).toList()

    printAsHorizTable(distances, 8)

    //Random Black Squares, every time the user plays the game it will be randomly generated from 1..16
    val nums = listOf(1..16)

    nums.size - 1..16

    nums[0]
    nums.first()
    nums.last()

    val sums = listOf(1..16)

    sums[0]

    val totalSquares = 16
    val blackSquareLimit = 5

    if (blackSquareLimit > 5) {



        val numberString = readln()

        val numberInt: Int = numberString.toInt()

        readln()
        println("Well, You Lost... You Had Chosen The Wrong Spots!, Now You Suffer The Consequences")
    }


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