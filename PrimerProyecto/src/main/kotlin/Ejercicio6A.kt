import kotlin.random.Random

fun main() {

    val personaje1 = PersonajeEjercicio6A("Goku")
    personaje1.recibirGolpe()
    personaje1.recibirGolpe()
    personaje1.recibirGolpe()
    personaje1.curar()
    personaje1.curar()
    println(personaje1.toString())
}

data class PersonajeEjercicio6A(private val nombre: String, private var vida: Int = 100) {

    val historico = mutableListOf<Int>()
    fun recibirGolpe() {
        var danio = Random.nextInt(10, 60)
        historico.add(danio * -1)
        println("El daño recibido es $danio")
        vida = if (vida - danio > 0) vida - danio else 0
    }

    fun curar() {
        historico.add(20)
        println("Me curo 20 de vida")
        vida = if (vida + 20 > 100) 100 else vida + 20
    }

    /*override fun toString(): String {
        return "Soy $nombre, tengo $vida puntos de vida y este es mi historio $historico"
    }*/
}