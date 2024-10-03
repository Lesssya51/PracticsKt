fun evaluateExpression(expression: String): Int {
    val parts = expression.split("+", "-")
    var result = parts[0].toInt()
    for (i in 1 until parts.size) {
        val operator = expression[parts[i - 1].length + i - 1]
        val operand = parts[i].toInt()
        when (operator) {
            '+' -> result += operand
            '-' -> result -= operand
        }
    }
    return result
}

fun main() {
    val equation = "1+1"
    val result = evaluateExpression(equation)
    println("$equation = $result")
}