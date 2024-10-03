fun containsSubstring(text: String, substring: String): Boolean {
    return text.contains(substring)
}

fun main() {
    val text = "Hello, world!"
    val substring = "world"
    println("Does the text contain the substring? ${containsSubstring(text, substring)}")
}