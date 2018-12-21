@file:JvmName("Ranges")

package kotlinx.basics

import kotlinx.functions.isSmallerThan

fun main(args : Array<String>){
    val r1 = 1..5 step 3
    //Range contains 1,4

    val r2 = 5 downTo 1
    //Range contains 5,4,3,2,1
    
    val r3 = 5 downTo 1 step 2
    //Range contains 5,3,1

    val r4 = "a".."z"

    val r5 = 'a'..'z'

    var isCharacterPresent = 'c' in r5

    var isNumberPresent = 2 in r1


    val  countDown = 10.downTo(1)

    val moveUp = 1.rangeTo(10)

    r1.forEach { println(it) }

}