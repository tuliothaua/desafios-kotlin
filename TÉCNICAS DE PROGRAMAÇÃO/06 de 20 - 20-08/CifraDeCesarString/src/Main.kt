/*Escreva um programa chamado CifraDeCesarString que implemente algo semelhante ao algoritmo de
Cifra de César. • Deve receber um texto plano através de uma String e retornar ele cifrado.
• Deve receber um texto cifrado através de uma String e decifrar ele, retornando ele plano.*/

//Túlio Thauã Dutra >>

fun main(){

    //Creating the Entry
    print("...Type a text to encrypt it: ")
    val userSentence: String = readln()
    var newSentence = ""
    val step = 4

    //Spitting on the screen
    print("Old Sentence: $userSentence")

    //Processing
    for(i in userSentence){

        var newChar = i

        //Verifying if the letter is UPPERCASE
        if (i >= 'A' && i <= 'Z'){
            newChar = i + step
            if(newChar > 'Z') newChar -= 26
        }
        //Verifying if the letter is LOWERCASE
        else if (i >= 'a' && i <= 'z'){
            newChar = i + step
            if(newChar > 'z') newChar -= 26
        }
        //Replace the other symbols
        else if (i == ' '){
            newChar = '$'
        } else if (i == '-'){
            newChar = '1'
        }
        //Add the caracter to string
        newSentence += newChar
    }

    //Creating the Exit
    print("\nNew Sentence: $newSentence")
}