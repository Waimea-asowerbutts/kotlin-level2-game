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

    println("Pinned game")

    // Player input
    println("...you start: ")

    readln()

    // attempting to make player turns
    val players = listOf("Player One", "Player Two")
    println(players[0])
    println(players[1])

    // har harr har har harrr, har har har har harrrrrr, har har har har, har har har harrrrrrrrrrrrrrr
    println(" Totally Not A RickRoll --> https://www.youtube.com/watch?v=dQw4w9WgXcQ ")

    println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⢳⠃⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠀⠀⠀⠀⠀⡀⠀⠀⠀⠼⢿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠉⠀⠀⠈⠉⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⠿⠟⠛⠋⠛⠻⠿⢿⣿⣿⣿⣿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠈⠉⠁⠀⠀⠀⠙⠻⢿⣿⣿⡿⠡⠐⠁⠀⠀⠀⠀⠀⠀⠀⡈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠹⠿⠿⠛⠀⠀⠀⠀⠀⢰⢶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⡇⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⡀⠀⠀⠀⠀⣾⣴⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⡇⢻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠄⠀⡀⠀⠀⣀⡀⢀⣘⣻⣻⡿⣿⣷⣄⣀⣞⣿⡖⠀⠿⣦⠀⠀⠀⠀⠀⠀⠀⠀⣀⠠⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣷⡈⠲⡀⠀⠀⠀⣠⠎⠠⠀⠀⠀⠀⠐⢀⢂⢱⠟⠎⢙⣋⣉⡓⠘⠫⠜⣣⡿⠛⣅⡘⠓⣻⡧⠀⡄⣤⣀⡀⠐⠊⣁⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣶⣦⣤⣤⣾⡏⢠⠶⠿⢿⣿⣷⣦⠀⠀⠀⠠⠾⠛⠻⣿⣿⣷⣆⠀⠉⠁⢀⠸⠇⠈⢧⠀⠀⠀⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⡇⠀⠀⢸⣿⣿⣿⠇⠀⠀⠰⡀⠀⠐⣼⣿⣿⠟⠀⠀⠀⣼⣦⣤⠐⢬⠆⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠙⠲⠾⠿⠛⠋⠁⠀⠀⠀⠀⠙⠛⠛⠛⠋⠁⠀⠀⠀⢀⣿⣿⠇⠘⠞⠣⠄⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠩⠈⠀⠱⢀⡀⢀⠀⠀⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠄⠰⣞⠶⣦⣄⣠⣶⣦⠀⢀⣶⣦⣾⣿⣗⡀⢁⠀⢀⣀⠀⠀⠂⠀⠀⠀⣧⠘⣷⣄⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⣿⠁⠀⣄⣺⣥⢛⣶⣿⣿⣿⣿⢠⣿⣿⣿⢿⡛⡿⣿⣿⣷⣾⣟⣉⣻⡷⢀⠀⠀⢸⠀⠽⠙⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⣿⡀⢸⣿⣻⢃⣾⡿⣿⣿⣿⣿⠰⣿⣿⣿⣯⣿⣶⣿⣿⣿⣿⣿⢋⣻⢢⣀⠁⠀⠈⠐⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠉⠀⠻⢛⣿⣿⣿⣧⣾⡀⣘⡿⣿⣿⢻⣆⠻⣟⣿⣿⠷⠋⡉⠀⠁⠀⠀⠀⢠⡄⠀⠀⠀⣀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣤⡄⠀⠁⠈⠀⠀⠀⠈⠀⠀⠀⠁⠈⠀⠀⠀⢀⡀⠀⠀⣄⢀⠀⠀⠀⢈⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠤⠀⠠⠐⠤⠐⠖⠂⠀⣐⠩⠉⠀⠈⠁⠀⠀⠀⠀⢨⠇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⣴⠆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⠀⠀⠀⠀⢐⠇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠛⣋⣀⡀⢀⣀⡀⠀⠀⠀⠀⠀⠀⣀⣀⠀⢦⠇⠀⢀⣀⠞⠛⠀⠈⠙⠛⠛⠛⠛⠻⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⣿⡿⠛⢉⠀⠀⣄⣀⠀⠀⠈⠙⠃⠘⠛⠛⠀⠀⠺⠿⠇⠘⠛⠛⠀⠀⢀⣤⣤⡽⠟⠁⠀⠀⠀⠠⣄⠀⠀⡀⠀⠀⠈⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⣿⣿⠋⣠⣔⠛⠂⠀⠻⢻⣗⣴⢤⢀⣀⢤⡀⢠⡀⠀⠀⠀⠀⣀⡀⠀⠐⢲⠚⠛⠀⠁⠀⠀⠀⠀⠀⠀⢺⣷⣼⣿⡿⠆⠀⠀⠀⠀⠀⠈⠙⠻⢿⣿⣿⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⣿⡿⠁⢼⠑⠉⠀⠀⠀⠀⠀⠈⠁⠈⠁⠸⠟⠻⢟⠫⣤⠀⠐⠠⠐⠙⠀⠀⠀⠀⠀⠀⠀⡀⢿⠆⠄⠀⠀⣙⠿⠛⠁⠤⠀⠀⠀⡀⣄⠀⠸⣤⣄⡀⠉⠻⣿⣿⣿⣿⣿")
    println("⣿⣿⣿⣿⡿⠁⢷⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⢰⠀⣄⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⡐⣿⣿⣷⣷⣿⣿⣧⣠⡀⠈⠻⣿⣿⣿")
    println("⣿⣿⣿⣿⠏⢐⢸⡿⢧⠀⠢⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠃⠀⢠⠋⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠾⣾⣿⢿⣿⣿⣿⣾⢿⣦⡀⠘⢿⣿")
    println("⣿⣿⠟⠋⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⣤⣦⡌⣳⣿⣄⡀⠀⠀⠀⠂⠠⠠⠚⠁⠿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢹⢟⣻⣽⣿⣿⣿⣿⢽⣿⣤⡈⢿")
    println("⠏⣡⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢄⢰⣟⡣⠶⠗⠃⣰⢚⠋⠿⢿⣿⣿⠷⠦⠤⡠⢤⠀⠴⢶⣤⣴⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠉⠵⠝⡳⠶⠌⢻⡻⠶⠧⠈")

// Randomised counters between both players (limit of players is two)
    fun counters() {
    println("White Counter")
    println("Black Counter")

    }

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

    // Working on a limiter, making it say you lost or will count towards being incorrect for the counters.

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

//⠀⣶⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀//
//⢰⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀//
//⠈⢿⣿⣿⣿⣗⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀//
//⠀⠘⣿⣿⣿⣿⣷⣬⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀//
//⠀⠀⠈⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀//
//⠀⠀⠀⣿⣿⣿⣿⡃⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀//
//⠀⠀⠀⢻⣿⣯⣅⣰⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀//
//⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⢀⠤⠶⢶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀//
//⠀⠀⠀⠀⣿⣿⣿⣿⣿⡏⠀⠀⠀⣼⣧⡀⠀⠀⠈⠛⣆⠀⠀⠀⠀⠀⠀⠀//
//⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⠀⠀⣰⣿⣟⠿⣗⠾⢺⣦⡸⠀⠀⠀⠀⠀⠀⠀//
//⠀⠀⠀⣿⣿⣿⣿⣿⣯⣿⡄⠀⢹⣿⣿⠳⡄⣿⣤⠉⡁⠀⠀⠀⠀⠀⠀⠀//
//⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⡇⠀⠀⢹⣿⣡⡻⠿⢟⢠⠁⠀⠀⠀⠀⠀⠀⠀//
//⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⡧⡀⢠⣾⣿⣿⣿⣶⣶⠇⠀⠀⠀⠀⠀⠀⠀⠀//
//⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⢇⠁⠰⣄⡀⠙⢸⣽⢁⠀⠀⠀⠀⠀⠀⠀⠀⠀//
//⠀⠀⠀⠀⣿⣿⣿⣿⣿⡿⡼⣁⣀⣜⣶⣤⡀⠑⠄⠠⠀⠀⠀⠀⠀⠀⠀⠀//
//⠀⠀⠀⠀⠘⣿⣿⣿⣻⡟⠟⣿⣇⠀⠉⡉⢷⢄⡸⠀⠐⠀⡀⠀⠀⠀⠀⠀//
//⠀⠀⠀⠀⠀⢻⣿⣿⣼⢠⢠⣿⣿⡇⠀⠀⠘⣶⠧⣫⠉⢀⠀⠠⠀⠀⠀⠀//
//⠀⠀⠀⠀⠀⢸⣿⣿⣿⣯⠚⣿⣿⣗⠒⠀⠀⠀⢏⣮⡅⠘⠳⣄⠳⠀⠀⠀//
//⠀⠀⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⡷⠆⠀⡀⠈⠹⣶⣤⠀⢉⠄⢂⠀⠀//
//⠀⠀⠀⠀⠀⠀⢻⣻⣿⣿⣿⣿⣿⣿⣿⣶⣦⡇⣥⡢⠸⣷⢦⣘⠓⢪⡀⠀//
//⠀⠀⠀⠀⠀⢀⡜⠩⠭⠉⠉⠉⠙⠛⠿⠿⣿⣹⣿⡿⠇⠀⠋⠛⠆⡿⢃⠀//
//⠀⠀⠀⠀⢀⢯⣄⡀⠀⢀⢴⠀⠠⠀⠀⠀⢈⣨⣤⢄⣀⠀⠀⣆⠀⠑⢬⡆//
//⠀⠀⠀⢀⠂⠀⠟⠋⠍⠋⡌⠀⠀⠀⠀⠀⡌⠈⢿⣯⣷⡀⣀⣿⣀⠀⠀⠈//
//Auf der Heide blüht ein kleines Blümelein) Auf der Heide blüht ein kleines Blümelein Und das heißt: Erika. Heiß von hunderttausend kleinen Bienelein Wird umschwärmt: Erika. Denn ihr Herz ist voller Süßigkeit, Zarter Duft entströmt dem Blütenkleid. Auf der Heide blüht ein kleines Blümelein Und das heißt: Erika.