fun main() {
    print("Введите число N: ")
    val n = readLine()?.toIntOrNull() ?: 0

    for (i in 1..n) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}