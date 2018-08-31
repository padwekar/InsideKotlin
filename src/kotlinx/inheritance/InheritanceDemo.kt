@file:JvmName("Inheritance")

package kotlinx.inheritance

fun main(args : Array<String>){
    val animal = Animal()
    println(animal.color)

    val dog : Animal = Dog( "Grey")
    println(dog.rank)
    println(dog.color)


    val cat : Animal  = Cat(6,"Gray")
    println(cat.color)

}

open class Animal(open var color: String = "") {

    open var rank = 1

    open fun eat(){
        println("Animal Eat")
    }

}
class Dog(override var color: String) : Animal() {

    override var rank = 1


    override fun eat(){
        super.eat()
        println("Dog Eat")
    }
}

class Cat : Animal {

    override var rank = 3

    constructor(rank : Int,color : String) : super(color){
        this.rank = rank
    }

    override fun eat(){
        println("Cat Eat")
    }

}