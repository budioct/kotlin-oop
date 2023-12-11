package app

import data.Laptop
import data.SmartPhone

fun main() {
    typeCheckif("string")
    typeCheckif('A')
    typeCheckif(1)
    typeCheckWhen(true)
    typeCheckWhen(SmartPhone("samsung", "android"))
    typeCheckWhen(Laptop("acer", "linux"))

    typeCheckUnsafe("bisa")
//    typeCheckUnsafe('A') // tidak bisa
    typeCheckSafeNullAble(1) // tidak bisa, akan di ubah null
    typeCheckSafeNullAble(true) // tidak bisa, akan di ubah null
}

fun typeCheckif(any: Any) {
    // type check object and cast
    // keyword 'is' type check conversion
    if (any is Laptop) {
        println("Laptop with name ${any.name}")
    } else if (any is SmartPhone) {
        println("SmartPhone with name ${any.name}")
    } else {
        println(any)
    }
}

fun typeCheckWhen(any: Any) {
    // type check object and cast
    // keyword 'is' type check conversion
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is SmartPhone -> println("Laptop with name ${any.name}")
        else -> println(any)
    }
}

fun typeCheckUnsafe(any: Any){
    // keyword 'as' type check conversion
    val value = any as String
    println(value)
}


fun typeCheckSafeNullAble(any: Any){
    // keyword 'as' type check conversion
    // Safe Nullable casts, jika tidak bisa di casts makan akan return null
    val value = any as? String
    println(value)
}