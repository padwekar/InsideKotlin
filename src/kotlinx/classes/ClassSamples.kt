package kotlinx.classes

fun main(args : Array<String>){
    var customer = Customer("Customer")

    var student = Student(name = "Student") //student.name is not possible

    var doctor = Doctor("Patient") // patient.name = "Savi Healer" , name is immutable

    val patient = Patient(name = "Saurabh",age = 25) //Secondary Constructor
    patient.debug("Patient Name , Age :: ${patient.name} , ${patient.age}")

}

interface Debuggable {
    fun debug(message : String){
        println(message)
    }
}

class CustomerX {
    //Java
}

class Customer(name : String) : Debuggable{

    var greet  = "Hi $name"

    init {
        debug(greet)
    }
}


class Student constructor(name : String) : Debuggable{
    init {
        debug("Hi $name")
    }
}


class Doctor (val name: String): Debuggable{
    init {
        debug("Hi $name")
    }
}

class Patient(var name: String) : Debuggable{

    var age = -1

    init {

    }

    constructor(name: String,age : Int) : this(name){ // Secondary Constructor
            this.age = age
    }

}