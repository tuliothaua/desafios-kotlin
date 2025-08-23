/*Construir um programa que pede para o usuário:
• Uma string s,
• Um caractere ch1,
• Um caractere ch2. O programa deve substituir todas as ocorrências do caractere ch1
em s pelo caractere ch2.*/

//Túlio Thauã Dutra >>

fun main () {
    //Making the enty
    print("...Type something for String: ")
    var userMessage: String = readln()

    print("...Type the letter that you want to replace for another letter: ")
    val ch1: String = readln()

    print("...Type another letter that you want to replace the $ch1: ")
    val ch2: String = readln()

    //Processing
    for (i in userMessage){
        if (ch2[0] != i){
           userMessage = userMessage.replace(ch1,ch2)
            continue
        } else {
            println("...Something went wrong!")
            break
        }
    }
    //Making the exit
    println("...New sentence: $userMessage")
}