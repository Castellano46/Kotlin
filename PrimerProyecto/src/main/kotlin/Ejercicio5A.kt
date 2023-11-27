fun main() {
    // Transforma las funcciones de abajo en lambdas
    val lambda1 = { println("Esta Lambda escribe: Hola") }
    val lambda1Larga : () -> Unit = { println("Esta Lambda escribe: Hola") }
    lambda1()

    val lambda2 : (Int) -> Unit = { println("Esta lambda recibe un Int y lo escribre: $it") }
    val lambda2Larga : (Int) -> Unit = { integer -> println("Esta lambda recibe un Int y lo escribre: $integer") }
    lambda2(1)

    val lambda3 : (Int, List<Any>) -> Unit = { posicion, list ->
        println("Esta llamada ")
    }
}