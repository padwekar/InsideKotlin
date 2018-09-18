package kotlinx.interfaces

interface EmailProvider {

    val email : String
    fun validate() : Boolean = !email.isEmpty()

    val nickname : String
    get() = email.substringBefore("@")
}

class Employee(override val email : String) : EmailProvider {


}

fun main(args : Array<String>){
    val plans = Planning()
    plans.plan()
}

fun showInterfaceDemo(){
    val employee = Employee("lifesavi@gmail.com")
    print(employee.validate())
    print(employee.nickname)
}

interface MorningPlans {
    fun plan(){
        print("Morning Workout")
    }
}

interface EveningPlans {
    fun plan(){
        print("Evening Workout")
    }
}

class Planning : MorningPlans ,EveningPlans {
    override fun plan() {
        super<MorningPlans>.plan()
    }
}

