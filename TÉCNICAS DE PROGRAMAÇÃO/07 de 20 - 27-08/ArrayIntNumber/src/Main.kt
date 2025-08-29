//Túlio Thauã Dutra >>
fun main() {
    //Creating the Variables!
    val a = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    val b = arrayOfNulls<Int>(a.size)
    var cont = 0

    //Process
    for (i in a.indices){
        if (a[i] % 2 == 0){
            b[i] = a[i]
            cont++
        }
    }
    val filterNotNull = b.filterNotNull()
    //Creating the exit
    println("...Todos os números pares: ${filterNotNull.joinToString()}")
    println("...Quantidade: $cont")
}