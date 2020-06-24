package com.greeter.people

class greeter {

    var text : String = ""

    fun greet (){
        println("Hello Object Oriented Programming")
    }

    fun greet (name : String){
        println("Hi $name")
    }

    fun main (){
        greet()
    }


}