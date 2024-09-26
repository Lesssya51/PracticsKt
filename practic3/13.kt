fun main() {
    println("Введите четырехзначное число:")
    val number = readLine()!!.toInt()

    if (number in 1000..9999 || number in -9999..-1000) {
        val firstDigit = number / 1000
        val secondDigit = (number / 100 % 10)
        val thirdDigit = (number / 10 % 10)
        val fourthDigit = number % 10

        // a) Равна ли сумма двух первых его цифр сумме двух его последних цифр
        if (firstDigit + secondDigit == thirdDigit + fourthDigit) {
            println("Сумма первых двух цифр равна сумме последних двух цифр.")
        } else {
            println("Сумма первых двух цифр не равна сумме последних двух цифр.")
        }

        // b) Кратна ли трем сумма его цифр
        if ((firstDigit + secondDigit + thirdDigit + fourthDigit) % 3 == 0) {
            println("Сумма цифр числа кратна трем.")
        } else {
            println("Сумма цифр числа не кратна трем.")
        }

        // c) Кратно ли четырем произведение его цифр
        if ((firstDigit * secondDigit * thirdDigit * fourthDigit) % 4 == 0) {
            println("Произведение цифр числа кратно четырем.")
        } else {
            println("Произведение цифр числа не кратно четырем.")
        }

        //d) Кратно ли произведение его цифр числу а

        println("Введите число а:")
        val a = readLine()!!.toInt()
        if ((firstDigit * secondDigit * thirdDigit * fourthDigit) % a == 0) {
        println("Произведение цифр числа кратно числу а.")
        } else {
            println("Произведение цифр числа не кратно числу а.")
        }
    }

    else {
        println("Введенное число не является четырехзначным.")
    }
}