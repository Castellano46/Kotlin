fun main() {
    var clase1 = Clase1("a", "a")
    var clase2 = Clase1("a", "a")
    if (clase1 == clase2) println("Son iguales") else println("No son iguales")

    var dataclase1 = DataClase1("a", "a")
    var dataclase2 = DataClase1("a", "a")
    if (dataclase1 == dataclase2) println("Son iguales") else println("No son iguales")

    var dataClase3 = dataclase1.copy()
    dataClase3.nombre = "Agapito"
    println(dataclase1)
}

class Clase1(var nombre: String, var apellido: String)

data class DataClase1(var nombre: String, var apellido: String)