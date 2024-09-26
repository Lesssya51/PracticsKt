fun main() {
    println("Введите тип пищи:")
    val foodType = readLine()!!.toLowerCase()

    val cookingTime = when (foodType) {
        "колбаса" -> 3
        "гречка" -> 10
        "блины" -> 20
        "курица" -> 30
        "говядина" -> 60
        else -> {
            println("Неизвестный тип пищи.")
            0
        }
    }

    if (cookingTime != 0) {
        println("Примерное время приготовления: $cookingTime минут.")
    }
}