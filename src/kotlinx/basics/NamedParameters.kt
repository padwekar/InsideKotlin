@file:JvmName("NamedParameters")
//Pure Kotlin Feature

package kotlinx.basics

fun main(args : Array<String>){
    showWeather(humidity = 0.0, temperature = 99.0)
}

fun showWeather(temperature : Double,humidity : Double,windSpeed : Double = 50.0){
    println("Temperature $temperature")
    println("Humidity $humidity")
    println("Wind Speed $windSpeed")
}
