fun main() {
    ifClasico(1, 2)
    ifClasico(1, 1)
}

fun ifClasico(num1: Int, num2: Int) {

    if(num1 == num2)
        println("Son iguales")
    else
        println("No son iguales")
    println("Voy a acabar")
}

fun ifClasicoSimplificada (num1: Int, num2: Int) =
    if (num1 == num2)
        println("Son iguales")
    else
        println("No son iguales")