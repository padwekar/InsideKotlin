package kotlinx.functions.standardlibfunc

import kotlinx.classes.Doctor
import kotlinx.classes.Student

/*
 Apply is standard lib extension func on Any. Applies any changes to the original instance.
 */

fun main(args : Array<String>){
    sampleExampleOne()
}
/*
    Removes the need to write the receiver name again and again.
 */
fun sampleExampleOne(){
    var doctor = Doctor("Saurabh")
    doctor.apply {
        name = "Healer"
    }
    println(doctor.name)
}
/*
Apply return the same instance on which it has been called
*/
fun sampleExampleTwo(){
    var doctor = Doctor("Saurabh").apply {
        name = "Healer"
    }
    println(doctor.name)

}


fun sampleExampleThree(){}


