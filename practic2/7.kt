fun main(){
    val a= true
    val b=false
    val c=false
    //a) A или B
    val d=a or b
    val e=(12>5) or (55<34)
    println(d)
    println(e)

    //b) A и B
    val f=a and b
    val i=(45<=67) and (7>1)
    println(f)
    println(i)

    //c) B или C
    val v=b or c
    val k=(888<1000) or (54>10)
    println(v)
    println(k)
}