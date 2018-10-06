package kotlinx.classes

/*
    TITLE : Sealed Class
*/

/*
    INFO  : A class with limited number of subclasses.
    Classes that can extend a seal class should be defined in the same file.
    Sealed classes are abstract by default, so a abstract modifier is redundant.
    Sealed classes can never be open or final.

*/

/*
    SYNTAX  : Simply add 'seal' variable before the class keyword
*/

//  EXAMPLE :

sealed class Vehicle()

sealed class Car : Vehicle()

sealed class Truck : Vehicle()

sealed class Bus : Vehicle()


/*
    INFO : If the subclasses of any seal class is open or abstract then any class outside the file
           could extend the subclass and exploit the seal class behaviour , in order to prevent this
           the subclasses should also be made sealed.

 */