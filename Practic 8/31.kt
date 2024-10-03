fun reverseString(str: String): String {
    return str.reversed()
}

fun main() {
    val str = "Hello, world!"
    val reversedStr = reverseString(str)
    println("Обратная строка: $reversedStr")
}