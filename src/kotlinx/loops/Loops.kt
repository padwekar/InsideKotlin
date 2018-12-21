@file:JvmName("Loops")

package kotlinx.loops

fun main(loops : Array<String>){

    //FOR LOOP
    for(i in 2..10 step 2){
        //println("Counter $i")
    }

    //While loop
    var i = 1
    while (i in 1.rangeTo(5)){
        println("While loop ${i++}")
    }

    println()
    //Do While Loop
    var j = 1
    do {
        println("Do while ${j++}")
    }while (j in 0..5)
    println()

    //Labeled for loop
    outerLoop@ for (a in 0..3){
        innerLoop@ for(b in 0..3){
            if(a==2 && b==2){
                break@outerLoop
            }
            println("Labeled Loop $a , $b")
        }
    }

}

