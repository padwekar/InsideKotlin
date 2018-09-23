package kotlinx.classes

/*
 Kotlin lacks the ability to define "Static" objects.
 Though it allows you to create an object which is associated with the class.

 Companion Object is initialise once only i.e one instance of the class exists.
 */

class CompanionShowcase {

    init {
        /*
           This init block will be called every time object of Companion Showcase is Created
           This is block is similar to java's class constructor body
        */

        print("${this::class.simpleName} Instance is created")
    }
    companion object {

        /*
            Companion object has their own init block
            This is block is similar to java's static block
         */

        init {
            println("Companion Instance is created")
        }

        var counter  = 0

        fun showCount(){
            //println("Count $counter")
        }

    }

}

fun main(args : Array<String>) {

    /*
        Companion object is a singleton property of the companion class which is initialised whenever the property
        is accessed or at the time an instance of companion class is created.
     */


    fun sceneOne() {
        /*
            The first time you access any property/method of the companion object the init block of Companion Object will be called.
         */
        CompanionShowcase.showCount()
        /*
            Output : Companion Instance is created
        */
    }

    fun sceneTwo() {
        /*
            For every instance of the class is created the init block of the class will be called.
            also the init block of the companion object will be called if it has not be called before.
         */
        CompanionShowcase()
        /*
            Output : Companion Instance is created
                     CompanionShowcase Instance is created
         */
    }

    fun sceneThree() {
        /*
            Line 1 : Init block of companion object will be called only if it has not been called before.
            Line 2 : Init block of companion will not be called since it was called by LINE 1.
                     Init block of the CompanionShowcase() will be called every time a new instance of the class is created.
         */
        CompanionShowcase.showCount() //Line 1
        CompanionShowcase() //Line 2
        /*
            Output : Companion Instance is created
                     CompanionShowcase Instance is created
         */
    }

    fun sceneFour() {
        /*
         Line 1 : Init block of companion object will be called only if it has not been called before.
                  Init block of the CompanionShowcase() will be called every time a new instance of the class is created.
         Line 2 : Init block of companion will not be called since it was called by LINE 1.

      */
        CompanionShowcase() // Line 1
        CompanionShowcase.showCount() // Line 2

        /*
        Output : Companion Instance is created
                 CompanionShowcase Instance is created
       */
    }

    fun sceneFive() {
        /*
            The count property (the one which is declared inside the companion object block) can be accessed by outside the block as
            outside the class.
         */

        print(CompanionShowcase.counter + 10)
    }

}



