fun main() {
    var booleanoTrue = true
    val booleanoFalse = false
    // Si yo cambio el valor de booleanoTrue, va a funcionar
    booleanoTrue = false
    println(booleanoTrue)
    // Si yo cambio el valor de booleanoFalse, no va a funcionar
    // booleanoFalse = true
    // Con esto forzamos el tipo. Ahora no hace falta.
    var otroBooleano : Boolean = true

    var entero1 = 1
    entero1 = 2
    entero1 = 2 + 2
    entero1 = entero1 + 3
    entero1 = entero1 - 3
    entero1 = entero1 * 3
    entero1 = 6
    entero1 = entero1 / 3
    println("Valor de entero1 es = $entero1")
    entero1 = 7
    entero1 = entero1 / 3
    println("Valor de entero1 es = $entero1")
    // Dividir 7 / 2 y asignandoselo a un entero da 3
    entero1 = 7
    val division = entero1.toFloat() / 3
    println("Valor de entero1 es = $division")

    entero1 = 7
    val modulo = entero1.rem(3)
    println("Valor de modulo = $modulo")


    var doble = 1.0

    var float = 1.0f

    var letra = 'a'

    var texto = "Hola"
    println("${texto[0]} ${texto[1]}")

    var texto2 : String
    texto2 = "Que tal??"

    val esFloat: Boolean = float is Float
    esFloat = entero1 is Float

}