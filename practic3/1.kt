fun main(){
    println("Введите три числа: ")
    val a= readLine()!!.toDouble()
    val b=readLine()!!.toDouble()
    val c=readLine()!!.toDouble()
    println("Максимальное число: ")

    val maxnun= if(a>=b && a>=c){
        a
    }
    else if(b>=a && b>=c){
        b
    }
    else{
        c
    }
    println(maxnun)
}