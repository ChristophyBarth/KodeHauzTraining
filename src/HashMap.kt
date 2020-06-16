fun main (){
    var listOfUsers = HashMap<Int, String>()
    listOfUsers[123] = "Barry"
    listOfUsers[123] = "Raymond"
    listOfUsers[123] = "Mary"

    println("Print ID 123: ${listOfUsers[123]}")
    for (i in listOfUsers.keys){
        println("$i: ${listOfUsers[i]}")
    }
}