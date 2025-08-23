/*Uma palavra é denominada um palíndromo se for invertida e a
leitura da mesma permanecer sem nenhuma alteração.*/

//Túlio Thauã Dutra >>

fun main(){

    //Making the Entry
    print("...[Detector of Palindrome]\n...type a word and find out if its a palindrome: ")
    val wordUser: String = readln()
    val reversedWord: String = wordUser.reversed()

    //Processing the exit
    if(reversedWord == wordUser)
          println("...$wordUser is a palindrome")
     else println("...$wordUser is not a palindrome")
}