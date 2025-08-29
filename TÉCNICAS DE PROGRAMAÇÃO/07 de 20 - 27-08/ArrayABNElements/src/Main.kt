import kotlin.math.sign
//Túlio Thauã Dutra >>
fun main(){
    //Creating the arrays
    val a = arrayOf(1,2,3,4,5)
    val b = arrayOf(10,9,8,7,6)

    //Process
    val c = Array(a.size) {0}

    for (i in a.indices) {
        c[i] = a[i] + b[i]
    }
    
    //Creating the exit
    println("...First Array: ${a.joinToString()}")
    println("...Second Array: ${b.joinToString()}")
    println("...Third Array: ${c.joinToString()}")
}