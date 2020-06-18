fun showInfo (cadId:Int){
    println("CardID: $cadId")
}

fun showInfo (name:String){
    println("Name: $name")
}

fun main (){
    showInfo(name = "Chris")
    showInfo("Chris")
    showInfo(7984704)

}