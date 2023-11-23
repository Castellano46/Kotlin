fun main() {
    println(sumaString("4", "5"))
    println(sumaStrignSimplificado("4", "5"))
}

fun sumaString(texto1: String, texto2: String) : Double {
    return texto1.toInt() + texto2.toInt().toDouble()
}

fun sumaStrignSimplificado(texto1: String, texto2: String) = (texto1.toInt() + texto2.toInt()).toDouble()

