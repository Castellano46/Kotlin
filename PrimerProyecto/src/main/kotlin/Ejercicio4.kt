import kotlin.random.Random

fun main() {
    val lista = obtenerListaNumerosAleatoriosOptimizada()
    lista.forEach { println(it) }
    val listaSumas = MutableList(10) {
        0
    }
    lista.forEach {
        listaSumas[it]++
    }
    listaSumas.forEachIndexed { posicion, item ->
        println("Han salido $item $posicion")
    }
}

fun obtenerListaNumerosAleatorios(): List<Int> {
    val lista = List(100) {
        Random.nextInt(0, 10)
    }
    return lista
}

fun obtenerListaNumerosAleatoriosOptimizada() =
    List(100) {
        Random.nextInt(0, 10)
    }
