import kotlin.math.sqrt
fun main(){
    println("Введите число: ")
    val number=readLine()!!.toDouble()
    val root= sqrt(number)
    println("Квадратный корень из $number равен $root")
}