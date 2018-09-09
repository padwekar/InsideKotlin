package kotlinx.functions.basics

fun main(args : Array<String>){
    print("Mr. ","Saurabh","Mangaldas","Padwekar","Pune",postfix = " Healer");
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
