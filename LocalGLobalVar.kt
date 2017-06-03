/**
Global and Local Veriables
local veribale define only in block of code or main fun
and global out from the block of code which acces in any function
 */


package LocalGlobalVariable

var fullname="Aadil Hussain Rajper"  // Global Veriable

fun display(name:String):Unit{

    // println(name1) we can not access here variable of main fun
    println(fullname)
}
fun main (args:Array<String>){
    var name1 ="Aadil" // local veriable
    println(name1)
    println(fullname)

}