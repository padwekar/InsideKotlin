package kotlinx.functions.basics

/*
    Scenario is i want positive as well as negative square root of any value
*/

fun main(args : Array<String>){

    val value = 16

    fun getPosNegSqRoot() : Pair<Double,Double> =  Pair(Math.sqrt(value.toDouble()),-Math.sqrt(value.toDouble()))

    val (pos,neg,neutral) = Triple(1,2,"Saurabh")

    if (neutral is String) print("Neutral is string")

    println("+ve Sqrt of $value is $pos")
    println("-ve Sqrt of $value is $neg")

}

