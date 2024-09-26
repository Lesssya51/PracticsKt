fun main() {
    print("Введите количество чисел: ")
    val n = readLine()?.toIntOrNull() ?: 0

    val numbers = mutableListOf<Int>()

    println("Введите числа:")
    for (i in 1..n) {
        numbers.add(readLine()?.toIntOrNull() ?: 0)
    }

    numbers.sort()
    println("Числа в порядке возрастания: ${numbers.joinToString(", ")}")
}