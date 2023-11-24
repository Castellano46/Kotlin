import kotlin.random.Random

fun main() {
    // Opción 1 { println("Hola") }.invoke()
    // Opción 2{ println("Hola") }()
    val lambda1 = { println("Soy lambda 1") }
    lambda1.invoke()
    ejecutarLambda(lambda1)

    val lambda2: () -> Unit = { println("Soy lambda 2") }

    val lambda3: () -> Int = {
        println("Soy lambda 3")
        Random.nextInt()
    }
    // Esta lambda va a devolver el numero multiplicado por 2
    val lambda4: (Int) -> Int = {
        println("Soy lambda 4")
        it * 2
    }
    // Esta lambda va a devolver el numero multiplicado por 2
    val lambda5: (Int) -> Int = { num ->
        println("Soy lambda 5")
        num * 2
    }

    // Esta lambda simplemente multiplica los 2 numeros que le pases.
    val lambda6: (Int, Int) -> Int = { num1, num2 ->
        if (num1 > 2)
            num2 *1000
        else {
            println("Soy lambda 5")
            num1 * num2
        }
    }
    println(lambda3())
    println(lambda5(5))
    println(lambda6(5,10))
}

fun ejecutarLambda(lambda: () -> Unit) {
    lambda.invoke()
}