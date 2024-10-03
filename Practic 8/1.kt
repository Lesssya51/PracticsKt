
fun sumListElements(list:List<Int>): Int {
    var sum = 0
    for (element in list) {
        sum += element
    }
    return sum
}
    fun main() {
        val myList = listOf(1, 2, 3, 4, 5)
        val sum = sumListElements(myList)

        println("Сумма элементов: $sum") 
    }

