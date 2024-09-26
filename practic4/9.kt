fun main() {
    println("Выберите способ оплаты:")
    println("1. Наличные")
    println("2. Кредитная карта")
    println("3. PayPal")

    val choice = readLine()?.toIntOrNull()

    when (choice) {
        1 -> println("Оплата наличными.")
        2 -> println("Оплата кредитной картой.")
        3 -> println("Оплата через PayPal.")
        else -> println("Неверный выбор.")
    }
}