fun main() {

    var listOfPet = ArrayList<String>()
    do {
        println("Enter pet name or exit to quit: ")
        val petName = readLine()!!.toString()
        if (petName != "quit") {
            listOfPet.add(petName)
        }
    } while (petName != "quit")

    println("Your pets are, using Object: ")
    for (pet in listOfPet) {
        println("Pet $pet")
    }


//    println("Your pets are, using Index: ")
//    for (i in 0 until listOfPet.size){
//        println("Pet $i: ${listOfPet[i]}")
//    }
}