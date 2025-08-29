import kotlin.random.Random
/* Túlio Thauã Dutra >> */
fun main(){
    //Creating the variables
    val thirdypositions = Array(30) {0}
    var lowerNumber = 200
    var biggerNumber = 0
    var adder = 0

    //Process
    for (i in thirdypositions.indices){
        thirdypositions[i] = Random.nextInt(0,100)
        if (thirdypositions[i] > biggerNumber){
            biggerNumber = thirdypositions[i]
        } else if (thirdypositions[i] < lowerNumber){
            lowerNumber = thirdypositions[i]
        }
        adder += thirdypositions[i]
    }
    val average: Int = adder / 30

    //Creating the exit
    println(thirdypositions.toSet())
    println("\nThe lower value is: $lowerNumber")
    println("\nThe Bigger value is: $biggerNumber")
    println("\nThe average value is: $average")
}
