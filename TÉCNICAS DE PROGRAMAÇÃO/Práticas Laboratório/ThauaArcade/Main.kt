// ╔════════════════════════════════════════════════════╗
// ║  AUTHOR : Túlio Thauã Dutra                        ║
// ║  HANDLE : root@thaua                               ║
// ║  STATUS : Kotlin Learning Mode >> ACTIVE           ║
// ║  FILE   : Main.kt                                  ║
// ╚════════════════════════════════════════════════════╝

fun main() {

    //[VAR] :: MY B34UTY F1RE B4NN3R.x0Thaua
    val banner = """
    ________         _____                  ___________                       
    ___  __/__      ____(_)______________  ___  /___  /_______ ____  _______ _
    __  /  __ | /| / /_  /___  /__  /_  / / /  __/_  __ \  __ `/  / / /  __ `/
    _  /   __ |/ |/ /_  / __  /__  /_  /_/ // /_ _  / / / /_/ // /_/ // /_/ / 
    /_/    ____/|__/ /_/  _____/____/\__, / \__/ /_/ /_/\__,_/ \__,_/ \__,_/  
                                    /____/                                                                         
           t w i z z y t h a u a
    """.trimIndent()

    //[FUNC] :: THE "=" SEPARATOR
    val limit = banner.length
    var separator = "="
    for(i: Int in 0..limit step 7){
        separator += "="; i
    }

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
        print("\t[TYPE] :: > ")
        userDecision = readln().toInt()
    } while(true)
}
