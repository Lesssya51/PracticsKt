fun main() {
    val primeNumber = 7
    val isPrime = isPrime(primeNumber)
    println("$primeNumber - простое число: $isPrime")
}
    fun isPrime(n: Int): Boolean {
        if (n <= 1) {
            return false
        }
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                return false
            }
        }
        return true
    }
