package kotlinx.functions.basics

import kotlinx.functions.User

fun main(args : Array<String>){
   var hell =  log("Saurabh Padwekar")
}

/*
* In Single Expression function the curly brackets can be omitted and the return type is automatically decided by the smart compiler*/
fun square(number : Int) = number * number

fun log(message : String) = println(message)

fun sum(a : Int, b : Int) : Int {
    return a + b
}

// Using "=" infers the return type
fun book(timeSlot : Int?,user : User) = when(timeSlot) {
    in 1..3 -> 2
    else -> 1
}