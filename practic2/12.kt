fun main() {
    val a = true
    val b = false
    val c = false
    //a) А или не (А и В) или С
    val d = a or !(a and b) or c
    val e = (733 <= 59) or !((733 <= 59) and (65 > 8)) or (711 <= 88)
    println(d)
    println(e)

    //b) не А или А и (В или С)
    val x = !a or a and (b or c)
    val y = !(733 <= 59) or (733 <= 59) and ((65 > 8) or (711 <= 88))
    println(x)
    println(y)

    //c) (А или В и не С) и С
    val t = (a or b and !c) and c
    val u = ((733 <= 59) or (734 <= 69) and !(65 > 8)) and (19>=9)
    println(t)
    println(u)
}