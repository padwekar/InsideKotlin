package kotlinx.property

class Fruit(var weight : Double){
    val isHeavy = weight > 20   // value will be calculated only once

    var usable : Boolean = false
    var goodState : Boolean = false

    var crushed : Boolean
    get() = !usable && !goodState
    set(value){
        usable = value
        goodState = value
    }
}

fun main(args : Array<String>){
    val fruit = Fruit(12.0)
    print(fruit.isHeavy)
    fruit.weight = 19.0
    print(fruit.isHeavy)

    fruit.goodState = false
    fruit.usable = false
    print(fruit.crushed)
}