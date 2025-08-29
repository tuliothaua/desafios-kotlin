/* Túlio Thauã Dutra */
fun main(){
    //Creating the variables
    var soma = 0
    var media = 0
    val newArray = Array(10){1}

    //Process
    print("> type ten numbers: ")
    val tenNumbers = Array(10){readln().toIntOrNull() ?: 0}

    for (i in tenNumbers.indices){
        soma += tenNumbers[i]
    }

    media = soma / 10

    for (i in tenNumbers.indices){
        newArray[i] = tenNumbers[i] * media
    }

    //Creating the exit
    println("\n...The first value array: ${tenNumbers.joinToString()}")
    println("\n...The second value array: ${newArray.joinToString()}")
    println("\n...The average is: $media")
    println("\n...Soma: $soma")
}
