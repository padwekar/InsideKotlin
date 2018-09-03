package kotlinx.functions

fun main(args : Array<String>){

    print(subtractAndMultiply(10,5,{}){ x,y -> x * y })

}

//Example of inline function
inline fun sumAndMultiply(a : Int,b : Int,multiply : (x : Int , y: Int) -> Int) : Int{
    return (a + b) * multiply(a,b)
}

//Example of noinline modifier
inline fun subtractAndMultiply(a : Int,b : Int,shuffle : () -> Unit ,noinline multiply : (x : Int , y: Int) -> Int) : Int{ // Expected performance impact of inline is insignificant
    return (a - b) * multiply(a,b)
}

inline fun subAndMultiply(a : Int,b : Int ,noinline multiply : (x : Int , y: Int) -> Int) : Int{ // Expected performance impact of inline is insignificant
    return (a - b) * multiply(a,b)
}