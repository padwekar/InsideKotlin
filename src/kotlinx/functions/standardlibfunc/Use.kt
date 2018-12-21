package kotlinx.functions.standardlibfunc

import java.nio.file.Files
import java.nio.file.Paths

/*
    Use will safely execute the function and close all the resources after
    the function has completed whether exception is raised or not.
 */

fun main(args : Array<String>){
    val input = Files.newInputStream(Paths.get("input.txt"))
    val byte = input.use({ input.read() })
}