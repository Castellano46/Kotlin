var stringNulable : String? = null

fun main() {
    // Ejecuta la lambda que me das
    run {
        println("Hola")
    }

    stringNulable.run {
        // Este orEmpty se ejecuta sobre el stringNulable. Es lo mismo que hacer stringNulable.orEmpty()
        orEmpty()
        // random()
    }


    stringNulable?.run {
        // Este orEmpty se ejecuta sobre el stringNulable. Es lo mismo que hacer stringNulable.orEmpty()
        orEmpty()
        random()
    } ?: run { println("aaaa") }

    with(stringNulable) {
        orEmpty()
        // random()
    }

    stringNulable.also {
        it.orEmpty()
        // it.random()
    }

    stringNulable?.also {
        it.orEmpty()
        it.random()
        1
    }

    stringNulable.apply {
        orEmpty()
        //random()
    }
    stringNulable?.apply {
        orEmpty()
        random()
    }
}