fun main() {
    println("Введите строку:")
    val inputString = readLine()!! // Считываем строку с консоли

    val reversedString = inputString.reversed() // Используем функцию reversed() для переворота строки

    println("Перевернутая строка: $reversedString")
}

