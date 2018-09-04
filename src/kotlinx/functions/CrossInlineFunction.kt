package kotlinx.functions

//@CrossInline ::: Functions which doesn't allow non local returns

fun main(args : Array<String>){
    val minilist = mutableListOf<String>("A","B","Error","C")
    count(minilist){
        if(it.equals("Error")) {
           // return //
            // Error :: Return Inside Lambda is not allowed
            return@count
        }
        println(it)
    }
}

inline fun count(list : MutableList<String> ,crossinline greet : (String) -> Unit){
    list.forEach {
        greet(it)
    }
}

//1. Return inside lambda expression not allowed
//2. Return inside inline function is allowed
//3. Such Returns are called non- local returns
//4. To disable the non local return use crossinline with the function parameter