/*Crie um programa que solicite para o usuário digitar seu nome. Após, percorra todos os caracteres do nome digitado, converta o
caractere ativo para inteiro e divida por 4, mostrando em tela os
seguintes dados de cada um dos caracteres:
O caractere
O valor inteiro
A divisão realizada
O resultado da divisão
A parte inteira da divisão
A parte fracionada da divisão
O resto da divisão

Mostrar os dados solicitados conforme o exemplo ao lado.*/

//Túlio Thauã Dutra >>

fun main (){

    //Getting the information
    var valueInt: Int = 0
    var result: Float
    var resultInt: Int = 0
    var resultFra: Float

    print("Type your name: ")
    val name: String = readln() ?: "Unknown"
    println(name)

    //Process
    for (i in name){
        valueInt = i.toInt() //Value Int
        result = valueInt / 4.toFloat() // Result of valueInt divide by four
        resultInt = result.toInt() // Result in Int of result divide by four
        resultFra = result - resultInt.toFloat() // Result in Float of result divide by four

        println("$i = $valueInt = $valueInt/4 = $result, $resultInt, $resultFra, " + valueInt % 4)
    }
}
