fun lastElement(array: Array<String>): Any? {
    return if (array.isNotEmpty()) array.last() else null
}
fun main(){
    val array = arrayOf("Яблоко", "Груша", "Банан")
    val lastElement = lastElement(array)
    println("Последний элемент массива: $lastElement")
}