fun main() {
    println(sumaStrings("4","5"))
    println(sumaStringsSimplificada("4","5"))
}

fun sumaStrings(texto1: String, texto2: String) : Double {
    return (texto1.toInt() + texto2.toInt()).toDouble()
}

fun sumaStringsSimplificada(texto1: String, texto2: String) = (texto1.toInt() + texto2.toInt()).toDouble()