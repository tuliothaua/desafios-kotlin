import kotlin.random.Random
fun main() {
        //Túlio Thauã Dutra :D

        //Gerando um número aleatório de 0 á 10.
        val valorAleatorio = Random.Default.nextInt(0, 10)


        //Pedindo pro usuário informar um número e armazenar em uma variável.
        print("Digite um valor de 0 a 10: ")
        val valorUsuario: Int = readln().toIntOrNull() ?: 0

        //Comparando os valores recebidos
        if (valorUsuario != valorAleatorio){
                if (valorUsuario > 10){println("O valor [$valorUsuario], está fora do limite desejado.")}
                else if (valorUsuario < 0){println("O valor [$valorUsuario], está fora do limite desejado.")}
                else if (valorAleatorio > valorUsuario ){println("Errou! Deveria ter digitado um valor maior!")}
                else if (valorUsuario > valorAleatorio){println("Errou! Deveria ter digitado um valor menor!")}}
        else {println("Parabéns! Você acertou o número!")}

        //Guspindo na tela
        println(valorUsuario)
        println(valorAleatorio)
}