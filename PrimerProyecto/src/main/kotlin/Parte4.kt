import kotlin.random.Random

fun main() {
    repeat(10) {
        println("Estoy en la repetición $it")
    }

    repeat(10) { numeroRepeticion ->
        println("Estoy en la repetición $numeroRepeticion y pongo un num aleatorio = ${Random.nextInt(0, 100)}")
    }

    var numRepeticion = 10
    // El while no siempre se ejecuta el contenido.
    while (numRepeticion < 10) {
        println("Estoy en la repetición del While numero $numRepeticion")
        numRepeticion++
    }

    numRepeticion = 10
    // El do while siempre se ejecuta al menos una vez
    do {
        println("Estoy en la repetición del Do-While numero $numRepeticion")
        numRepeticion++
    } while(numRepeticion < 10)


    do {
        println("Escribe un número para salir de este bucle")
        val texto = readLine()
        val num = texto?.toIntOrNull()
    } while(num == null)


}