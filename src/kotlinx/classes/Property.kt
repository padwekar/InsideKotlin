package kotlinx.classes

// Boilerplate Percentage - 40%
class Property {
    var name : String
    var id : Int

    constructor(name : String,id : Int){
        this.name = name
        this.id = id
    }
}

// Boilerplate Percentage - 35%
class Property2(name: String,id : Int){
    var name : String
    var id : Int

        init {
            this.name = name
            this.id = id
        }

}

// Boilerplate Percentage - 15%
class Property3(name: String,id : Int){
    var name : String = name
    var id : Int = id
}

// Boilerplate Percentage - 10%
class Property4(name: String,id : Int){
    var name = name
    var id = id
}


// Boilerplate Percentage - 5%
class Property5 constructor(var name : String,var id :Int)

// Boilerplate Percentage - 0%
class Property6 (
        var name : String,
        var id :Int
)