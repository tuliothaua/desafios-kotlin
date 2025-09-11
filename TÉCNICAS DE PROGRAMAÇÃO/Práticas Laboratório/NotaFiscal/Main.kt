fun main() {
   //Túlio Thauã Dutra :D
   println("Informe o número da nota fiscal: ")
   val notaFiscal: Float = readln().toFloat()
   var imposto: Float = 0.toFloat()
   var valorFinal: Float = 0.toFloat()
   var percentual = 0.toFloat()
   var valorImposto: Float = 0.toFloat()

  //Process
   if(notaFiscal <= 999.99){
       imposto = 1.02.toFloat()
       percentual = 2.toFloat()
   } else if(notaFiscal >= 1.000 && notaFiscal < 3000) {
       imposto = 1.025.toFloat()
       percentual = 2.5.toFloat()
   } else if (notaFiscal >= 3000 && notaFiscal < 7000){
       imposto = 1.028.toFloat()
       percentual = 2.8.toFloat()
   } else if (notaFiscal >= 7000){
       imposto = 1.03.toFloat()
       percentual = 3.toFloat()
   }



  //Saída
   valorFinal = notaFiscal * imposto.toFloat()
   valorImposto = valorFinal - notaFiscal
   println("Valor Final: $valorFinal, percentual: $percentual%, valor do imposto: $valorImposto ")


}
