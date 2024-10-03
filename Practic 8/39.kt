fun copyArray(array: IntArray): IntArray {
    val newArray = array.copyOf()
    return newArray
}

fun main() {
    val originalArray = intArrayOf(1, 2, 3, 4, 5)
    println("Original array: ${originalArray.contentToString()}")
    val copiedArray = copyArray(originalArray)
    println("Copied array: ${copiedArray.contentToString()}")
}