package kt.constructors.com

class Person(val firstName: String, var age: Int) {


    //class Person(fName: String, myAge : Int) {
//    val firstName: String = fName.capitalize()     //Still an initialization method
//    var age : Int = myAge
//
////    val firstName: String
////    var age : Int
//
//    //initializing block
//    init {
////        firstName=fName.capitalize()
////        age=myAge
//
//        println("First Name = $firstName")
//        println("Age = $age")
//    }
//
//}
//class Person (_firstName: String = "UNKNOWN", _age:Int = 0){
//    val firstName = _firstName.capitalize()
//    var age = _age
//    init {
//        println("First Name = $firstName")
//        println("Age = $age")
//    }
//}
    class Person(_firstName: String = "UNKNOWN", _age: Int = 0) {
        val firstName = _firstName.capitalize()
        var age = _age

        init {
            println("First Name = $firstName")
            println("Age = $age")
        }
    }
}