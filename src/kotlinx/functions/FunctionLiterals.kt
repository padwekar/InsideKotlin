package kotlinx.functions

// In kotlin you can denote function using {} (function literals)

fun main(args : Array<String>){

    val functionLiteral = { println("Function Literal Example")}

    val functionLiteralWithPar =  { par : String -> println("Function with parameter $par") }

    val functionLiteralWithMultiplePar =
            { par1 : String , par2 : String -> println("Function Literal Example with $par1 and $par2")}

    functionLiteral()

    functionLiteralWithPar("Single Parameter")

    functionLiteralWithMultiplePar("first parameter","second parameter")
}