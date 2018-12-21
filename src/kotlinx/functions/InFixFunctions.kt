package kotlinx.functions

fun main(args : Array<String>){
    var distance = 10 to 100
    print("Distance from 10 to 100 is $distance")
}

//Infix + Extension
infix fun Int.isSmallerThan(int: Int) = !this.isLargerThan(int)

infix fun Int.to(int: Int) = Math.abs(this - int)