fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()
    val sum = (n * (n + 1)) / 2

    println("Сумма чисел от 1 до $n: $sum")
}