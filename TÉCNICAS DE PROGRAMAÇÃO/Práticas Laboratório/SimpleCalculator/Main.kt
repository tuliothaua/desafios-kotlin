//Túlio Thauã Dutra >>
fun main(){
    //Calculator Program
    
    //Creating the entry
    val num1 = 4
    val num2 = 2
    val operacao = '*'
    var resultado: Int = 0
   
    
    //Creating the Process
    if(operacao == '+'){
        resultado = num1 + num2
    } else if(operacao == '-'){
        resultado = num1 - num2
    } else if(operacao == '*'){
        resultado = num1 * num2
    } else if(operacao == '/'){
        resultado = num1 / num2
    }
    
    //Creating the Exit
    println("Resultado: ${resultado}")
}
