fun main() {
    println("Введите длины сторон треугольника:")
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()

    val type = determineTriangleType(a, b, c)

    println("Треугольник - $type")
}

fun determineTriangleType(a: Double, b: Double, c: Double): String {
    if (a + b > c && a + c > b && b + c > a) {
        if (a == b && b == c) {
            return "равносторонний"
        } else if (a == b || a == c || b == c) {
            return "равнобедренный"
        } else {
            return "разносторонний"
        }
    } else {
        return "не треугольник"
    }
}