/* ..##TULIO THAUÃ DUTRA :D*/
fun main() {

    //Primeira Chamada do Exercício:
    println("....................[Lista de Exercícios para executar]..................... \n" +
            "...(1-SomaMultiplica|2-PesoCubico|3-InverterValores|4-SomenteUmNúmero)......\n" +
            "............(5-InfoNome|6-CifraCesarString|7-CifraCesarBuilder).............\n")
    print("> Escolha um exercício de 1 a 7, escolha 0 se deseja finalizar: ")
    var stop: Int = readln().toIntOrNull() ?: 0

    //Creating the Process
    while (stop != 0) {
        //Verificador do Número errado recebido
        if (stop > 7 || stop < 0) {
         println("..............................[Valor Inválido!].............................")
         break
        }
        //Primeiro Exercício Implementado:
        else if (stop == 1){
            //Soma-Multiplica
            println("\n..........[Exercício escolhido: Numeros-Soma-Multiplica.]..........")
            print("> Digite o primeiro número em ponto flutuante: ")
            val x1 = readln().toDoubleOrNull() ?: 0.0

            print("> Digite o segundo número em ponto flutuante: ")
            val x2 = readln().toDoubleOrNull() ?: 0.0

            val aux = numerosSomaMultiplica(x1,x2)
            println("..............[O resultado final é: ${"%.2f".format(aux)}]...............")


        }
        else if (stop == 2){
            //Calcular Peso Cubico
            println("\n..........[Exercício escolhido: Calcular Peso Cubico.]..........")
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
            //Inverter Valores
            println("\n..........[Exercício escolhido: Inverter Valores.]..........")
            print("> Digite um valor A: ")
            val valorA: Int = readln().toIntOrNull() ?: 0

            print("> Digite um valor B: ")
            val valorB: Int = readln().toIntOrNull() ?: 0

            val aux = inverterValores(valorA,valorB)
            println("..............[Valor A: ${aux.first} | Valor B: ${aux.second}]..............")

        }
        else if (stop == 4){
            //Sorteio
            println("\n..........[Exercício escolhido: Somente Um Número.]..........")
            val aux = somenteUmNumero()
            println(".....[Primeiro número divisível por 11, 13 e 17: $aux].....")
        }
        else if (stop == 5){
            //Info Nome
            println("\n..........[Exercício escolhido: Info Nome.]..........")

            print("> Digite o seu nome: : ")
            val name: String = readln()
            val aux = infoNome(name)
            println(".....[${aux}].....")
        }
        else if (stop == 6){
            //Cifra de Cesar com STRING
            println("\n..........[Exercício escolhido: Cifra de Cesar com STRING.]..........")
            print("> Digite um Texto para cifrar: ")
            val userSentence = readln()

            val aux = cifraString(userSentence)

            println(".....[Frase Antiga: ${userSentence}]" +
                    "\n.....[Frase Nova: ${aux}].....")

        }
        else if (stop == 7){
            //Cifra de Cesar com String Builder
            println("\n..........[Exercício escolhido: Cifra de Cesar com STRING BUILDER.]..........")
            print("> Digite um Texto para cifrar: ")
            val userTxt: String = readln()
            val aux = cifraString(userTxt)

            println(".....[Texto Cifrado: $aux].....")

        }
        else {
            println("..............................[Valor Inválido!].............................")
            break
        }
        //Segunda Chamada do Próximo Exercício
        print("\n> Escolha um exercício de 1 a 7, escolha 0 se deseja finalizar: ")
        stop = readln().toInt()
    }
    //Saída do While
    println(".................................[ATÉ LOGO!]................................")
}

///////////////////////////////
/* INVOCAÇÕES DOS EXERCÍCIOS */
///////////////////////////////

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
    fun inverterValores(valorA: Int, valorB: Int): Pair<Int, Int> {
    var b = valorB
    var a = valorA
        a = a + b /*a + b = 5 agora o a vale 5*/
        b = a - b /*5 - 3 = 2 agora o b vale 2*/
        a = a - b /*5 - 2 = 3 agora o a vale 3*/

    return Pair(a, b)
    }
//Invocação do Exercício Número 4
    fun somenteUmNumero(): Int {
    var resultado = 0
    for (i in 1..1000001) {

        if (i % 11 != 0 || i % 13 != 0 || i % 17 != 0) {
            continue
        }
        resultado = i
        break

    }
    return resultado
    }
//Invocação do Exercício Número 5
    fun infoNome(valor1: String): List<String> {
    var valueInt = 0
    var result: Float
    var resultInt = 0
    var resultFra: Float
    val nameGet = valor1
    val tudo = mutableListOf<String>()

    for (i in nameGet) {
        valueInt = i.code //Value Int
        result = valueInt / 4.toFloat() // Result of valueInt divide by four
        resultInt = result.toInt() // Result in Int of result divide by four
        resultFra = result - resultInt.toFloat() // Result in Float of result divide by four
        tudo.add("\n$i. = $valueInt = $valueInt/4 = $result, $resultInt, $resultFra, " + valueInt % 4)
    }
    return tudo
    }
//Invocação do Exercício Número 6
    fun cifraString(userValue: String): String{
        val oldSentece = userValue
        var newSentence = ""
        val step = 4

    for(i in oldSentece){

        var newChar = i

        //Verifying if the letter is UPPERCASE
        if (i >= 'A' && i <= 'Z'){
            newChar = i + step
            if(newChar > 'Z') newChar -= 26
        }
        //Verifying if the letter is LOWERCASE
        else if (i >= 'a' && i <= 'z'){
            newChar = i + step
            if(newChar > 'z') newChar -= 26
        }
        //Replace the other symbols
        else if (i == ' '){
            newChar = '$'
        } else if (i == '-'){
            newChar = '1'
        }
        //Add the caracter to string
        newSentence += newChar
        }

        return newSentence
    }

