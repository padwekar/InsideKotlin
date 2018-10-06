package kotlinx.alias

/*
    TITLE : IMPORT ALIAS
 */

/*
    INFO : Allows you to set alias name to the imports
 */

/*
    INFO : Consider you have two classes with same name. Here say AliasInfo in two different packages.
           You want to use both the classes in the same file without creating confusion.
           One solution would be specifying fully qualified path for the class name an alternative to this is
           to use import alias.
 */

/*
    SYNTAX : Use 'as' and the alias name after the import statement in the same line
 */

import kotlinx.alias.aliaspackage2.AliasInfo as PackageTwoAlias
import kotlinx.alias.aliaspackage1.AliasInfo as PackageOneAlias

var packageOneAlias = PackageOneAlias("Sample Aias")

var packageTwoAlias = PackageTwoAlias("Kotlinx")

fun main(args : Array<String>){

    println(packageOneAlias.alias)
    println(packageTwoAlias.packageName)

}