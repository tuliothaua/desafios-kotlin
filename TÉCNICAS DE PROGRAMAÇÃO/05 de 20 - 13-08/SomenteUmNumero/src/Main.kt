//Túlio Thauã Dutra >>
fun main() {

    for (i in 1..1000001){

        if(i % 11 != 0 || i % 13 != 0 || i % 17 != 0){
            continue
        }
        println("Primeiro número divisível por 11, 13 e 17: $i")
        break
    }
}