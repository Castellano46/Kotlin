import kotlin.random.Random

fun main() {
    ifClasico(1,2)
    ifClasicoSimplificada(1,1)
    whenConParametro(Random.nextInt(0,5))
    whenConParametro("1")
    val int = 1
    val float = 1.0f
    whenComparandoClases(int)
    whenComparandoClases(float)
}

fun ifClasico(num1: Int, num2: Int) {
    if (num1 == num2) {
        println("Son iguales")
        println("Me gusta que sean iguales")
    } else {
        println("No son iguales")
    }
    println("Voy a acabar")
}

fun ifClasicoSimplificada(num1: Int, num2: Int) =
    if (num1 == num2)
        println("Son iguales")
    else
        println("No son iguales")


fun whenConParametro(num: Int){
    println(num)
    when(num) {
        1 -> {
            println("Soy un uno")
            println("Es mi número favortio")
        }
        2 -> println("Soy un dos")
        3 -> println("Soy un tres")
        4,5 -> println("Soy un cuatro o un cinco")

        else -> println("Soy un número distinto a uno, dos y tres")
    }
}

fun whenConParametro(texto: String){
    println(texto)
    when(texto) {
        "1" -> {
            println("Soy un uno")
            println("Es mi número favortio")
        }
        "2" -> println("Soy un dos")
        "3" -> println("Soy un tres")
        else -> println("Soy un número distinto a uno, dos y tres")
    }
}

fun whenSinParametro(num: Int) {
    println(num)
    when {
        num == 1 -> {
            println("Soy un uno")
            println("Es mi número favortio")
        }
        num > 1 && num < 300 -> {
            println("Soy un número mayour que uno")
        }
        else -> println("Soy otra cosa")
    }
}

fun whenComparandoClases(num: Number) {
    println(num)
    when (num) {
        is Int -> {
            println("Es un entero")
            // Ahora puedo acceder a todos lso métodos de los enteros
            num.toFloat()
        }
        is Float -> {
            println("Es un float")
            // Ahora puedo acceder a todos lso métodos de los float
            num.toInt()
        }
        else ->
            println("Es otra cosa")
    }

}