fun findMaxAndMin(array: IntArray): Pair<Int, Int> {
    if (array.isEmpty()) {
        return Pair(Int.MIN_VALUE, Int.MAX_VALUE)
    }
    var max = array[0]
    var min = array[0]
    for (i in 1 until array.size) {
        if (array[i] > max) {
            max = array[i]
        }
        if (array[i] < min) {
            min = array[i]
        }
    }
    return Pair(max, min)
}
fun main(){
    val numbers = intArrayOf(10, 2, 8, 5, 1, 9)
    val (max, min) = findMaxAndMin(numbers)
    println("Максимальное значение: $max, Минимальное значение: $min")
}
