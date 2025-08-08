//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Túlio Thauã Dutra :D
    println("Digite o comprimento em cm: ")
    var comprimento = readln().toFloat()

    println("Digite a largura em cm: ")
    var largura = readln().toFloat()

    println("Digite a altura em cm: ")
    var altura = readln().toFloat()

    println("Digite o peso em Kg: ")
    var peso = readln().toFloat()

    var pesoCubico = (comprimento * largura * altura) * peso.toFloat()
    println("O peso cubico é: $pesoCubico") //valores usados: 30, 20, 10 e 3
}