//Túlio Thauã Dutra >>

import javax.swing.JOptionPane

fun main() {

    //Making the entry with processing
    val intNumber = JOptionPane.showInputDialog("Type an INT number:")?.toIntOrNull() ?: 0
    val floatNumber = JOptionPane.showInputDialog("Type a FLOAT number:")?.toFloatOrNull() ?: 0.0f
    val caractere = JOptionPane.showInputDialog("Type a CHARACTER:")?.firstOrNull() ?: ' '
    val booleanValue = JOptionPane.showInputDialog("Type a BOOLEAN value:")?.toBoolean() ?: false
    val unicodeString = JOptionPane.showInputDialog("Type a Unicode number (hex, ex: 2753):")

    //Converts a hex string to its Unicode caractere
    val unicodeChar = unicodeString.toInt(16).toChar()


    val result = "$unicodeChar\tResultado:\n\"$intNumber,\t$floatNumber,\t$caractere,\t$booleanValue\'"

    // Spitting on joption
    JOptionPane.showMessageDialog(null, result)

    // Spitting on terminal
    println(result)
}
