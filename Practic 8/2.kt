fun findDifference(numbers: List<Int>): Int {
    if (numbers.isEmpty()) {
        throw IllegalArgumentException("Список не может быть пустым")
    }

    val max = numbers.maxOrNull() ?: throw IllegalArgumentException("Список не может быть пустым")
    val min = numbers.minOrNull() ?: throw IllegalArgumentException("Список не может быть пустым")

    return max - min
}
fun main() {
    val numbers = listOf(5, 2, 8, 1, 9)
    val difference = findDifference(numbers)
    println("Разность: $difference") 
}