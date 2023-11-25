fun main() {
    println(inciarPersonajeWhen("Goku", 80))
    println(inciarPersonajeIf("Goku", 80))
}

fun inciarPersonajeWhen(nombre: String, vida: Int) = when {
    vida < 20 -> "$nombre, estás bajo de vida"
    vida < 81 -> "$nombre, estás algo herido"
    else -> "$nombre, estás en prefectas condiciones"
}

fun inciarPersonajeIf(nombre: String, vida: Int) =
    if (vida < 20) "$nombre, estás bajo de vida"
    else if (vida < 81) "$nombre, estás algo herido"
    else "$nombre, estás en prefectas condiciones"
