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
    for(i in 0..limit step 7){
        separator += "="
    }

    //[EXEC] :: PRINT THE BANNER TO THE TERMINAL
    println(separator)
    println(banner)
    println(separator)

    //[INFO] :: HELLO WORLD, Welcome to my Program
    println("\n\t [Welcome friend to my GAME Program - what you wanna play?]")
    println("\n\t [1]BATALHA NAVAL \t\t\t  [2]S3C0ND PR0GR4M")
    println("\n" + separator)
    print("\n [TYPE] :: > ")

    //[VAR] :: User Decision
    var userDecision = readln().toInt()

    if(userDecision == 1){
        println(1)
    } else if (userDecision == 2){
        println(2)
    }
}
