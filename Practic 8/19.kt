fun main(){
    var array = null
    val max = array?.let { findMax(it) }
println("Наибольшее число в массиве: $max")
}
fun findMax(array: IntArray): Int {
    var max = array[0]
    for (i in 1 until array.size) {
        if (array[i] > max) {
            max = array[i]
        }
    }
    return max
}