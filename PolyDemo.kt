/* Same fun name same number of parameters but with differrent type
is called polymorphism*/

package Polymorphism
 fun display(name:String):Unit{
     println("Name is :"+name)
 }
fun display(number:Int):Unit{
    println("Num Int is :"+number)
}
fun display(numberD:Double):Unit{
    println("Num Double is :"+numberD)
}
fun main (args:Array<String>){
    display("Aadil")
    display(10)
    display(23.87)
}