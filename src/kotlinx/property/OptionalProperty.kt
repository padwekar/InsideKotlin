package kotlinx.property

class Vegetable(var price : Double = 2.0,var color : String = "Green",var fresh : Boolean = true)


fun main(args : Array<String>){
    val vegetableOne = Vegetable()
    val vegetableTwo = Vegetable(color = "Yellow")
    val vegetableThree = Vegetable(2.2)
    val vegetableFour = Vegetable(price = 22.2, fresh = true)
    val vegetableFive = Vegetable(fresh = true, color = "Red", price = 222.2)
}
