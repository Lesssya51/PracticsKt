fun main() {
    print("Введите начальное число: ")
    val start = readLine()!!.toInt()
    print("Введите конечное число: ")
    val end = readLine()!!.toInt()

    println("Простые числа в диапазоне $start - $end:")
    for (i in start..end) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) return false
    }
    return true
}