fun main(){
    println("\nВведите число N:")
val n = readLine()!!.toInt()
val sumOfSquares = sumOfSquares(n)
println("Сумма квадратов чисел от 1 до $n: $sumOfSquares")
}
fun sumOfSquares(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}