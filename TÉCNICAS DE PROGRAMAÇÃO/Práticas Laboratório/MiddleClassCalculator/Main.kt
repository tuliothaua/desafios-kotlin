//Túlio Thauã Dutra >>
fun main(){
    //Calculator Program Middle Class
    
    //Creating the entry
    println("Choose the numbers Below: ")
    val num1 = 5
    val num2 = 3
    println("1-Somar|2-Subtrair|3-Multiplicar|4-Dividir")
    
    val operador = 2
    
    val aux = calcular(num1,num2,operador)
	
    //Creating the Exit
    println("Resultado: ${aux}")
}


//Calculator Function
fun calcular(numero1: Int, numero2: Int, operador: Int): Int {
  	var resultado: Int = 0
    
    if (operador == 1){
       resultado = numero1 + numero2
    } else if (operador == 2){
       resultado = numero1 - numero2
    } else if (operador == 3){
       resultado = numero1 * numero2
    } else if (operador == 4){
       resultado = numero1 / numero2
    }
    
    return resultado
}
