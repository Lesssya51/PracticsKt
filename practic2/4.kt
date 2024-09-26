fun main(){
    print("Введите число: ")
    val number=readLine()!!.toDouble()
    print("Введите степень: ")
    val power=readLine()!!.toDouble()
    val result=Math.pow(number, power)
    println("$number в степени $power равно $result")
}