fun main() {
    val x = false
    val y = false
    val z = true
    //a) X или Y и не Z
    val a = x or y and !z
    val b = (5 > 1) or (55 < 34) and !(675 >= 33)
    println(a)
    println(b)

    //b) X и не Y или Z
    val d = x and !y or z
    val c = (5 > 1) and !(55 < 34) or (675 >= 33)
    println(d)
    println(c)

    //c) не X и не Y
    val f = !x and !y
    val v = !(5 > 1) and !(55 < 34)
    println(f)
    println(v)

    //d) X и (не Y или Z)
    val n = x and(!y or z)
    val m = (5 > 1) and (!(55 < 34) or (675 >= 33))
    println(n)
    println(m)

    //i) не (X и Z) или Y
    val k = !(x and z) or y
    val l = !((5 >= 11) and (55 <= 134)) or (675 >= 33)
    println(k)
    println(l)

    //f) X или (не (Y или Z))
    val q = x or (!(y or z))
    val w = (81>=45) or (!(53<=77) or (62>=91))
    println(q)
    println(w)
}