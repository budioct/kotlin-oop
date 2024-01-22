package app

import data.Company

fun main(){

    val company1 = Company("Budhi")
    val company2 = Company("Budhi")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)

    println(company1.equals(company2)) // perbandigan 2 buah object value = value , bukan lagi object = object

}