//Tulio Thauã Dutra >>
import kotlin.random.Random
fun main() {
    val thirdypositions = Array(30) {0}

    for (i in thirdypositions.indices) {
        thirdypositions[i] = Random.nextInt(0, 100)
    }

    for (i in thirdypositions){
        thirdypositions.sort()
    }

    println(thirdypositions.joinToString())

}