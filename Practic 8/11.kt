fun googleWithOs(number: Int): String {
    if (number < 0) {
        throw IllegalArgumentException("Число не может быть отрицательным.")
    }

    val os = "o".repeat(number)
    return "Google"
}

fun main() {
    val number = 3
    val google = googleWithOs(number)
    println(google) // Вывод: Goooogle
}