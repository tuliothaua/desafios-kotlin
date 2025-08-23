/*Construir um programa que conta e imprime o número de
ocorrências de uma letra, fornecida pelo usuário, em uma dada
string, também digitada pelo usuário.*/

//Túlio Thauã Dutra >>

fun main(){
    //Making the Entry
    println("...Find out how many letters there is in your word!")
    print("...Type something: ")

    //Creating the Variables
    val wordUser: String = readln()
    var counterLetter = 0

    //Catching the letter
    print("...Choose a letter for search: ")
    val letterChosen: String? = readlnOrNull()

    //Data Processing
    if (letterChosen != null) {
        for (i in wordUser){
            if (letterChosen[0] == i){
                counterLetter++
            } else {
                continue
            }
        }
    }
    //Making Exit
    println("...Quantity of letters: $counterLetter")
}