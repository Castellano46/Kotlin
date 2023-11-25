fun main() {
    val zona = "A"
    val edad = 99

    //var precio : Double? = 0.0
    val precio = when {
        edad < 19 -> 200.00
        edad < 66 -> calcularZona(zona)
        else -> 0.0
    }
    println("El precio para una persona de $edad años en la zona $zona es $precio")
}

fun calcularZona(zona: String): Double? {
    return when (zona) {
        "A" -> 546.00
        "B1" -> 637.00
        "B2" -> 720.00
        "B3" -> 820.00
        "C1", "C2" -> 820.00
        "E1" -> 1106.00
        "E2" -> 1318.00
        else -> null
    }
}