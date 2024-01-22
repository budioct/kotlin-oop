package app

import data.Television

fun main() {

    val television = Television()
    //println(television.brand) // akan kena jika kita belum initilized value attribute.. Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property brand has not been initialized

    // lateinit initlized attribute
    television.brand = "TCL"
    println("Brand TV ${television.brand}")

    // lateinit initlized function
    television.initBrand("AKIRA")
    println("Brand TV ${television.brand}")

}