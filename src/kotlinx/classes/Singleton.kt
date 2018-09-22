package kotlinx.classes

object SingletonClass {
    fun getData() : Array<String>{
        return arrayOf("Saurabh","Rahul")
    }
}

fun main(args : Array<String>){
     SingletonClass.getData().forEach {
         println(it)
     }
}