package kotlinx.property

class ReadLimit(
        var name : String,
        val id : Int //Read Only
)

fun main(args : Array<String>){
    val limit = ReadLimit("Saurabh", 25)
   // limit.id = 2 //Compilation Error , Id is read only
    limit.name = "Saurabh"
}

/*
* Kotlin does not support write only property  */