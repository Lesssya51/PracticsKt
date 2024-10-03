fun countCharacters(text: String): Int {
    return text.length
}

fun main() {
    val text = "Привет, мир!"
    println("Количество символов в строке '$text': ${countCharacters(text)}") 
}