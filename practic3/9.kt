//Если целое число m делится нацело на целое число n, то вывести на
//экран частное от деления, в противном случае вывести сообщение "m
//на n нацело не делится".
fun main(){
    println("Введите два целых числа: ")
    val m=readLine()!!.toInt()
    val n=readLine()!!.toInt()
    val result=m/n
        if (n !=0 && m % n==0) {
            println("Частное от деления: $result")
        }
    else{
        println("$m на $n нацело не делится")
        }
}