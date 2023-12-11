package app

import data.User

fun main() {

    val budhi = User("budhi", "rahasia")
    val adam = User("adam", "rahasia123")

    // println("${budhi.username} ${budhi.password}")
    // println("${adam.username} ${adam.password}")

    println("${budhi.usernameParam} ${budhi.passwordParam}")
    println("${adam.usernameParam} ${adam.passwordParam}")

    budhi.usernameParam = "rubahUsername"
    budhi.passwordParam = "rubahPassword"

    println("${budhi.usernameParam} ${budhi.passwordParam}")

}