package kotlinx.functions

fun main(args : Array<String>){
    val list = mutableListOf<Int>(1,3,4,6,8,11)
    list.filterIt { it == 4 }
    list.minorFilter { it == 4 }
}


inline fun<T> MutableList<T>.filterIt(condition: (item : T) -> Boolean) {
     val filteredList = mutableListOf<T>()
    this.forEach {
        if(condition(it)){
            return // Non Local Return
        }
        println(it)

    }
}

inline fun<T> MutableList<T>.minorFilter(condition: (item : T) -> Boolean) {
    val filteredList = mutableListOf<T>()
    this.forEach {
        if(condition(it)){
            return@forEach //Local Return
        }
        println(it)

    }
}

inline fun<T> MutableList<T>.namedFilter(condition: (item : T) -> Boolean) {
    val filteredList = mutableListOf<T>()
    this.forEach myloop@ {
        if(condition(it)){
            return@myloop //Local Return
        }
        println(it)

    }
}