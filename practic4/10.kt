fun main() {
    println("Введите группу крови (A, B, AB, O):")
    val bloodGroup = readLine()!!.toUpperCase()

    when (bloodGroup) {
        "A" -> println("Можно переливать: A, O")
        "B" -> println("Можно переливать: B, O")
        "AB" -> println("Можно переливать: A, B, AB, O")
        "O" -> println("Можно переливать: O")
        else -> println("Неверный ввод.")
    }
}