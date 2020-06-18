//Normal function
//fun sum(num1: Int, num2:Int):Int{
//   var mySum = num1 + num2
//    return mySum
//}

//Lambda function
val sum = {num1: Int, num2:Int ->
    num1 + num2
}

fun main(){
    val addNum = sum(1,2)
    println(addNum)
    println("List of numbers")
    val listOfNumbers = listOf(10,19,18,16)

    //normal loop
    for (i in listOfNumbers){
        println(i)
    }

    //Lambda loop
    listOfNumbers.forEach { i ->
        println(i)
    }
}