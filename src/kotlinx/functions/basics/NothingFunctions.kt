package kotlinx.functions.basics

import kotlinx.functions.User

/*
* A function that has Nothing return type won't return anything and it will never reach return
statement. It can only throw an exception. Nothing functions are designed to throw exception
*/

fun main(args : Array<String>){

    fun fail() : Nothing = throw Error("Something went wrong brother")

    fun activeUser(id : String?) = id ?:  fail()
    /*
        Nothing inharits from all the type
        Advantage of nothing type is that error can be thrown without influencing the return type.
     */

    activeUser(null)
}