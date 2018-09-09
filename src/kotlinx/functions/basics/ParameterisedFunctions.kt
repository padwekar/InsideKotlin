package kotlinx.functions.basics

fun main(args : Array<String>){
    add(2,3)   //1
}


fun add( a : Int , b : Int){ //2
    print(a + b)
}

/*
  Difference : Parameters and Arguments

  The actual value which is passed to a function or method is known as argument.
  The variable which are declared with the function is called parameter.
 */


/*
    The parameters passed are by default not mutable. Since it is error prone and can easily be misused
 */