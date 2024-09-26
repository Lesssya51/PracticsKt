fun main() {
    val x = false
    val y = true
    val z = false
    //a) X или Z
    val a = x or z
    val b = (3 > 57) or (556 < 349)
    println(a)
    println(b)

    //b) X и Y
    val c = x and y
    val d = (76<=45) and (12>3)
    println(c)
    println(d)

    //c) X и Z
    val g = x and z
    val h = (76>=34) and (12>5)
    println(g)
    println(h)
}