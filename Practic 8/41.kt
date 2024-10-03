fun findFirstIndex(array: IntArray, element: Int): Int {
    for (i in array.indices) {
        if (array[i] == element) {
            return i
        }
    }
    return -1
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val element = 3
    println("Index of the first occurrence of $element: ${findFirstIndex(array, element)}")
}