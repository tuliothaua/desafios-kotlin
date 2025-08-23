/*Repita a implementação do algoritmo de Cifra de César implementado anteriormente
utilizando string, criando agora o CifraDeCesarStringBuilder e implementando a solução
através de StringBuilder.*/

//Túlio Thauã Dutra >>
fun main (){

    //Creating the Entry
    print("...Type something my friend: ")
    val userTxt: String = readln()
    val builder = StringBuilder()

    //Processing
    for (i in userTxt) {
        builder.append(i+4) //Really easier and faster
    }
    //Creating the Exit
    println("Text Encrypted: $builder")
}