fun countVowels(text: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    var vowelCount = 0
    for (char in text) {
        if (char in vowels) {
            vowelCount++
        }
    }
    return vowelCount
}

fun main() {
    val text = "Hello, world!"
    println("Number of vowels in the text: ${countVowels(text)}")
}