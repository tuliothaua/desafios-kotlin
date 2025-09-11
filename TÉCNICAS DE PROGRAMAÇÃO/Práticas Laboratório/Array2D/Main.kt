/* TÚLIO THAUÃ DUTRA */
import kotlin.random.Random

fun main() {
      //Creating the Entry
       val array2d = Array(4){ Array(5) { (0..99).random() } }
       println(array2d)
       var soma = 0
  
       //Creating the Process
       for(i in array2d.indices){
               for (c in array2d[i].indices){
                   soma += array2d[i][c]
               }
       }

       val todos = array2d.size * array2d[0].size
       val media = soma / todos
  
       //Creating the Exit
       println("Soma: $soma, Média: $media")
}
