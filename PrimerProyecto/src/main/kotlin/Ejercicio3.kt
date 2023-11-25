fun main() {
    println(
        inciarPersonajeWhen(
            "Goku",
            obternerVida()
        )
    )
}

fun obternerVida(): Int{
    var num: Int?
    do {
        println("Escribe un número del 1 al 100 para salir de este bucle")
        val texto = readlnOrNull()
        num = texto?.toIntOrNull()
    } while(num == null || num !in 0..100)
    return num
}