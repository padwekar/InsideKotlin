
package kotlinx.functions

fun main(args : Array<String>){
    sleep()
}

//Title: Non Restrictive Access

//Calling public inline from public inline ( OK )
inline fun performNightRituals(){
    sleep()
}

//Calling public inline from private inline ( OK )
private inline fun meditate(){
    yoga()
}

//Calling private inline from private inline ( OK )
private inline fun think(){
    relax()
}

//Title: Restrictive Access

//Calling private inline from public inline ( Compilation Error )
inline fun relaxAndSleep(){
  //  relax() //C.E Kotlin: Public-API inline function cannot access non-public-API 'private fun relax()'
}

//Calling internal inline from public inline ( Compilation Error )
inline fun eat(){
     //chew() //C.E Kotlin: Public-API inline function cannot access non-public-API 'private fun relax()'
}

//Title : Passing Functions

//Cannot pass a function parameter to a non inline function from a inline function
fun openWings(function: ()->Unit){
    println("Opening Wings")
}

inline fun fly(function: ()->Unit){
    //openWings(function) //illegal Usage of inline parameter function since function is not yet created just defined
}

/*
Title: We Cannot make to many functions inline


 */

//Title : Core Functions
inline fun openWingsSmoothly(function: ()->Unit){
    println("Opening Wings")
}


inline fun flySmoothly(function: ()->Unit){
    openWingsSmoothly(function) //No compilation error
}

private inline fun yoga(){ // No Error
    sleep()
}

inline fun sleep(){
    println("Sleeping")
}

// internal Inline
internal fun chew(){
    println("Chewing")
}

// private Inline
private fun relax(){
    println("Sleeping")
}