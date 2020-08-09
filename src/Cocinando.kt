val ingredients = listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")

fun main(args: Array<String>) {
    val recetas: List<String>? = null

    do {
        val welcomeMessage = """
            Seleccione la opción deseada:
            1. Hacer una receta
            2. Ver mis recetas
            3. Salir
        """.trimIndent()

        println(welcomeMessage)
        println("Escribe tu opción: ")
        var response: String? = readLine()
        var option: Int = response?.toInt() ?: 0

        when(option) {
            1 -> {
                println("Selecciona los ingredientes a usar:")
                for ((index, ingredient) in ingredients.withIndex()) {
                    println("${index + 1}.- $ingredient")
                }
            }
            2 -> {
                if (recetas != null) {
                    println("** Estas son tus recetas: **")
                } else {
                    println("Aún no has creado recetas :(")
                }
            }
            3 -> {
              println("De nada, vuelva pronto!!")
            }
        }

    } while (option != 3)
}