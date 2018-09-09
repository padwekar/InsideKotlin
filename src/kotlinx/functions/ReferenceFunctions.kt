package kotlinx.functions

import kotlinx.functions.User.Companion.stand

fun main(args : Array<String>){

    val list = listOf<Int>(1,2,3,4,6)

    fun isOdd(i : Int) = i % 2 == 1

    fun isEven(i : Int) = !isOdd(i)

    ::isOdd.invoke(1)

    //Example : 1 // Ways to call functions
    list.filter { isOdd(it) }.map { println(it) } // Normal Way
    list.filter(::isOdd) //Using Function Reference

    //Example : 2 // Storing function reference inside
    val plist = listOf<() -> Unit>(::sayHello,::sayHii)
    plist.forEach {
        it()
    }

    //Example : 3 ( Instance function inside same class)
    val mlist = listOf<(Int) -> Boolean>(::odd,::even)
    mlist.forEach {
        it.invoke(1)
    }

    //Example : 4  ( Instance function inside another class )
    var stringList = mutableListOf<String>("A","B","","D")

    val kyaYeEmptyHai : (String) -> Boolean = String:: isEmpty //You can reference existing methods of existing classes
    print("Is it empty ${kyaYeEmptyHai.invoke("H")}")


    //Example : 5 ( Instance function inside User defined class)
    val eater : (User,String) -> Unit = User::eat
    val userEater : (User) -> Unit = User::eat

    eater.invoke(User(),"Apples")
    userEater.invoke(User())

    //Example : 6 ( Assigning Static Functions)
    val staticStand : (() -> Unit) = User.Companion::stand
    val instanceStand : ((User) -> Unit) = User::stand
    val staticHelper = Helper::emotionalHelp




    staticStand.invoke()
    instanceStand.invoke(User())
    staticHelper.invoke()

}



class User {

    fun eat(){
        println("Eating food")
    }


    fun eat(food : String){
        println("Eating $food")
    }

    fun stand(){
        print("Standing Instance")
    }

    companion object {
        fun stand() {
            print("Standing static")
        }
    }

}

object Helper {

    fun emotionalHelp(){

    }

    fun physicalHelp(){

    }
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