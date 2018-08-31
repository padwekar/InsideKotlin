@file:JvmName("FunctionInfo")

package kotlinx.functions

fun main(args : Array<String>){
    print("Sum is ${add(2, 4)}")
}

fun add(num1 : Int, num2 : Int) =  num1 + num2