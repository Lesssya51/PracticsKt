fun main() {
    var continueLoop = true

    while (continueLoop) {
        print("Введите первое число: ")
        val num1 = readLine()?.toIntOrNull() ?: 0

        print("Введите второе число: ")
        val num2 = readLine()?.toIntOrNull() ?: 0

        print("Выберите операцию (+ или ): ")
        val operation = readLine()

        if (operation == "+") {
            println("$num1 + $num2 = ${num1 + num2}")
        } else if (operation == "") {
            println("$num1  $num2 = ${num1 * num2}")
        } else if (operation == "стоп") {
            continueLoop = false
        } else {
            println("Некорректная операция!")
        }
    }

    println("Программа завершена.")
}