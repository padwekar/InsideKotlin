package kotlinx.property


    var number : Int = 3
    get(){
        println("Getting the number")
        return field
    }
    set(value) {
        println("Setting the number")
        field = value
    }

    fun main(args: Array<String>) {
        number = number + number
        println(number)
    }
