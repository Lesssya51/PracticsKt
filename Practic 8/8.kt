fun checkPower(n: Int, k: Int): Boolean {
    return Math.pow(k.toDouble(), k.toDouble()).toInt() == n
    fun main() {
        val n = 81
        val k = 3
        val powerResult = checkPower(n, k)
        println(powerResult)
    }
}