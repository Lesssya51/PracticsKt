fun containsElement(array: Array<Any>, element: Any): Boolean {
    return array.contains(element)
}
fun main(){
    val element = "Груша"
    val array = null
    val containsElement = array?.let { containsElement(it, element) }
    println("Элемент $element в массиве: $containsElement")
}