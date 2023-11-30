fun main() {

}

interface PersonajeParte13 {

    var nombre: String
    var vida: Int
    fun decirNombre()
    fun decirVida() {
        println("La vida es $vida")
    }
}

data class Saiyajin2(override var nombre: String, override var vida: Int): PersonajeParte13 {
    override fun decirNombre() {
        println("El nombre es $nombre")
    }
}