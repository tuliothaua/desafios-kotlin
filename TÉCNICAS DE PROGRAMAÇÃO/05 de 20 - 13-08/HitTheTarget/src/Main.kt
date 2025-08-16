/* Escreva um programa onde o usuário tem que acertar um valor numérico oculto:
• Programa sorteia e armazena um número inteiro aleatório entre 0 e 99.
• Pesquise sobre Random
• Em seguida o programa deve permitir que o usuário informe um número entre 0 e 99
para tentar acertar o valor sorteado.
• Em cada tentativa o usuário deve receber um feedback, informando se:
• O valor digitado esta fora da faixa de valor permitida;
• Ele acertou o valor, dando os parabéns;
• Se ele errou o valor, devendo nesse caso ser dada uma dica para ele tentar
novamente com um valor MAIOR ou MENOR que o digitado.
• O programa somente deve encerrar quando o usuário acertar o número sorteado ou
então quando ele resolver desistir, devendo para isso informar o valor -1; */
//Túlio Thauã Dutra >>
import kotlin.random.Random

fun main() {

    //Generating a random number
    val numberRandom = Random.Default.nextInt(0, 99)

    //Creating the entry
    println("...Your target is bob 😎, bob is alive")

    //Shooting Process
    for (i in 0..99){
        print("...💥 Try hit the bob hitting the right number: ")
        val gunShot: Int = readln().toIntOrNull() ?: 0
        var choice: Int

        if (gunShot != numberRandom) {
            if (gunShot > 99) {
                println("...❗ No! Your shot hit out of the field permited!")
                print("...🔊 Aright! if you wanna try again just skip or abort the mission with -1?: ")
                choice = readln().toIntOrNull() ?: 1
                when(choice){
                    -1 -> break
                    else -> continue
                }
            } else if (gunShot < 0) {
                println("...❗ Shit! your shot almost kill a victim!")
                print("...🔊 Aright! if you wanna try again just skip or abort the mission with -1?: ")
                choice = readln().toIntOrNull() ?: 1
                when(choice){
                    -1 -> break
                    else -> continue
                }
            } else if (numberRandom > gunShot) {
                println("...⬆ Oh! you almost hit him, aim higher!")
                print("...🔊 Aright! if you wanna try again just skip or abort the mission with -1?: ")
                choice = readln().toIntOrNull() ?: 1
                when(choice){
                    -1 -> break
                    else -> continue
                }
            } else if (gunShot > numberRandom) {
                println("...⬇ Yuh! you almost hit him, aim lower!")
                print("...🔊 Aright! if you wanna try again just skip or abort the mission with -1?: ")
                choice = readln().toIntOrNull() ?: 1
                when(choice){
                    -1 -> break
                    else -> continue
                }
            }
        } else {
            println("...✅ YEAH! YOUUU GOTT HIMM! ☠ GOOD WORK RECRUIT!")
            break
        }
    }
}