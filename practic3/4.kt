//Вводятся два числа (большее и меньшее). Определить, кратно ли
//первое число второму, то есть делится ли первое число нацело на
//второе. Вывести на экран сообщение об этом, а также остаток от
//деления, если первое число не кратно второму.
fun main(){
    println("Введите большее и меньшее числа: ")
    val num1=readLine()!!.toInt()
    val num2=readLine()!!.toInt()
    if (num2 != 0) {
        if (num1 % num2 == 0) {
            println("Число $num1 кратно числу $num2.")
        } else {
            val remainder = num1 % num2
            println("Число $num1 не кратно числу $num2. Остаток от деления: $remainder.")
        }
    } else {
        println("Ошибка: деление на ноль.")
    }
}
