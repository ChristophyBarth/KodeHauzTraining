fun main (){

//    println("Tell me your age")
//    val age = readLine()!!.toInt()
//
//    if (age > 18) { println("You're an adult!!")
//    }
//    else { println("Oops still a kid!")
//    }

    println("What's your score?")
    val score = readLine()!!.toInt()

    if (score < 30){
        println("Poor but you didn't reach the passmark!")
    }
    if (score in 30.. 50 ){
        println("Fair but you didn't reach the passmark!")
    }
    else {
        println("You passed!")
    }


//    //Writing an if statement in an if statement
//    val grade = readLine()!!.toInt()
//    if (grade>50) {
//        if (grade == 55) { print("hey")
//
//        } else {
//            println("ok")
//        }
//
//    }
}