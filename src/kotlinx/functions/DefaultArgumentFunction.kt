@file:JvmName("DefaultFunctions")

package kotlinx.functions

fun main(args : Array<String>){
    println("Area of rectangle ${area(10.0, 15.0)}")
    println("Area of square ${area(10.0)}")

}

@JvmOverloads
fun area(length : Double , breath : Double = length) = length * breath