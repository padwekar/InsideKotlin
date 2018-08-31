package kotlinx.functions

import java.math.BigDecimal

data class Human(var isAlive : Boolean,var name : String,var age : Int = 0)

fun main(args : Array<String>){
    addLogs()
}


fun addLogs() {



    fun logTime(name : String = "" , operation : () -> Unit) {
        val startTime = System.currentTimeMillis()
        operation()
        println("TimeTaken by ${operation.toString()} ${System.currentTimeMillis() - startTime}")
    }

    logTime {
        simpleFilter()
    }

    logTime {
        cookBookAddAndMultiply()
    }


}

fun simpleFilter() {

    val humans = mutableListOf<Human>()
    humans.add(Human(false,"Sunil", 23))
    humans.add(Human(true,"Anil",46))
    humans.add(Human(false,"Zolbaji",99))
    humans.add(Human(true,"Vaishali",41))
    humans.add(Human(true,"Vaibhav",18))

    humans.filter { it.age >  70 }.forEach {
        println(it.name)
    }
}

fun MutableList<Human>.filter(condition: (Human) -> Boolean) : MutableList<Human> {
    val filteredList = mutableListOf<Human>()
    forEach {
        if(condition(it)){
            filteredList.add(it)
        }
    }

    return filteredList ;
}

fun show(x : Int) : ((Int) -> Unit){
    print("ShowTime 10x is ${x*10}")
    return { a -> print("Fuckaaa $a")}
}

fun cookBookAddAndMultiply(){

    val bigDecimal  = { num : Long -> BigDecimal.valueOf(num)}

    val numbers = mutableListOf<BigDecimal>(bigDecimal(1),bigDecimal(2),bigDecimal(3),bigDecimal(4))


    fun sum(numbers : MutableList<BigDecimal>) : BigDecimal{
        var accumulator = BigDecimal.ZERO
        numbers.forEach {
            accumulator += it
        }

        return accumulator
    }

    fun product(numbers : MutableList<BigDecimal>) : BigDecimal{
        var accumulator = BigDecimal.ONE
        numbers.forEach {
            accumulator *= it
        }

        return accumulator
    }


    fun fold(numbers: MutableList<BigDecimal> , start : BigDecimal , accumulate : (BigDecimal , BigDecimal) -> BigDecimal) : BigDecimal {
        var accumulator = start
        numbers.forEach {
            accumulator = accumulate(accumulator,it)
        }
        return accumulator
    }

    print(fold(numbers, BigDecimal.ONE){
        starts : BigDecimal , sum : BigDecimal -> starts * sum
    })

}

fun funNullability(){

    var funkia : ((Int) -> Unit)? = null

    if(false){
        funkia = fun (a : Int) =  print("Value of funkia is ${a * 10}")
    }

    funkia?.invoke(10)
}

fun funWithLambdas() {
    // Syntax : { arguments -> function body }
    var x = { 1 } //function that accepts nothing but returns 1
    var y = { a : Int -> a * 10 } //function that accepts Int and returns 10 times of it

}

fun funWithAnonymous(){

    val a = fun () = 1 // Functions accepts nothing but returns 1
    val b = { 1 } // Functions exactly the same way as above
    print(b())

}

fun funInAssigning(){

    var x : (Int) -> Unit = { a -> println("Fuckaaa $a")}
    x(19)
    x = { a -> println("Shakka $a")}
    x.invoke(1)


    var far : (Int) -> Int = fun(i : Int) : Int {
        return 5
    }

}

fun funInList() {
    // 0 1 1 2 3 5 8 13 21


    var a = 0
    var b = 1
    var result = a + b

    var manpa = fun(x : Int, y : Int){
        a = b
        b = result
        result = a + b;
    }

    val funList: MutableList<((Int , Int) -> Unit,String) -> Unit> = mutableListOf()


    funList.add{ callme ,c ->
        callme.invoke(a,b)
        println(c)
    }

    funList.add{callme,c ->
        callme.invoke(a,b)
        println(c)
    }

    funList.add{callme,c ->
        callme.invoke(a,b)
        println(c)
    }

    funList.add{callme,c ->
        callme.invoke(a,b)
        println(c)
    }

    funList.add{callme,c ->
        callme.invoke(a,b)
        println(c)
    }

    funList.add{callme,c ->
        callme.invoke(a,b)
        println("Result $result")
    }

    funList.add{callme,c ->
        callme.invoke(a,b)
        println(c)
    }



    var counter = 0

    funList.forEach {
            it.invoke(manpa,"Callback ${counter++}")
    }

}


fun funAsArgs(){
    //Passing functions as arguments
    var makeFunc : (String,String) -> String = { firstname,heroname -> shame(firstname,heroname) }

    var sum  = { number1 : Int , number2 : Int -> number1 + number2} // local function assigned to a variable

    var multiply = { number1 : Int , number2 : Int -> number1 * number2 }

    val displayWithShit = { message : String -> println( "$message shit") }
    val displayWithSweet = { message : String -> println( "$message sweet") }

    greet("Good Morning",displayWithShit)

    greet("Good Afternoon",displayWithSweet)

    greet("Good Evening",{
        message -> println(message)
    })

    greet("Good Night") { message : String -> println( "$message lamda") }

    full(firstName = "Saurabh",lastName = "Padawekar"){
        //  println("$it 188888")
    }
    greet(name = "Yogita") {
        val fullname = "$it  sharma"
        print(fullname+fullname)
    }
}

fun make(name : String , heroName : String) : String {
    return "$name is now $heroName"
}

fun greet(name : String , display: (String)-> Unit){
    display(name)
}

fun full(firstName : String ,lastName : String, display: (String)-> Unit){
    display("$firstName $lastName")
}


fun shame(name: String, crime : String) : String {
    return "$name has committed $crime"
}


fun shake(greet : String, name : String, hero : String , argsFunc : (String) -> Unit ) : String{
    return "$greet as ${argsFunc(name)}"
}

class High {

}