//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   //Túlio Thauã Dutra :D

    println("Informe o Nome: ")
    var nome: String = readln()

    println("Digite o seu salário atual: ")
    var salarioAtual: Double = readln().toDouble()

    var salarioNovo: Double = salarioAtual * 1.25

    println("Olá $nome, seu novo salário é: $salarioNovo")
}