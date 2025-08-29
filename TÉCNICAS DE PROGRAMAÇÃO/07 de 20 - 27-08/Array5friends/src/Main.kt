//Túlio Thauã Dutra >>
fun main(){
    //Creating the Entry
    val names = arrayOf("Túlio", "Luan", "Arthur", "Matheus", "Anthoni")

    //Process
    for (i in names.indices){
        names.sort()
        println("Element at $i is ${names[i]}")
    }
}
