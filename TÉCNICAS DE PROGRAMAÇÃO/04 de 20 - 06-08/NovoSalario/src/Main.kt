//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Túlio Thauã Dutra :D
    //Pedindo pro Usuário
    print("Digite o seu salário: ")
    val salarioAtual: Float = readln().toFloatOrNull() ?: 0.0.toFloat()
    var salarioNovo: Float = 0.0.toFloat()
    var diferencial: Float = 0.0.toFloat()
    print("Digite o código de seu Cargo: ")
    print("\n"+
          "1 - gerente 10%    \n"+
          "2 - engenheiro 20% \n"+
          "3 - técnico 30%    \n"+
          "4 - supervisor 10%   " +
          "\n...Digite: ")
    val codeCargo: Int = readln().toIntOrNull() ?: 5.toInt()
    //Atribuindo o salário novo
    when (codeCargo){
        1 -> salarioNovo = salarioAtual * 1.1.toFloat()
        2 -> salarioNovo = salarioAtual * 1.2.toFloat()
        3 -> salarioNovo = salarioAtual * 1.3.toFloat()
        4 -> salarioNovo = salarioAtual * 1.1.toFloat()
        else -> salarioNovo = salarioAtual * 1.4.toFloat()
    }
    diferencial = salarioNovo - salarioAtual
    //Guspindo na Tela
    println("Sálario Antigo: R$%.2f".format(salarioAtual))
    println("Sálario Novo: R$%.2f".format(salarioNovo))
    println("Diferença: +R$%.2f".format(diferencial))
}

