import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 101)
    var attempts = 0

    println("Угадайте число от 1 до 100.")

    do {
        print("Введите число: ")
        val guess = readLine()?.toIntOrNull() ?: 0
        attempts++

        if (guess < randomNumber) {
            println("Слишком мало!")
        } else if (guess > randomNumber) {
            println("Слишком много!")
        } else {
            println("Поздравляем! Вы угадали за $attempts попыток!")
            break
        }
    } while (true)
}