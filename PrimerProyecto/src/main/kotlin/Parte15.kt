import com.google.gson.Gson

fun main() {
    deJsonAObjeto()
    deObjetoAJson()
}

fun deObjetoAJson() {
    val personaje1 = PersonajeParte15("Goku", 30)
    val gson = Gson()
    val jsonEnString = gson.toJson(personaje1)
    println(jsonEnString)
}

fun deJsonAObjeto() {
    val jsonEnString2 = "{\"nombre\":\"Vegeta\",\"edad\":35}"
    val gson = Gson()
    val personje = gson.fromJson(jsonEnString2, PersonajeParte15::class.java)
    println(personje)
}


data class PersonajeParte15(var nombre: String, var edad: Int)