package kotlinx.functions.basics

fun main(args : Array<String>){

    var i = 9;

    fun printSomething(){ // 1
        println("Something ${i++}")
    }



    printSomething() //2
    printSomething() //2
}

/*
* Functions declared inside another functions are called local functions.
* They are only accessible inside that function*/

/* Local Function can access the values of enclosing function */
/*
* Function can be declared as top level function.
* As a Member Functions or inside a function*/
