package OverLoading

// function ovr loading same fun name with different paramaters

fun result (a1: Int,b2:Int):Int {
    return     a1+b2
}


fun result (a1: Int,b2:Int,c3:Int):Int{
  return a1+b2+c3
}

fun result (a1: Int,b2:Int,c3:Int,d4:Int):Int{
  return a1+b2+c3+d4
}

fun main (args:Array<String>){
    var res= result(10,20)
    println(res)
    res= result(10,20,30)
    println(res)
    res= result(10,20,30+40)
    println(res)
}