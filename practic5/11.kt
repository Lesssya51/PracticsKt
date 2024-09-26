fun main() {
    println("Введите первую строку:")
    val str1 = readLine()!!.toLowerCase()
    println("Введите вторую строку:")
    val str2 = readLine()!!.toLowerCase()

    if (areAnagrams(str1, str2)) {
        println("Строки являются анаграммами.")
    } else {
        println("Строки не являются анаграммами.")
    }
}

fun areAnagrams(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }
    val charCounts = mutableMapOf<Char, Int>()
    for (char in str1) {
        charCounts[char] = charCounts.getOrDefault(char, 0) + 1
    }
    for (char in str2) {
        if (charCounts.getOrDefault(char, 0) == 0) {
            return false
        }
        charCounts[char] = charCounts.getOrDefault(char, 0) - 1
    }
    return true
}