//Даны два различных вещественных числа. Определить: а) какое из них
//больше; б) какое из них меньше
fun main(){
    println("Введите первое вещественное число: ")
    val num1=readLine()!!.toInt()
    println("Введите второе вещественное число: ")
    val num2=readLine()!!.toInt()
    if(num1>num2){
        println("Число $num1 > числа $num2")
    }
    else if(num2>num1){
        println("Число $num2 > числа $num1")
    }
}