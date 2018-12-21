package kotlinx.functions.standardlibfunc

import kotlinx.classes.Doctor

/*
    Let is similar to apply with the difference that it may return some different instance.
 */
fun main(args : Array<String>){
    sampleLetExampleOne()
}

/*
    it doesn't keep the reference of the original instance
 */
fun sampleLetExampleOne(){

    val name = Doctor().let {
        it.name = "Vikas Dubey" // incase of it you always have to specify it.
       "Dr ${it.name}"
    }



    println(name)
}