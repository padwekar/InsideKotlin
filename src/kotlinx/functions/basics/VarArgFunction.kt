package kotlinx.functions.basics

fun main(args : Array<String>){
    spreadOperator()
   // sample("To all","Tushar","Shivam","Mommy","Papa",postfix = "Death",message = "Is painful.")
}

/*
   In case when the number of parameters are not known. We can use var args parameter and use any numbers of arguments to it.
 */

fun printSum(vararg number: Int){
    print(number.sum())
}

/*
    In such cases use named parameter while calling the function
 */
fun print(prefix : String , vararg  main : String , postfix : String){
    var name = prefix
    main.forEach {
        name += it
    }
    name += postfix
    print(name)
}

/*
* Compilation Error : Multiple varargs parameters are prohibited
* */
/*
fun manyVarArgs(vararg data : String,vararg meta : String){

}*/

/*
    Sample Example
 */

fun sample(prefix: String,vararg peoples : String,postfix: String,message : String){
    println("*********** Prefix $prefix *************")
    peoples.forEach { it ->
        println(it)
    }
    println("*********** Postfix $postfix ***************")
    println(message)

}

/*
    Spread operator What if you already have array defined.
 */

fun spreadOperator(){
    val array = arrayOf("Tushar","Shivam","Mommy","Papa")
    sample("Hi", *array,postfix = "Everyone",message = "Be happy.")
}