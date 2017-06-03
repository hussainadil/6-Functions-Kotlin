
// Define functions
fun sum (A: Int,B: Int):Int{
    return A+B
} // return type function
fun HelloWorld(Name: String):Unit{
    println("Name Display Function: " +Name )
}// not return type


fun main (args: Array<String>){
    //first function
    var Result=sum(10,12)
    println(Result)

    Result=sum(44,12)
    println(Result)

    Result=sum(60,12)
    println(Result)
    // 2nd function
    HelloWorld("Hello World")

}// OverLoading.main function for execute the programme