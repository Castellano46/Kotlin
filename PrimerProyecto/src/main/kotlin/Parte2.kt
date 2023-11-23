import kotlin.random.Random

fun main() {
    println("Ejecutando Parte 2")
    escribir()
    escribirAlgo("Hola")
    println("Finalizando parte 2")
    escribirSaludo("Hola, ", "Carlos" )
    escribirSaludoNulos((null, null))

    val num = obtenerNumeroAleatorio()
    println(num)
}

fun escribir(){
    println("Entrando en la funcion escribir()")
}

fun escribirAlgo(texto: String){
    println("Entrando en la funcion escribirAlgo()")
    println(texto)
}

fun escribirSaludo(saludo: String, nombre: String = "KeepCoding"){
    println("Entrando en la funcion escribirSaludo()")
    println("$saludo$nombre")
}

fun escribirSaludoNulos(saludo: String?, nombre: String?){
    println("Entrando en la funcion escribirSaludoNulos()")
    println("${saludo ?: "Saludo era null"}${nombre?: "Nombre era null"}")
}

fun obtenerNumeroAleatorio(): Int {
    return Random.nextInt()
}

// La Funcion obtenerNumeroAleatorio y obtenerNumeroAleatorioSimplificado son iguales
fun obtenerNumeroAleatorioSimplificado(): Int = Random.nextInt()
