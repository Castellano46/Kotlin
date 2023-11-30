fun main() {

    val lista = listOf(
        Saiyajin("Goku", 100, false, true),
        Saiyajin("Vegeta", 100, true, true),
        Namekiano("Picolo", 100, true, false),
        Humano("Krilin", 100).apply {
            vecesMuerto = Int.MAX_VALUE
            vecesResucitado = Int.MAX_VALUE
        },
    )
    var saiyajin = 0
    var namekianos = 0
    var humano = 0
    lista.forEach {
        when(it) {
            is Saiyajin -> {
                it.decirNombre()
                saiyajin++
            }
            is Namekiano -> {
                it.decirNombre()
                namekianos++
            }
            is Humano -> {
                it.decirNombre()
                humano++
            }
        }
    }
    println(lista.sortedBy {
        it.nombre
    })

}

open class PersonajeParte12(val nombre: String, var vida: Int) {

    fun decirNombre() = println("Mi nombre es $nombre")

    fun decirVida() = println("Mi vida es $vida")

    override fun toString(): String {
        return "Mi nombre es $nombre"
    }
}

class Saiyajin(nombre: String, vida: Int, val tieneCola: Boolean, val tieneEvolucion: Boolean): PersonajeParte12(nombre, vida)

class Namekiano(nombre: String, vida: Int, val tieneAntenas: Boolean, val poneHuevos: Boolean): PersonajeParte12(nombre, vida)

class Humano(nombre: String, vida: Int): PersonajeParte12(nombre, vida){

    var vecesMuerto = 0
    var vecesResucitado = 0

    fun decirMuertes() = println("Mi vecesMuerto es $vecesMuerto")
    fun decirResurreciones() = println("Mi vecesResucitado es $vecesResucitado")
}

