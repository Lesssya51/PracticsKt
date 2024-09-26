import java.util.Scanner
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите начальное число:")
    val start = scanner.nextInt()

    println("Введите шаг:")
    val step = scanner.nextInt()

    println("Введите количество элементов последовательности:")
    val count = scanner.nextInt()

    var current = start

    for (i in 1..count) {
        println("Элемент $i: $current")
        current += step
    }
}