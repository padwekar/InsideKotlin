package kotlinx.classes

interface Objectable {
    fun sample()
    fun sample(name: String)
}

class Sampling : Objectable {
    override fun sample() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sample(name: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

abstract class SampleAbstract {
    abstract fun sample()
}

//By using the keyword object and the name of the interface or abstract class whose functions are being implemented.

fun main(arg : Array<String>){


    //object expression is equivalent to java anonymous class.Can be used to implement an interface anonymously.
    fun awesome(test: Objectable){

    }

    awesome(object : Objectable{
        override fun sample() {

        }

        override fun sample(name: String) {

        }

    })

    //Object expression can also be used to implement method of abstract class
    fun awesome(test : SampleAbstract){

    }

    awesome(object : SampleAbstract() {
        override fun sample() {

        }

    })
}