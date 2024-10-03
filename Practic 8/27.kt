fun createArrayFromOneToN(n: Int): IntArray {
    return IntArray(n) { it + 1 }
}
fun main(){
    val n = 5
    val newArray = createArrayFromOneToN(n)
    println("Массив от 1 до $n: ${newArray.contentToString()}")

}