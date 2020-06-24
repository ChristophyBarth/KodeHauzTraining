package com.greeter.people

fun main (){
    val greeter = greeter()
    greeter.text = "Hi"
    greeter.greet("Chris")
    println(greeter.greet("Barth"))

}