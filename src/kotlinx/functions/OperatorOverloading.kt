package kotlinx.functions

//Invoke let's you use any class as function.

fun main(args : Array<String>){
    val unknown = Father("MZP")
    println(unknown())
}
operator fun Pair<Int,Int>.plus(pair: Pair<Int,Int>) = Pair(this.first + pair.first,this.second + pair.second)


fun getAddition(pairOne: Pair<Int,Int>,pairTwo: Pair<Int, Int>) = pairOne + pairTwo

class Son(val name: String) {
    fun who() = "Son"
}

class Father(val name : String){
    fun who() = "Father"
    operator fun invoke() = name
}