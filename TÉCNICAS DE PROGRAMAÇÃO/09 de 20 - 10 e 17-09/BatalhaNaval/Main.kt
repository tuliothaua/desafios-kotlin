// Authores do Código: Gustavo Varela, Erik Domingos, Túlio T. Dutra, Lia Mariah e Gustavo Sá.
// Bem vindo ao nosso código de Batalha Naval!

import kotlin.random.Random
import kotlin.math.abs

// DEFINIÇÕES GLOBAIS (nível mais alto do arquivo)
enum class Dificuldade(
    val descricao: String,
    val tamanhoTabuleiro: Int,
    val tentativasMaximas: Int,
    val navios: Map<Char, Int> // Mapa com o tipo do navio e a quantidade
) {
    FACIL("Fácil", 8, 30, mapOf('P' to 6, 'R' to 2)),
    MEDIO("Médio (Clássico)", 10, 15, mapOf('P' to 10, 'C' to 1, 'R' to 2)),
    DIFICIL("Difícil", 12, 12, mapOf('P' to 10, 'C' to 2, 'R' to 3, 'S' to 2));
}

val PONTUACAO_NAVIO = mapOf(
    'P' to 5,   // Porta-aviões
    'C' to 15,  // Cruzador
    'R' to 10,  // Rebocador
    'S' to 20   // Submarino
)

val NOMES_NAVIO = mapOf(
    'P' to "Porta-aviões",
    'C' to "Cruzador",
    'R' to "Rebocador",
    'S' to "Submarino"
)

// FUNÇÃO PRINCIPAL
fun main() {
    println("=== BATALHA NAVAL ===")
    println("Bem-vindo ao jogo!")

    do {
        val dificuldadeEscolhida = selecionarDificuldade()
        jogarBatalhaNaval(dificuldadeEscolhida)
        print("\nDeseja jogar novamente? (S/N): ")
    } while (readLine()!!.uppercase() == "S")

    println("Obrigado por jogar!")
}

// DEMAIS FUNÇÕES (no mesmo nível da main)
fun selecionarDificuldade(): Dificuldade {
    println("\nEscolha o nível de dificuldade:")
    // A IDE sugere usar .entries em vez de .values() - é mais performático.
    val dificuldades = Dificuldade.entries
    dificuldades.forEachIndexed { index, dificuldade ->
        println("${index + 1} - ${dificuldade.descricao}")
    }

    while (true) {
        print("Digite o número da sua escolha: ")
        val escolha = readLine()?.toIntOrNull()
        if (escolha != null && escolha in 1..dificuldades.size) {
            return dificuldades[escolha - 1]
        }
        println("Opção inválida. Tente novamente.")
    }
}

fun jogarBatalhaNaval(dificuldade: Dificuldade) {
    val tamanhoTabuleiro = dificuldade.tamanhoTabuleiro
    val tentativasMaximas = dificuldade.tentativasMaximas
    var tentativas = 0
    var pontuacao = 0

    val tabuleiroOculto = Array(tamanhoTabuleiro) { Array(tamanhoTabuleiro) { ' ' } }
    val tabuleiroJogador = Array(tamanhoTabuleiro) { Array(tamanhoTabuleiro) { ' ' } }

    posicionarNavios(tabuleiroOculto, dificuldade.navios)

    println("\nTabuleiro ${tamanhoTabuleiro}x${tamanhoTabuleiro} - Você tem $tentativasMaximas tentativas!")
    val descricaoNavios = dificuldade.navios.entries.joinToString(", ") { "${it.value} ${NOMES_NAVIO[it.key]}(s)" }
    println("Navios: $descricaoNavios")

    while (tentativas < tentativasMaximas) {
        println("\n=== TENTATIVA ${tentativas + 1}/$tentativasMaximas ===")
        exibirTabuleiro(tabuleiroJogador)

        val (linha, coluna) = obterCoordenadas(tamanhoTabuleiro, tabuleiroJogador)
        val celulaAtingida = tabuleiroOculto[linha][coluna]

        if (celulaAtingida in PONTUACAO_NAVIO.keys) {
            val pontosGanhos = PONTUACAO_NAVIO[celulaAtingida]!!
            val nomeNavio = NOMES_NAVIO[celulaAtingida]!!
            pontuacao += pontosGanhos
            tabuleiroJogador[linha][coluna] = celulaAtingida
            println("\u001B[31mAlvo atingido! $nomeNavio abatido! (+$pontosGanhos pts)\u001B[0m")
        } else {
            val distancia = calcularDistanciaNavioMaisProximo(tabuleiroOculto, linha, coluna)
            val mensagem = when (distancia) {
                1 -> { tabuleiroJogador[linha][coluna] = '1'; "Água! Mas você está a 1 casa de um alvo." }
                2 -> { tabuleiroJogador[linha][coluna] = '2'; "Água! Mas você está a 2 casas de um alvo." }
                3 -> { tabuleiroJogador[linha][coluna] = '3'; "Água! Mas você está a 3 casas de um alvo." }
                else -> { tabuleiroJogador[linha][coluna] = 'M'; "Água! Você errou por muito." }
            }
            println("\u001B[32m$mensagem\u001B[0m")
        }
        tentativas++
        if (verificarVitoria(tabuleiroOculto, tabuleiroJogador)) {
            println("\n\u001B[33m PARABÉNS! Você afundou todos os navios! \u001B[0m")
            break
        }
    }
    exibirResultadoFinal(tabuleiroOculto, tabuleiroJogador, pontuacao, tentativas, tentativasMaximas, dificuldade.navios)
}

fun posicionarNavios(tabuleiro: Array<Array<Char>>, navios: Map<Char, Int>) {
    navios.forEach { (tipoNavio, quantidade) ->
        repeat(quantidade) {
            var posicionado = false
            while (!posicionado) {
                val linha = Random.nextInt(tabuleiro.size)
                val coluna = Random.nextInt(tabuleiro[0].size)
                if (tabuleiro[linha][coluna] == ' ') {
                    tabuleiro[linha][coluna] = tipoNavio
                    posicionado = true
                }
            }
        }
    }
}

fun obterCoordenadas(tamanho: Int, tabuleiro: Array<Array<Char>>): Pair<Int, Int> {
    val letraMaxima = 'A' + tamanho - 1
    while (true) {
        print("Digite as coordenadas (ex: A5): ")
        val input = readLine()!!.uppercase()
        if (input.length < 2) {
            println("Coordenada inválida! Use formato como A5, B10, etc.")
            continue
        }
        val letra = input[0]
        val numero = input.substring(1).toIntOrNull()
        if (letra !in 'A'..letraMaxima || numero == null || numero !in 1..tamanho) {
            println("Coordenada inválida! Letras de A-$letraMaxima, números de 1-$tamanho.")
            continue
        }
        val linha = letra - 'A'
        val coluna = numero - 1
        if (tabuleiro[linha][coluna] != ' ') {
            println("Você já atirou nesta posição! Escolha outra.")
            continue
        }
        return Pair(linha, coluna)
    }
}

fun calcularDistanciaNavioMaisProximo(tabuleiro: Array<Array<Char>>, linha: Int, coluna: Int): Int {
    var menorDistancia = Int.MAX_VALUE
    for (i in tabuleiro.indices) {
        for (j in tabuleiro[i].indices) {
            if (tabuleiro[i][j] in PONTUACAO_NAVIO.keys) {
                val distancia = maxOf(abs(i - linha), abs(j - coluna))
                if (distancia < menorDistancia) {
                    menorDistancia = distancia
                }
            }
        }
    }
    return menorDistancia
}

fun verificarVitoria(tabuleiroOculto: Array<Array<Char>>, tabuleiroJogador: Array<Array<Char>>): Boolean {
    for (i in tabuleiroOculto.indices) {
        for (j in tabuleiroOculto[i].indices) {
            if (tabuleiroOculto[i][j] in PONTUACAO_NAVIO.keys && tabuleiroJogador[i][j] != tabuleiroOculto[i][j]) {
                return false
            }
        }
    }
    return true
}

fun exibirTabuleiro(tabuleiro: Array<Array<Char>>) {
    val tamanho = tabuleiro.size
    println()
    print("     ")
    for (i in 1..tamanho) {
        print("%-4d".format(i))
    }
    println()
    val separador = "  +" + "---+".repeat(tamanho)
    for (i in tabuleiro.indices) {
        val letra = ('A' + i)
        val linha = StringBuilder("$letra |")
        for (celula in tabuleiro[i]) {
            val conteudo = when (celula) {
                in PONTUACAO_NAVIO.keys -> "\u001B[31m $celula \u001B[0m"
                '1', '2', '3', 'M' -> "\u001B[32m $celula \u001B[0m"
                else -> "   "
            }
            linha.append("$conteudo|")
        }
        println(separador)
        println(linha)
    }
    println(separador)
}

fun exibirResultadoFinal(tabuleiroOculto: Array<Array<Char>>, tabuleiroJogador: Array<Array<Char>>, pontuacao: Int, tentativas: Int, tentativasMaximas: Int, naviosConfig: Map<Char, Int>) {
    val tamanho = tabuleiroOculto.size
    println("\n" + "=".repeat(40))
    println("FIM DE JOGO!")
    println("=".repeat(40))
    println("\nTABULEIRO COMPLETO:")
    print("     ")
    for (i in 1..tamanho) {
        print("%-4d".format(i))
    }
    println()
    val separador = "  +" + "---+".repeat(tamanho)
    for (i in tabuleiroOculto.indices) {
        val letra = ('A' + i)
        val linha = StringBuilder("$letra |")
        for (j in tabuleiroOculto[i].indices) {
            val celulaOculta = tabuleiroOculto[i][j]
            val celulaJogador = tabuleiroJogador[i][j]
            val conteudo = when {
                celulaOculta in PONTUACAO_NAVIO.keys && celulaOculta == celulaJogador -> "\u001B[31m $celulaOculta \u001B[0m"
                celulaOculta in PONTUACAO_NAVIO.keys && celulaOculta != celulaJogador -> "\u001B[34m $celulaOculta \u001B[0m"
                celulaJogador in listOf('1', '2', '3', 'M') -> "\u001B[32m $celulaJogador \u001B[0m"
                else -> "   "
            }
            linha.append("$conteudo|")
        }
        println(separador)
        println(linha)
    }
    println(separador)
    println("\nPLACAR FINAL:")
    println("Pontuação: $pontuacao pontos")
    println("Tentativas utilizadas: $tentativas/$tentativasMaximas")
    val naviosRestantes = contarNaviosRestantes(tabuleiroOculto, tabuleiroJogador, naviosConfig)
    val descricaoRestantes = naviosRestantes.entries.filter { it.value > 0 }.joinToString(", ") { "${it.value} ${NOMES_NAVIO[it.key]}(s)" }
    if (descricaoRestantes.isNotEmpty()) {
        println("Navios restantes: $descricaoRestantes")
    } else {
        println("Nenhum navio restante!")
    }
}

fun contarNaviosRestantes(tabuleiroOculto: Array<Array<Char>>, tabuleiroJogador: Array<Array<Char>>, naviosConfig: Map<Char, Int>): Map<Char, Int> {
    val contagem = naviosConfig.keys.associateWith { 0 }.toMutableMap()
    for (i in tabuleiroOculto.indices) {
        for (j in tabuleiroOculto[i].indices) {
            val navio = tabuleiroOculto[i][j]
            if (navio in contagem.keys && tabuleiroJogador[i][j] != navio) {
                contagem[navio] = contagem.getValue(navio) + 1
            }
        }
    }
    return contagem
}
