fun getDayOfWeek(dayNumber: Int): String {
    return when (dayNumber) {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        7 -> "Воскресенье"
        else -> "Некорректный номер дня"
    }
}

fun main() {
    val dayNumber = 3 
    val dayOfWeek = getDayOfWeek(dayNumber)
    println("День недели: $dayOfWeek")
}