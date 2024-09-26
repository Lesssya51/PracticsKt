fun main() {
    println("Введите страну:")
    val country = readLine()!!.lowercase()

    when (country) {
        "сша", "usa" -> println("Национальность: американец/американка")
        "россия", "russia" -> println("Национальность: россиянин/россиянка")
        "япония", "japan" -> println("Национальность: японец/японка")
        else -> println("Неизвестная страна")
    }
}