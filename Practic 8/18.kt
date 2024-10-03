fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val sum = sumOfArray(array)
    println("Сумма чисел в массиве: $sum")
}
    fun sumOfArray(array: IntArray): Int {
        var sum = 0
        for (i in array) {
            sum += i
        }
        return sum
    }
