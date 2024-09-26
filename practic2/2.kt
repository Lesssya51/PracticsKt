fun main(){
    println("Введите трёхзначное число: ")
    val number=readLine()?.toIntOrNull()?:0
    if (number in 100..999) {
        val unitsDigit = number % 100
        val tensDigit = number / 100
        val sum = tensDigit + unitsDigit
        val product = tensDigit * unitsDigit
        println("Число едениц: $unitsDigit")
        println("Число десятков: $tensDigit")
        println("Сумма цифр: $sum")
        println("Произведение цифр: $product")
    }else{
        println("Введено некорректное число. Введите трёхзначное число.")


    }
}