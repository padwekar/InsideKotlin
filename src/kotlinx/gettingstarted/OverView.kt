package kotlinx.gettingstarted

/*
    TITLE : FIRST STEP
 */

/*
    INFO : In this session we will see the basics of kotlin
 */

 fun main(args : Array<String>){
     pairDataType()
 }


fun basics(){
    // FEATURE : String type is inferred , compiler figure out the type based on the value assign to it
    val name = "Saurabh"

    // FEATURE : Semi colon ';' is not required
    print(name)

    //FEATURE :  Kotlin is strongly typed language.So you can't change the type once it is linked with the identifier
    // name = 3 // Error : Integer literal does not confirm to expected type string.

    //FEATURE : New way of appending strings
    println("My name is $name") // OUTPUT : My name is Saurabh
}

fun mutability() {
    /*
        INFO : Inferred type is list
     */
    val list = listOf(1,2,3,4,5,6)

    /*
        INFO : Inferred type is mutable list
     */
    val mutableList = mutableListOf(1,2,3,4,5,6)
    /*
        FEATURE : Immutable means collections can't change it state like adding or removing elements
     */
}

fun rangeSample() {
    /*
        FEATURE : Kotlin has range data type
     */

    for(i in 1..10){
        println(i) //OUTPUT : 12345678910
    }
}


fun pairDataType() {
    /*
        FEATURE : Allows to store a pair of values
     */

    val weekdays = "Monday" to "Tuesday"

    println(weekdays.first)
    println(weekdays.second)

    /*
        FEATURE : We can destructure it into simple variable using Destructive declaration
     */

    val (day1 , day2) = weekdays

    /*
        FEATURE : We Iterate through it
     */

    val days = listOf("Monday" to "Tuesday","Wednesday" to "Thursday","Saturday" to "Sunday")
    for((firstday,nextday) in days){
        println("$firstday ") //OUTPUT : Monday Wednesday Saturday
    }

}


fun nullSafety() {
    /*
        INFO : In java you can store null value, but in kotlin if you want to store null values you should explicitly mark
               mark it as nullable.
     */

    var name : String = "Saurabh"
    //name = null // ERROR : Null cannot be value of non null type string

    /*
        FEATURE : Adding ? to data type make it nullable
     */

    var surname : String? = "Padwekar"
    surname = null // NO ERROR :)

    /*
        FEATURE : Safe calls can be done using ? on nullable  variable
     */

    println(surname?.length) //FEATURE : Line won't execute if the surname variable is null

}