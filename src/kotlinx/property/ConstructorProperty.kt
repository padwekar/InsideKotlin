package kotlinx.property

data class ConstructorProperty(var name : String,var id : Int)

fun main(args : Array<String>){

    val property = ConstructorProperty("Saurabh", 0)
    //property.name //error //Constructor Parameter Declaration
    property.id //no error //This is constructor property declaration

    print(property.toString())

}