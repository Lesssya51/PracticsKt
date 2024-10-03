fun main() {
    val number = 5
    val factorial = factorial(number)
    println("Факториал $number: $factorial")
}
fun factorial(n: Int): Int {
    if (n == 0) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}
