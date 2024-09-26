import java.util.Calendar

fun main() {
    val calendar = Calendar.getInstance()
    val hour = calendar.get(Calendar.HOUR_OF_DAY)

    when (hour) {
        in 5..11 -> println("Доброе утро!")
        in 12..17 -> println("Добрый день!")
        in 18..23 -> println("Добрый вечер!")
        else -> println("Доброй ночи!")
    }
}