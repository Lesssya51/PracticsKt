import java.text.DecimalFormat

fun main() {
    val number = 3.14159265358979323846

    // Создаем форматтер для форматирования с точностью до сотых
    val formatter = DecimalFormat("#.##")

    // Форматируем число с помощью форматера
    val formattedNumber = formatter.format(number)

    // Выводим результат на экран
    println(formattedNumber)
}