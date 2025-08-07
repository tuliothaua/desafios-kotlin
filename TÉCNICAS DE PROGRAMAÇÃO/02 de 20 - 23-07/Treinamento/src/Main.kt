//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Túlio Thauã Dutra :D
    print("Digite uma frase: ")
    var frase = readLine()

    print("Insira a palavra na frase, que deseja substituir: ")
    var oldword = readLine()

    print ("Insira a palavra nova, para substituição: ")
    var newword = readLine()

    val newfrase = frase?.replace("$oldword" ,"$newword")

    println("Nova Frase: " + newfrase)



}