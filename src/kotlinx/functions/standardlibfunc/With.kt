package kotlinx.functions.standardlibfunc

import kotlinx.classes.Doctor

/*
    Top level function when you don't want to repeat the receiver name multiple times.
    Using with on any instance you can call different method and properties of the instance without
    repeating the receiver name.
 */

fun main(args : Array<String>){
    sampleWithExample()
}

fun sampleWithExample(){
    val doctor  = Doctor()
    with(doctor){
     name = "hello"
    }
}