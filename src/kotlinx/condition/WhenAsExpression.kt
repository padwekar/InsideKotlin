package kotlinx.condition

fun main(args : Array<String>){

    //When as Expression
    val x = 7

    val preferredValue = when(x){
       in 1..5 ->  5
       in 6..9 -> 9
       else -> 10
   }

    print("Preferred Value $preferredValue")
}