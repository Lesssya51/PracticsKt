fun main() {
    val x = true
    val y = true
    val z = false
    //a) не X и Y
    val a = !x and y
    val b = !(5 > 1) and (55 < 34)
    println(a)
    println(b)

    //b) X или не Y
    val c = x or !y
    val d = (344 >= 18) or !(550 <= 340)
    println(c)
    println(d)

    //c) X или Y и Z
    val f = x or y and z
    val v = (344 >= 18) or !(550 <= 340) and (65>13)
    println(f)
    println(v)
}