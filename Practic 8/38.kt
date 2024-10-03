fun reverseArray(array: IntArray): IntArray {
    val reversedArray = array.reversedArray()
    return reversedArray
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    println("Original array: ${array.contentToString()}")
    val reversedArray = reverseArray(array)
    println("Reversed array: ${reversedArray.contentToString()}")
}