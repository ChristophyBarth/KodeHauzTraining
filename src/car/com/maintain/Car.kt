package car.com.maintain

class Car(var type:String, val model:Int, val price:Double,
          val milesDrive:Int, val owner:String) {

    fun getCarPrice():Double{
//        val priceTotal = price - (milesDrive.toDouble()*10)
        return price - (milesDrive.toDouble()*10)
    }
}
fun main(){
//    val car1 = Car("BMW", 2016, 10000.0, 100,"CHRIS")
//    println(car1.owner)
//    car1.type = "KIA"
//    println(car1.type)
//    println(car1.price)
//    println(car1.getCarPrice())
//
//    val car2 = Car("FORD", 2017, 20000.0, 150,"EZINNE")
//    println(car2.owner)
//    println(car2.price)
//    println("Your price is ${car2.getCarPrice()}")

    val listOfCar = arrayListOf<Car>()
    listOfCar.add(Car("BMW", 2016, 10000.0, 100,"CHRIS"))
    listOfCar.add(Car("FORD", 2017, 20000.0, 150,"EZINNE"))
    for (car in listOfCar){
        println("-----------")
        println(car.owner)
        println(car.getCarPrice())
    }
}