import kotlin.random.Random

// ╔════════════════════════════════════════════════════╗
// ║  AUTHOR : Túlio Thauã Dutra                        ║
// ║  HANDLE : root@thaua                               ║
// ║  STATUS : Kotlin Learning Mode >> ACTIVE           ║
// ║  FILE   : randomnumber.kt                          ║
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
    val randomNumber = List(1) {Random.nextInt(0, 20)}
    println("\t[The random number generated is $randomNumber]")
    
    val chooseNumber = 10
    println("\t[You choose the number: $chooseNumber]")
    val auxRamber = randomNumber[0]
    
    if(chooseNumber != auxRamber){
        if (chooseNumber > auxRamber){
      	println("\t[The random number is lower!]")}
      	else {println("\t[The random number is bigger!]")}}
      	else {println("\t[You got the number right!]")
    }
}
