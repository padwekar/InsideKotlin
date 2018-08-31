package kotlinx.functions

fun main(args : Array<String>){
    print(5 isSmallerThan 10)
}

//Infix + Extension
infix fun Int.isSmallerThan(int: Int) = !this.isLargerThan(int)