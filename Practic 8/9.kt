fun repeatString(txt: String, n: Int): String {
    if (n == 1) {
        return txt
    } else {
        return txt + repeatString(txt, n - 1)
    }
    fun main() {
        val text = "Hello"
        val repeatCount = 3
        val repeatedText = repeatString(text, repeatCount)
        println(repeatedText) // Вывод: HelloHelloHello
    }
}