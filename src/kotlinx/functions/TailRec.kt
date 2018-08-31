package kotlinx.functions

import java.math.BigInteger

fun main(args : Array<String>){
    print(fibonacciNumberAt(20000,BigInteger("1"),BigInteger("0")))
}


tailrec fun fibonacciNumberAt(position : Int,next : BigInteger,initial : BigInteger) : BigInteger{
    return if (position == 0) next else fibonacciNumberAt(position = position-1 , next = next + initial , initial = next)
}

//Fibonacci -> 0,1,1,2,3,5,8,13