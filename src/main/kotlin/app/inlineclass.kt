package app

import data.Token

fun main() {

    val authorization = Token("secret token")
    println(authorization.value)
    println(authorization.toUpper())

}