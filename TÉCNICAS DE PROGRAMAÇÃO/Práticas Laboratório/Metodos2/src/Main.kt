/* TÚLIO THAUÃ DUTRA */
fun main() {

    //Creating the entry
    val r = calcula(10,10)
    val c = calcula(10.50, 10.50)
    println("Resultado: $r")
    println("Resultado: $c")
}

//Method
fun calcula(valor1: Int, valor2: Int): Int{
    val resultado = valor1 + valor2
    return resultado
}

//Variação do calcula: Sobrecarga
fun calcula(valor1: Double, valor2: Double): Double{
    val resultado = valor1 + valor2
    return resultado
}
