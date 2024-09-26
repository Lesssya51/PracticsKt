fun main() {
    print("Введите целое число: ")
    val decimal = readLine()?.toIntOrNull() ?: 0

    val binary = decimal.toString(2)
    println("Двоичное представление: $binary")
}