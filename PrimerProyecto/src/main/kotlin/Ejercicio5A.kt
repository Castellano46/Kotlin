fun main() {
    // Transforma las funciones de abajo en lamdas
    val lambda1 = { println("Esta Lambda escribe: Hola") }
    val lambda1Larga : () -> Unit = { println("Esta Lambda escribe: Hola") }
    lambda1()

    val lambda2 : (Int) -> Unit = { println("Esta Lambda recibe un Int y lo escribe: $it") }
    val lambda2Larga : (Int) -> Unit = { integer -> println("Esta Lambda recibe un Int y lo escribe: $integer") }
    lambda2(1)

    val lambda3 : (Int, List<Any>) -> Unit = { posicion, list ->
        println("Esta Lambda recibe un Int y una Lista. Escribe al elemento que haya en la posición ${list[posicion]}")
    }
}

fun fun1() { println("Esta Lambda escribe: Hola") }
fun fun2(integer : Int) { println("Esta Lambda recibe un Int y lo escribe: $integer") }
fun fun3(posicion : Int, list : List<Any>) { println("Esta Lambda recibe un Int y una Lista. Escribe al elemento que haya en la posición ${ list[posicion]}") }
