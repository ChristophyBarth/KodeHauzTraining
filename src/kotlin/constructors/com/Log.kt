package kotlin.constructors.com

open class Log {
    var data:String = ""
    var numOfData = 0
    constructor(_data:String){
    }
    constructor(_data: String,_numOfData: Int){
    }
}
class AuthLog:Log{
    //   constructor(_data: String) : super(_data){
//
//    }
    constructor(_data: String) : this( "From AuthLog ->" + _data,10){
    }
    constructor(_data: String, _numOfData: Int) : super(_data, _numOfData){
    }
}