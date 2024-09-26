fun main() {
    println("Введите натуральное число:")
    val number = readLine()!!.toInt()

    // a) Является ли оно четным
    if (number % 2 == 0) {
        println("Число $number является четным.")
    } else {
        println("Число $number не является четным.")
    }

    // b) Оканчивается ли оно цифрой 7
    if (number % 10 == 7) {
        println("Число $number оканчивается на цифру 7.")
    } else {
        println("Число $number не оканчивается на цифру 7.")
    }
}