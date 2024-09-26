fun main() {
    println("Введите двузначное число:")
    val number = readLine()!!.toInt()

    if (number in 10..99 || number in -99..-10) {
        val firstDigit = number / 10
        val secondDigit = number % 10

        // a) Какая из его цифр больше: первая или вторая
        when {
            firstDigit > secondDigit -> println("Первая цифра ($firstDigit) больше второй ($secondDigit).")
            firstDigit < secondDigit -> println("Вторая цифра ($secondDigit) больше первой ($firstDigit).")
            else -> println("Обе цифры равны.")
        }

        // b) Одинаковы ли его цифры
        if (firstDigit == secondDigit) {
            println("Цифры двузначного числа одинаковы.")
        } else {
            println("Цифры двузначного числа не одинаковы.")
        }
    } else {
        println("Введенное число не является двузначным.")
    }
}