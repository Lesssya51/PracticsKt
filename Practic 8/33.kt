fun removeSpaces(str: String): String {
    return str.replace(" ", "")
}

fun main() {
    val str = "  Hello, world!  "
    val strWithoutSpaces = removeSpaces(str)
    println("Строка без пробелов: $strWithoutSpaces")
}