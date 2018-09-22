package kotlinx.functions.basics

data class Company(var id : Int ,var name : String ,var establishYear : Int)

fun main(args : Array<String>) {

    val healthsignzCompany = Company(99,"Healthsignz",2015)
    var emposoft = healthsignzCompany.copy() //Data class provides a built in copy method

    println(healthsignzCompany)
    println(emposoft)

    emposoft = healthsignzCompany.copy(100,name = "Emposoft")
    print(emposoft)
}
