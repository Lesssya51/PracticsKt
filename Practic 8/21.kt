fun isPalindrome(text: String): Boolean {
    val cleanedText = text.toLowerCase().replace("\\s".toRegex(), "")
    return cleanedText == cleanedText.reversed()
}

fun main() {
    val text1 = "А роза упала на лапу Азора"
    val text2 = "Hello world"
    println("'$text1' - палиндром: ${isPalindrome(text1)}") 
    println("'$text2' - палиндром: ${isPalindrome(text2)}")
}