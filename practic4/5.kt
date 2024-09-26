fun main() {
    val number = -5

    when {
        number > 0 -> println("Число положительное")
        number < 0 -> println("Число отрицательное")
        else -> println("Число равно нулю")
    }
}