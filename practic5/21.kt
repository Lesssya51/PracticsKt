import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    println("Введите год:")
    val year = readLine()!!.toInt()

    println("Введите месяц (числом от 1 до 12):")
    val month = readLine()!!.toInt()

    val startDate = LocalDate.of(year, month, 1)
    val endDate = startDate.plusMonths(1).minusDays(1)

    val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")

    println("Даты в месяце $month/$year:")
    var date = startDate
    while (date <= endDate) {
        println(date.format(formatter))
        date = date.plusDays(1)
    }
}