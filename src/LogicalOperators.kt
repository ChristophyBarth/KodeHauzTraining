
fun main (){
    val q = 14
    val t = 11
    val m = 7
    var result : Boolean

    result = (t>q) && (t<m)
    println(result)

    result = (q>t) || (t<m)
    println(result)

    val a = 171
    val b = 3
    val c = a.or(b)
    val d = a.and(b)

    println(c)
    println(d)

}