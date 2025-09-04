/* TÚLIO THAUÃ DUTRA */
fun main() {

    //Creating the entry
    print("valor1: ")
    val auxValor1 = readln().toInt()

    print("valor2: ")
    val auxValor2 = readln().toInt()

    //Process
    val r = calcula(auxValor1,auxValor2)
    println("Resultado: $r")
}

//Method
fun calcula(valor1: Int, valor2: Int): Int{
    val resultado = valor1 + valor2
    return resultado
}


