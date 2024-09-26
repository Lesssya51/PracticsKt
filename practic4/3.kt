fun main() {
    val score = 95

    when (score) {
        in 90..100 -> println("Отлично!")
        in 80..89 -> println("Хорошо")
        in 70..79 -> println("Удовлетворительно")
        else -> println("Неудовлетворительно")
    }
}