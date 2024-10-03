fun checkSum(num1: Int, num2: Int): Boolean {
    return num1 + num2 < 100
    fun main() {
        val num1 = 50
        val num2 = 40
        val sumResult = checkSum(num1, num2)
        println(sumResult) // Вывод: true
    }
}