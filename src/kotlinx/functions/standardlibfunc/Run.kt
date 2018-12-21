package kotlinx.functions.standardlibfunc

import kotlinx.classes.Doctor

/*
    Run is an extension function that combines the let(can return anything) & with(doesn't return anything,) function.
    Run passes this in the argument. While let passes it.
 */

fun main(run : Array<String>){

    var doctor = Doctor()

    var name = doctor.apply { name = "Saurbh" }.run { if(name == "Saurabh") "Neha" else "Summa" }

    println(name)

}