package kotlinx.functions.standardlibfunc

/*
    Repeats a function n times.
 */

fun main(repeat : Array<String>){
    val eat = { _ : Int -> println("Eating") }
    repeat(5,eat)
}