fun main() {

    var personaje1 = Personaje()
    personaje1.edad
    println(personaje1)

    var personaje2 = PersonajeConContruntor("Agapito", 100)
    personaje2.edad = 99

    personaje2 = PersonajeConContruntor("Laurencio", 50)
}

class PersonajeConContruntor(private var nombre: String, var edad: Int) {

    override fun toString(): String {
        return "Mi nombre es $nombre y tengo $edad"
    }


}

class Personaje() {

    private var nombre = ""
    var edad = 1

    fun darNombre(name: String) {
        nombre = name
    }

    override fun toString(): String {
        return "Mi nombre es $nombre y tengo $edad"
    }
}

