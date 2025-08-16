/*Crie um programa que com base na tabela Unicode, percorra os valores entre 33 e 126 (inclusive) e mostre em
tela seu caractere correspondente.*/

//Túlio Thauã Dutra >>
fun main() {

    //Creating Variables
    val thirdythree: Int = 33
    val onetwentysix: Int = 126
    var showCaractere: Char

    //Process
    for (i in thirdythree..onetwentysix){
        showCaractere = i.toChar()
        println("Number: $i = Caractere: $showCaractere")
    }

}