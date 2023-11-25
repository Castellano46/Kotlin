fun main() {
    saluda("Carlos", "de Tena")
    println(sumaInt(1,2))
}

fun saluda(nombre: String, apellido: String) = println("Hola, soy $nombre y me apellido $apellido")

fun sumaInt(int1: Int, int2: Int) = (int1 + int2).toString()