import kotlin.random.Random

fun main() {
    //my name is Túlio Thauã Dutra >>
  
    //Creating the enty
    val randomNumber = List(1) {Random.nextInt(0, 20)}
    //println("The random number generated is $randomNumber")

    //Number Chosen
    val chooseNumber = 10
    println("You choose the number: $chooseNumber")
    val auxRamber = randomNumber[0]

    //Verifying the number
    if(chooseNumber != auxRamber){
        if (chooseNumber > auxRamber){
      	println("The random number is lower!")}
      	else {println("The random number is bigger!")}}
      	else {println("You got the number right!")
    }
}
