/*Escreva um programa que, dada uma variável x, temos y de acordo com a seguinte
regra: • se x é par, y = x / 2
• se x é impar, y = 3 * x + 1
• imprime y
• O programa deve então jogar o valor de y em x e continuar até que y tenha o valor final
de 1.

Por exemplo, para x = 13, a saída será:

40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1*/
//Túlio Thauã Dutra >>
fun main(){
    //Creating the entry
    var x: Int; var y: Int;
    print("Type a value for X: ")
    x = readln().toIntOrNull() ?: 0

    //Process
    for (i in 0..x) {
        if (x % 2 == 0) {
            y = x / 2
        } else {
            y = 3 * x + 1
        }
        if(y != 1){
            x = y
            println(y)
        }
        continue
    }
}