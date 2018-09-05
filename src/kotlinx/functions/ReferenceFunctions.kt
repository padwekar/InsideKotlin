package kotlinx.functions

fun main(args : Array<String>){

    val list = listOf<Int>(1,2,3,4,6)

    fun isOdd(i : Int) = i % 2 == 1

    fun isEven(i : Int) = !isOdd(i)

    ::isOdd.invoke(1)
    //Example : 1
    list.filter { isOdd(it) }.map { println(it) } // One Way : Normal Way
    list.filter(::isOdd) //Using Function Reference

    //Example : 2
    val plist = listOf<() -> Unit>(::sayHello,::sayHii)
    plist.forEach {
        it()
    }

    //Example : 3
    val mlist = listOf<(Int) -> Boolean>(::odd,::even)
    mlist.forEach {
        it.invoke(1)
    }

    //Example : 4
    var stringList = mutableListOf<String>("A","B","","D")

    val kyaYeEmptyHai : (String) -> Boolean = String:: isEmpty //You can reference existing methods of existing classes
    print("Is it empty ${kyaYeEmptyHai.invoke("H")}")


}



fun odd(number: Int) : Boolean{
    return number % 2 == 1
}

fun even(number: Int) : Boolean {
    return !odd(number)
}


fun sayHello() {
    println("Hello")
}

fun sayHii(){
    println("Hii")
}