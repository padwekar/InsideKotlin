package kotlinx.basics

typealias Action = () -> Unit

fun main(args : Array<String>){

    onClick {
        print("Hello")
    }

    onClick {
        val i = 10
        val j = 20
        print("Handsome ${i + j}")
    }
}


fun onClick(click : Action){
    click.invoke()
}