fun main(){
    println("Введите двузначное число: ")
    val number=readLine()?.toIntOrNull()?:0
    if(number in 10..99) {
        val tensDigit = number / 10
        val unitsDigit = number % 10
        val sum = tensDigit + unitsDigit
        val product = tensDigit * unitsDigit
        println("Число десятков: $tensDigit")
        println("Число едениц: $unitsDigit")
        println("Сумма цифр: $sum")
        println("Произведение цифр: $product")
    }else{
        println("Введено некорректное число. Введите двузначное число.")

    }
}