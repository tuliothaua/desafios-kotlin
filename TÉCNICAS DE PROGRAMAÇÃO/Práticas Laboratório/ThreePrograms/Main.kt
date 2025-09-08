//Welcome to my playground name is Túlio Thauã Dutra >>
import kotlin.random.Random

fun main() {
    //First Program: it is a basic program that show how to format a float
    //Creating Variables
    val name: String = "Túlio".toString()
    val salary: Float = 100.00.toFloat()
   	
    //Spittin on the screen
    println(String.format("Hello, $name your salary is: R$%.2f", salary))
    
    //Second Program: it make a Random Number for u try get it 
    val randomNumber = List(1) {Random.nextInt(0, 20)}
    println("The random number generated is $randomNumber")
    
    //here u choose a random number!
    val chooseNumber = 10
    
    println("You choose the number: $chooseNumber")
    val auxRamber = randomNumber[0] 
    
    if(chooseNumber != auxRamber){
    //easier for work in the condition using a aux variable!
        if (chooseNumber > auxRamber){ 
      	println("The random number is lower!")}
      	else {println("The random number is bigger!")}}
      	else {println("You got the number right!")}	
        
    //Third Program: it shows the down counter and what the % does
    for(i in 2345 downTo 1900){
        if(i % 11 == 5){ 
            //it only spitties "5"
            print(i % 11)
        }
    }
}
