var stringNulable2 : String? = "Hola"
fun main() {
    val stringNulable1 = readLine()
    println(stringNulable1?.random())
    // escribirCaracter(stringNulable1?.random())
    if (stringNulable1 != null) {
        println(stringNulable1.random())
        escribirCaracter(stringNulable1.random())
    }

    if (stringNulable2 != null) {
        // println(stringNulable2.random())
        // escribirCaracter(stringNulable2.random())
    }

    stringNulable2?.let {
        it.random()
        escribirCaracter(it.random())
    }
}

fun escribirCaracter(caracter: Char) {
    println(caracter)
}