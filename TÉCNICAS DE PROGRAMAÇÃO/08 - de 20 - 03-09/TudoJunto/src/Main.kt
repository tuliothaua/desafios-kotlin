/* ..##TULIO THAUÃ DUTRA :D*/
fun main() {

    //Primeira Chamada do Exercício:
    println("....................[Lista de Exercícios para executar]....................: \n" +
            ".....(1-Soma-Multiplica|2-PeoCubico)].....")
    print("> Escolha um exercício de 1 a 7, escolha 0 se deseja finalizar: ")
    var stop: Int = readln().toIntOrNull() ?: 0

    //Creating the Process
    while (stop != 0) {
        //Verificador do Número errado recebido
        if (stop > 7 || stop < 0) {
            println("..........[Valor Inválido!]..........")
            break
        }
        //Primeiro Exercício Implementado:
        else if (stop == 1){
            //Soma-Multiplica
            println("..........[Exercício escolhido: Numeros-Soma-Multiplica.]..........")
            print("> Digite o primeiro número em ponto flutuante: ")
            val x1 = readln().toDoubleOrNull() ?: 0.0

            print("> Digite o segundo número em ponto flutuante: ")
            val x2 = readln().toDoubleOrNull() ?: 0.0

            val aux = numerosSomaMultiplica(x1,x2)
            println("....................[O resultado final é: $aux.]....................")
        }
        else if (stop == 2){
            //Calcular Peso Cubico
            println("..........[Exercício escolhido: Calcular Peso Cubico.]..........")
            print("> Digite o comprimento em cm: ")
            val comprimento = readln().toFloat()
            print("> Digite a largura em cm: ")
            val largura = readln().toFloat()
            print("> Digite a altura em cm: ")
            val altura = readln().toFloat()
            print("> Digite o peso em kg: ")
            val peso = readln().toFloat()

            val aux = calcularPesoCubico(comprimento, largura, altura, peso)
            println("....................[O Peso Cubico é: $aux.]....................")

        }
        else if (stop == 3){
            //
            println("..........[Exercício escolhido: .]..........")


        }
        //Segunda Chamada do Próximo Exercício
        print("> Escolha um exercício de 1 a 7, escolha 0 se deseja finalizar: ")
        stop = readln().toInt()
    }
}

/* INVOCAÇÕES DOS EXERCÍCIOS */
//Invocação do Exercício Número 1
    fun numerosSomaMultiplica(valor1: Double, valor2: Double): Double {
        val soma = valor1 + valor2
        val resultado = soma * valor1
        return resultado
    }
//Invocação do Exercício Número 2
    fun calcularPesoCubico(comprimento: Float,largura: Float,altura: Float,peso: Float): Float{
        val pesoCubico = (comprimento * largura * altura) * peso
        return pesoCubico
    }
//Invocação do Exercício Número 3

