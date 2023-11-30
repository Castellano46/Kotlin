fun main() {

    // println(contarVocales("aeiou1234"))
    "aeiou1234".contarVocales()
}


// fun contarVocales(texto: String) = texto.count { it in listOf('a', 'e', 'i', 'o', 'u') }

fun String.contarVocales() = count { it in listOf('a', 'e', 'i', 'o', 'u') }


fun PersonajeParte12.cualquierCosa() {

}