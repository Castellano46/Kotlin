import kotlin.random.Random

fun main() {
    val respuesta = llamarAInternet()
    when (respuesta) {
        is PersonajeParte11 -> println("Ha sido un exito. El personaje es ${respuesta.nombre}")
        is Error -> println("Error!! ${respuesta.mensaje}")
    }
}

data class PersonajeParte11(val nombre: String, val apellido: String): Respuesta()

data class Error(val mensaje: String): Respuesta()

sealed class Respuesta
fun llamarAInternet() : Respuesta {
    return if (Random.nextBoolean())
        PersonajeParte11("Personaje", "Apelidado X")
    else
        Error("Ha habido un error")
}