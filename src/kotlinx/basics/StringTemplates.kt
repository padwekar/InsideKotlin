@file:JvmName("Healer")

package kotlinx.basics

fun main(args : Array<String>){
    calculate()
}

fun greet(){
    val name = ""
    val greet = "Hello $name.\nName is ${name.length} characters long."
    print(greet)
}

fun calculate(){
    val numOne = 1
    val numTwo = 2

    val greet = "Sum of $numOne & $numTwo is ${numOne + numTwo}"
    print(greet)

}