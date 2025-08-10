
fun main() {
    //Túlio Thauã Dutra :D

    //Lendo Valor A
    print("Digite um valor A: ")
    var valorA: Int = readln()?.toIntOrNull() ?: 0

    //Lendo Valor B
    print("Digite um valor B: ")
    var valorB: Int = readln()?.toIntOrNull() ?: 0
    
    valorA = valorA + valorB /*a + b = 5 agora o a vale 5*/
    valorB = valorA - valorB /*5 - 3 = 2 agora o b vale 2*/
    valorA = valorA - valorB /*5 - 2 = 3 agora o a vale 3*/
    println("Valor A: $valorA")
    println("Valor B: $valorB")
}
