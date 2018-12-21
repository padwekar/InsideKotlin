package kotlinx.functions

import java.math.BigInteger

fun main(args : Array<String>){
    print(printFibonacci(BigInteger.valueOf(7000)))
}


tailrec fun fibonacciNumberAt(position : Int,next : BigInteger,initial : BigInteger) : BigInteger{
    return if (position == 0) next else fibonacciNumberAt(position = position-1 , next = next + initial , initial = next)
}

//to print fibonacci
tailrec fun printFibonacci(till : BigInteger, next: BigInteger = BigInteger.ONE, prev : BigInteger = BigInteger.ZERO) : BigInteger = when(till){

    BigInteger.ZERO -> prev

    else -> {

        printFibonacci(till- BigInteger.ONE,next+prev,next)
    }
}


//Fibonacci -> 0,1,1,2,3,5,8,13