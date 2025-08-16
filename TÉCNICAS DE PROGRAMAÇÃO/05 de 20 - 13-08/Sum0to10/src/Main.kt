/*Crie um programa que some todos os números, de 0 até 10, exceto os múltiplos de 5 ou 3. Deve ser mostrada
todas as iterações, incluindo os valores descartados.*/

//Túlio Thauã Dutra >>
fun main(){
    //Creating Variables
    var sum: Int = 0

    //The Number Race
    for (i in 0..10){
        if(i % 3 == 0 || i % 5 == 0){
            println("Discarted: $i");
            continue
        }
        sum += i
        println("Current Value: $i, Total: $sum")
    }
}