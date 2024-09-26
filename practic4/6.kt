import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 101) // Случайное число от 1 до 100
    var guesses = 0
    var guess: Int

    println("Добро пожаловать в игру 'Угадай число'!")
    println("Я загадал число от 1 до 100. Попробуй угадать.")

    do {
        print("Введите ваше число: ")
        guess = readLine()!!.toInt()
        guesses++

        if (guess < secretNumber) {
            println("Слишком мало!")
        } else if (guess > secretNumber) {
            println("Слишком много!")
        }
    } while (guess != secretNumber)

    println("Поздравляю! Вы угадали число $secretNumber за $guesses попыток.")
}