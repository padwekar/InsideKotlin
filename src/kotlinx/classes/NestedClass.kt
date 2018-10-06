package kotlinx.classes

/*
    TITLE : NESTED CLASS
 */

/*
    INFO : Nested classes are the classes which are defined within another class.
           Allows a better way of grouping classes.
 */


class Outer {
    private val bar = 1

    /*
        INFO : Simple Nested class.
     */

    class Nested {
        fun foo() = 2
    }

    /*
        INFO : Inorder to access the variable of enclosing class inside nested classes. We need to make the nested classes
                'inner'.
     */

    inner class InnerNested {
        fun foo() = bar
    }

    /*
        INFO  : Only a single instance of inner class can exist per instance of outer class.
     */
}

fun main(args : Array<String>){
    println(Outer.Nested().foo())  // 2

    /*
        INFO : To instantiate an inner class we instantiate the enclosing class.
     */

    println(Outer().InnerNested().foo()) // 1
}