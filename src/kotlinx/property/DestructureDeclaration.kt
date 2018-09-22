package kotlinx.property

data class Man(var dob : Long , var name : String, var gender : Char = 'M') {
    var isHealthy : Boolean = false
}

fun main(args : Array<String>){

    val person = Man(1010011L,"Saurabh")

    val (age,surname) = person // Multiple variable declaration

    val (dob, _ , gender) = person // We can omit in between properties too.

    println(age)
    println(surname)
    println(surname)

}

/*
For every property declared in the primary constructor of the class kotlin compiler generates a respective component for it.

 */