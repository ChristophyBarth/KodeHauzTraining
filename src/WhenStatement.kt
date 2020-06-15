fun main (){
    println("Enter Your Age")
    val age = readLine()!!.toInt()

    when {
        age < 18 -> println("You're still young")
        age >= 18 -> println("You're an adult")
        age > 50 -> print("You're a grandpa")

        else -> println("I don't Know")


    }
}