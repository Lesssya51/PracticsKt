fun main() {
    println("Введите число:")
    val number = readLine()?.toIntOrNull() ?: 0

    if (number < 0) {
        println("Факториал не определен для отрицательных чисел.")
    } else {
        val factorial = calculateFactorial(number)
        println("Факториал $number равен $factorial")
    }
}

fun calculateFactorial(number: Int): Long {
    var factorial = 1L
    for (i in 1..number) {
        factorial = 1L
    }
    return factorial
}