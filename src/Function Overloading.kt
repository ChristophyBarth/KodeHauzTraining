fun main (){
    addNum (3,3,3.0)
}

fun addNum (x:Int, y:Int){
    val sum = x + y
    println("$x + $y = $sum")
}

fun addNum (x:Int, y:Int, z:Int){
    val sum = x + y + z
    println("$x + $y + $z = $sum")
}

fun addNum (x:Int, y:Int, z:Double){
    val sum = x + y + z
    println("$x + $y + $z = $sum")
}