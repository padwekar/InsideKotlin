package kotlinx.modifier

open class Parent {

    private val a = 1
    public  val b = 2
    protected val c = 3
    internal  val d = 4

}


class Child : Parent() {

    fun main(args : Array<String>){
      //  print(a) // cannot be accessed  C.E
        print(b)
        print(c)
        print(d)

    }

}

class Friend {

    fun main(){

        val parent = Parent()
      //  print(parent.a) //a is private C.E
        print(parent.b)
     //   print(parent.c) //c is protected C.E
        print(parent.d)

    }

}