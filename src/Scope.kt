var word = "Boy" //Global Variable (can be used in any scope because it exists outside all functions)

fun userDetail(){
  val word = "Coco" //Local Variable
    println(word)
}

fun main (){
    println(word)
    userDetail()
}