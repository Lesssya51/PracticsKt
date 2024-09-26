fun main() {
    val numbers = arrayOf(23, 15, 87, 42, 61)

    for (i in 0 until numbers.size - 1) {
        for (j in i + 1 until numbers.size) {
            if (numbers[i] > numbers[j]) {
                val temp = numbers[i]
                numbers[i] = numbers[j]
                numbers[j] = temp
            }
        }
    }

    println("Отсортированный список: ${numbers.joinToString(", ")}")
}