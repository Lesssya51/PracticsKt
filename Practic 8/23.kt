fun toUpperCase(text: String): String {
    return text.uppercase()
}

fun main() {
    val text = "hello world"
    println("Текст в верхнем регистре: ${toUpperCase(text)}") 
}