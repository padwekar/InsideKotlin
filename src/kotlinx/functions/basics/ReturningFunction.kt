package kotlinx.functions.basics

/*
    But unlike void Unit can be treated as a object
 */
fun main(args : Array<String>){
    var b = printSum(2 , 6)
    print(b is Unit) //true
}

/*
    In kotlin all functions returns some value. If you do not provide the return type.
    Then by default function will return an instance of Unit.
 */


/*
    Unlike in Java, we are defining the return type after function name and
    parameters.
 */


fun printSum( a : Int , b : Int) : Unit{ // Unit is redundant here
    print(a + b)
}

