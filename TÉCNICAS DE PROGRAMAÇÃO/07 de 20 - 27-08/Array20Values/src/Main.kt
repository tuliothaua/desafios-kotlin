//Túlio Thauã Dutra
fun main() {
    //Creating the vetor
    val twentyVetor = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    var aux: Int = 19
    var newVetor = Array(20){0}

    //Process
    for (i in twentyVetor.indices){
        newVetor[i] = twentyVetor[aux]
        aux--
    }

    println("...The current vetor: ${twentyVetor.joinToString()}")
    println("...The new vetor: ${newVetor.joinToString()}")
}