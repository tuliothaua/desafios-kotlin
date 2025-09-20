import kotlin.random.Random

// ╔════════════════════════════════════════════════════╗
// ║  AUTHOR : Túlio Thauã Dutra                        ║
// ║  HANDLE : root@thaua                               ║
// ║  STATUS : Kotlin Learning Mode >> ACTIVE           ║
// ║  FILE   : Main.kt                                  ║
// ╚════════════════════════════════════════════════════╝

fun main() {

    //[VAR] :: MY TW1ZZY B4NN3R.x0Thaua
    val banner = """
    ________         _____                  ___________                       
    ___  __/__      ____(_)______________  ___  /___  /_______ ____  _______ _
    __  /  __ | /| / /_  /___  /__  /_  / / /  __/_  __ \  __ `/  / / /  __ `/
    _  /   __ |/ |/ /_  / __  /__  /_  /_/ // /_ _  / / / /_/ // /_/ // /_/ / 
    /_/    ____/|__/ /_/  _____/____/\__, / \__/ /_/ /_/\__,_/ \__,_/ \__,_/  
                                    /____/                                                                         
           t w i z z y t h a u a
    """.trimIndent()
    
    //[VAR] :: THE "=" SEPARATOR!
    val separator = separator()

    //[EXEC] :: PRINT THE BANNER TO THE TERMINAL
    println(separator)
    println(banner)
    println(separator)

    //[INFO] :: HELLO WORLD, Welcome to my Program
    println("\n\t [Welcome friend to my GAME Program - What you wanna play?]")
    println("\n\t - [1] NAVAL BATTLE \t\t\t\t  [2] S3C0ND PR0GR4M -")
    println("\n\t [If you wanna stop the loop - just click the [0] to stop!]")
    println("\n" + separator)
    print("\t[TYPE] :: > ")

    //[VAR] :: USER DECISION
    var userDecision: Int
    userDecision = readln().toInt()

    //[LOOP] :: THE LOOP FROM VAR DECISION!
    do {
        when (userDecision) {
            1 -> {
                println(separator)
                println("\t[GAME CHOSEN] :: NAVAL BATTLE!")
                println(separator)
                battleNaval()

            }
            2 -> {
                println(separator)
                println("\t[INFO] :: IM SORRY IT WILL BE RELEASE SOON")
                println(separator)
            }
            0 -> {
                println(separator)
                println("\t[EXIT] :: ALRIGHT SCHYEAH!")
                println(separator)
                break
            }
            else -> {
                println(separator)
                println("\t[ERROR] :: YOU MUST CHOOSE ONLY [1], [2] OR [0] ")
                println(separator)
            }
        }

        println(separator)
        println("\t[YOU WANNA PLAY AGAIN? [1] OR LEAVE WITH [0]")
        print("\t[TYPE] :: > ")
        userDecision = readln().toInt()

    } while(true)
}

//[FUNC] :: THE "=" SEPARATOR
fun separator(): String {

    val banner = """
    ________         _____                  ___________                       
    ___  __/__      ____(_)______________  ___  /___  /_______ ____  _______ _
    __  /  __ | /| / /_  /___  /__  /_  / / /  __/_  __ \  __ `/  / / /  __ `/
    _  /   __ |/ |/ /_  / __  /__  /_  /_/ // /_ _  / / / /_/ // /_/ // /_/ / 
    /_/    ____/|__/ /_/  _____/____/\__, / \__/ /_/ /_/\__,_/ \__,_/ \__,_/  
                                    /____/                                                                         
           t w i z z y t h a u a
    """.trimIndent()

    val limit = banner.length
    var separator = "="
    for(i: Int in 0..limit step 7){
        separator += "="; i
    }
    return separator
}


//[FUNC] :: THE NAVAL BATTLE GAME
fun battleNaval() {

    //[VAR] :: IMPORTANT VARIABLES
    val board = Array(10) { Array(10) { 0 } }
    val totalShips = 5
    var tries = 15
    var points = 0

    //[VAR] :: COLORS
    val RED = "\u001B[31m"
    val GREEN = "\u001B[32m"
    val BLUE = "\u001B[34m"
    val RESET = "\u001B[0m"


    //[INFO] :: PUT THE NUMBERS IN THE NAVAL BATTLE TABLE
    var placed = 0
    val random = Random
    while (placed < totalShips) {
        val row = random.nextInt(0, 10)
        val col = random.nextInt(0, 10)
        if (board[row][col] == 0){
            board[row][col] = 1
            placed++
        }
    }

    //[INFO] :: GAME LOOP
    while (tries > 0 && points < totalShips){
        //[INFO] :: PRINT THE BOARD
        print("\t\t\t\t\t")
        for (c in 0 until 10) print("$c\t")
        println()
        for (i in board.indices){
            print("\t\t\t\t$i\t")
            for (c in board[i].indices){
                val symbol = when(board[i][c]){
                    -1 -> GREEN + "X" + RESET
                    -2 -> RED + "0" + RESET
                    else -> BLUE + "~" + RESET
                }
                print("$symbol\t")
            }
            println()
        }

        println(separator())

    //[INFO] :: USER GAME PLAY
    println("\t[CHOOSE A ROW (0-9):] ")
    print("\t[TYPE] :: > ")
    val row = readln().toInt()

    println("\t[CHOOSE A COLUMN (0-9)]:")
    print("\t[TYPE] :: > ")
    val col = readln().toInt()
    println(separator())

    if (board[row][col] == 1){
        separator()
        println(GREEN + "\t[YES!] :: YOU GOT IT! 🚤" + RESET)
        board[row][col] = -1
        points++
    } else if (board[row][col] == 0) {
        println(RED + "\t[NO!] :: JUST WATER FOR HERE! 💦" + RESET)
        board[row][col] = -2
    } else {
        println(BLUE + "\t[OPS!] :: YOU ALREADY HIT HERE TRY ANOTHER PLACE!" + RESET)
    }

    tries--
    println( BLUE + "\t[INFO] :: TRIES REMAINING: $tries" + RESET)
    println(separator())
    }
    if (points == totalShips) {
        println(GREEN + "\t[YUH!] :: CONGRATS YOU WON! 🏆" + RESET)
        println("[INFO] :: YOUR POINTS: $points")
    } else println(RED + "\t[OHH!] :: NO MORE ATTEMPTS - GAME OVER ❗" + RESET)
        println("[INFO] :: YOUR POINTS: $points")
}
