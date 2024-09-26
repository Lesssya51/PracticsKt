fun main(){
    println("Введите три числа: ")
    val a=readLine()!!.toInt()
    val b=readLine()!!.toDouble()
    val c=readLine()!!.toDouble()
    println("Среднее число: ")

    val averagenum= if(a>=a && b>=b && c>=c) {
        println("Mistake")
    }
    else if(a>=b && a<=c) {
        a
    }
    else if(b>=a && b<=c){
            b
        }
    else if(c>=a && c<=b){
        c
    }
    else{
        println("Ошибка")
    }
        println(averagenum)
}