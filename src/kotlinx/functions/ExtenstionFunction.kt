@file:JvmName("ExtensionDemo")

package kotlinx.functions

class Student {
    fun hasPassed(marks : Int) = marks >= 40
}


fun main(args : Array<String>){

}

fun compareInts(){
    println(1.isLargerThan(2))
    println(1.isSmallerThan(2))
}

fun greeting(){ //Using Extension
    val greet = "Hey"
    println(greet.add("Saurabh"))
}

fun demo(){
    println("Has passed ${Student().hasPassed(93)}")
    print("Is Polite ${Student().isPolite(93)}")
}

//Int Extensions
fun Int.isLargerThan(int: Int) = this > int



//String Extensions
fun String.add(firstName: String,lastName: String ="") = "$this $firstName $lastName"


//Student Extensions
fun Student.isPolite(disciplinePoints : Int) = disciplinePoints > 10
