package kotlinx.functions

import kotlin.random.Random

/*
    Generic functions allows you to create a function that will work
    for different different types.
 */


fun main(generics : Array<String>){
    repeat(10) {  println(pick<String>("First","Second","Third")) }
}


fun <T>pick(first : T,second : T,third : T) = when(Random.nextInt(3)) {
    0 -> first
    1 -> second
    else -> third
}