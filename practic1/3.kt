import kotlin.math.E

fun main() {
    // Форматируем число E с точностью до десятых
    val formattedE = String.format("%.1f", E)

    // Выводим результат на экран
    println("Число e: $formattedE")
}