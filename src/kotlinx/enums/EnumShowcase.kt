package kotlinx.enums


/*
    TITLE : ENUM - ENUMERATED TYPE
*/

/*
    INFO  : Enum is a data type consisting of set of named value.
*/

/*
    SYNTAX  : Create enum by 'enum' before any class
*/

//  EXAMPLE
enum class Color {
    GREEN,
    RED,
    BLUE,
    ORANGE
}

fun main(args : Array<String>){

    fun sceneOne(){
        /*
            TITLE : Parse String from enum
         */

        fun onePointOne(){ // JAVA STYLE
            val parsedValue = Color.valueOf("GREEN")
            print(parsedValue)
        }


        fun onePointTwo(){ //KOTLIN STYLE
            val parsedValue = enumValueOf<Color>("BLUE")
            print(parsedValue)
        }

        onePointTwo()

    }

    fun sceneTwo() {

        /*
         TITLE: Get all the values of enum
         */

        fun twoPointOne(){
            Color.values().forEach { // JAVA STYLE
                println(it.name)
            }
        }

        fun twoPointTwo(){
            enumValues<Color>().forEach { // KOTLIN STYLE
                print(it.name)
            }
        }

    }


    fun sceneThree(){
         /*
            TITLE : Enum with properties
          */
        val bookingTypeDiagnostic = BookingType.DIAGNOSTIC
        println(bookingTypeDiagnostic.id)
        println(bookingTypeDiagnostic.typeName)

    }


    fun sceneFour() {
        /*
          TITLE : ENUM with ';')
         */
        print(Day.SATURDAY.isWeekEnd())

    }


    fun sceneFive(){
        /*
        TITLE : ENUM with validations
       */

        print(Speed.SLOW) //ExceptionInInitializerError
    }

    fun sceneSix(){
        /*
           TITLE : Define custom method or property inside enum
         */
        println(Car.Hatchback.safety)
    }

}

enum class BookingType( val id : Int,val typeName : String) {
    DIAGNOSTIC(0,"Diagnostic Booking"),
    WELLNESS(1,"Wellness Booking")
}

enum class Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    fun isWeekEnd() = this.ordinal > FRIDAY.ordinal
}

enum class Speed(speed : Double) {

       // ULTRA_SLOW(-5.0), //ExceptionInInitializerError
        VERY_SLOW(10.0),
        SLOW(30.0),
        NORMAL(50.0),
        FAST(800.0),
        SUPER_FAST(120.0),
        ULTRA(160.0);

        init {
            require(speed > 0)
        }
}

enum class Car() {
    Hatchback {
        override val safety =  SAFETY.SAFE
    },
    Sedan {
        override val safety = SAFETY.UNSAFE
    },
    SUV {
        override val safety = SAFETY.PROTECTED
    },
    Convertible {
        override val safety = SAFETY.RISKY
    };

    abstract val safety : SAFETY

}

enum class SAFETY { PROTECTED , SECURE , SAFE , UNSAFE , RISKY}
