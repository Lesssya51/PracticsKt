fun sumOfFirstN(n: Int): Int {
    return n * (n + 1) / 2
}

fun main() {
    val n = 5
    val sum = sumOfFirstN(n)
    println("Сумма первых $n натуральных чисел: $sum")
}