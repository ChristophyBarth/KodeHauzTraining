fun main (){
    var listImmutable = listOf("Chris", "Barth")
    for (
        name in listImmutable
    )
    {
        println(name)
    }

    var listMutable = mutableListOf("Chris", "Ezinne")
    listMutable[0] = "Charles"
    for (name in listMutable){
        println(name)
    }

    var listOfUsers = mapOf(1 to "Chris", 2 to "Barth")
    println(listOfUsers[1])

    var listOfUsersM = mapOf(1 to "Chumsy", 2 to "Perry")
    println(listOfUsers[2])
}

