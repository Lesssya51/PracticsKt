fun main() {
    val errorCode = 200

    when (errorCode) {
        100 -> println("Ошибка сети")
        200 -> println("Ошибка сервера")
        300 -> println("Ошибка базы данных")
        else -> println("Неизвестная ошибка")
    }
}