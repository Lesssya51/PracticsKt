fun findElementByIndex(array: Array<Int>, index: Int): Int? {
    if (index in 0 until array.size) {
        return array[index]
    }
    return null
}

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val index = 2
    val element = findElementByIndex(array, index)
    if (element != null) {
        println("Элемент с индексом $index: $element")
    } else {
        println("Элемент с индексом $index не найден")
    }
}