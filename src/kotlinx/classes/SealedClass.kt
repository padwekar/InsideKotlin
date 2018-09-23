package kotlinx.classes

/*
    TITLE : Sealed Class
*/

/*
    INFO  : A class with limited number of subclasses.
    Only classes that can extend a seal class should be defined in the same file.
    Sealed classes are abstract by default, so a abstract modifier is redundant. Sealed
    classes can never be open or final.

*/

/*
    SYNTAX  : Simply add 'seal' variable before the class keyword
*/

//  EXAMPLE :

sealed class Vehicle()

sealed class Car : Vehicle()

sealed class Truck : Vehicle()

sealed class Bus : Vehicle()