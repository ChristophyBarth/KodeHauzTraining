//fun test (){
//    println("I want to add")
//}
//
//fun add (x:Int, y:Int){
//    val sum = x + y
//    println(sum)
//}


//fun returnNum (message:String, c:Double, b:Double):Double {
//    val sumOfNum = c + b
//    return sumOfNum
//}
//
fun arrayFun (vararg names:String){

    for (i in names){
        println(i)
    }

}

//fun sumTest (r:Int, s:Int){
//    val sum = r + s
//    println(sum)
//
//}

fun main (){
    println("What do you want to do?")
//    test()
//    add(3, 4)
//    returnNum("hey", 4.5, 4.0)
    arrayFun(names = *arrayOf("chris", "me", "who you?"))
//    sumTest(r= readLine()!!.toInt(), s = readLine()!!.toInt())
}