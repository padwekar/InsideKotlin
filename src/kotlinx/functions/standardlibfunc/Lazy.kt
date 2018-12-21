package kotlinx.functions.standardlibfunc

/*
    Another useful stdlib function used to run heavy working function in lazy way. Code block
    will be initialised only when it is called first.
 */

fun main(lazy : Array<String>){
    val databaseOperation = lazy { fetchAllPostFromDatabase() }
    println("Is operation initialised ${databaseOperation.isInitialized()}")
    databaseOperation.value
    println("Is operation initialised ${databaseOperation.isInitialized()}")
}

fun fetchAllPostFromDatabase(){
    println("Fetching from database")
}