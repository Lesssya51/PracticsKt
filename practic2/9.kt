fun main() {
    val a = true
    val b = false
    val c = false
    //a) не А и В
    val d = !a and b
    val e = !(20 < 99) and (3 >=3)
    println(d)
    println(e)

    //b) А или не В
    val f = a or !b
    val j = (100 < 99) or !(200 >=3)
    println(f)
    println(j)

    //c) А и В или С
    val s = a and b or c
    val v = (17 < 30) and (2 >=455) or (46 <= 112)
    println(s)
    println(v)
}