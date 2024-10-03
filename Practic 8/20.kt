fun sortArray(array: IntArray): IntArray {
    return array.sortedArray()
}

fun main() {
    val unsortedArray = intArrayOf(5, 2, 9, 1, 7)
    val sortedArray = sortArray(unsortedArray)
    println("Отсортированный массив: ${sortedArray.contentToString()}") 
}