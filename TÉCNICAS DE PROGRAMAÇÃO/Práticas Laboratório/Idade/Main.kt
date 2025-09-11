fun main() {
   //Túlio Thauã Dutra :D

   //Creating the entry
   println("Digite sua Idade: ")
   val idade: Int = readln().toInt()

   //Process and Exit
   if (idade < 12){
       println("Você é Criança")
   } else if (idade > 11 && idade < 18){
       println("Você é Adolescente")
   } else if (idade > 18){ 
      println("Você é de Maior")
   }
}
