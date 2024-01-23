package app

import data.Gender

fun main() {

    val male = Gender.MALE
    val female = Gender.FEMALE
    val listGender : Array<Gender> = Gender.values() // values() // return collections list
    // val listGender : Array<Gender> = Gender.entries.toTypedArray() // entries.toTypedArray() // return collections list

    println(male)
    println(female)
    println(listGender.toList()) // toList() // return fun <T> Array<out T>.toList(): List<T>

    val maleFromString = Gender.valueOf("MALE") // valueOf() equals Enum String dengan Enum Object
    val femaleFromString = Gender.valueOf("FEMALE")
    println(maleFromString)
    println(femaleFromString)

    male.printDescription()
    female.printDescription()

}