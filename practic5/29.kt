fun main() {
    print("Введите число N: ")
    val n = readLine()?.toIntOrNull() ?: 0

    var sum = 0.0

    for (i in 1..n) {
        sum += 1.0 / i
    }

    println("Сумма ряда: $sum")
}