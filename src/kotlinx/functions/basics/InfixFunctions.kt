package kotlinx.functions.basics

fun main(args : Array<String>){
    val humanOne =  Human("Saurabh")
    val humanTwo = Human("Megha")
    val humanThree = Human("Kunal")
    val humanFour = Human("Nikita")

    humanOne likes humanTwo likes humanThree likes humanFour
}

class Human(val name : String) {

    infix fun likes(human : Human) : Human{
        println(this.name + " likes " + human.name)
        return human
    }



}