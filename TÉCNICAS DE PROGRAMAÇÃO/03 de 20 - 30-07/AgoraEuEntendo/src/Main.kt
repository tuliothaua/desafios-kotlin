//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  //Túlio Thauã Dutra :D

    println("Digite um primeiro valor: ")
    var x1: Byte = readln().toByte()

    println("Digite um segundo valor: ")
    var x2: Short = readln().toShort()

    println("Digite um terceiro valor: ")
    var x3: Int = readln().toInt()

    println("Digite um quarto valor: ")
    var x4: Long = readln().toLong()

    println("Digite um quinto valor: ")
    var x5: Float = readln().toFloat()

    var total: Double = (x1 + x2 + x3 + x4 + x5).toDouble()
    var valorMedio: Double = (x1 + x2 + x3 + x4 + x5) / 5.toDouble()
    var valor_Inteiro_Medio: Int = valorMedio.toInt()
    var parte_Inteira: Char = valor_Inteiro_Medio.toChar()

    println(total)
    println(valorMedio)
    println(valor_Inteiro_Medio)
    println(parte_Inteira)
}