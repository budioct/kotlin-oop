package app

import data.Application

fun main() {

    Application.hello("budhi") // companion menjadi inner object.. access dari outerClass.nameMethod.. of Block Companion Object
    Application.Companion.hello("budhi") // access outerClass.Companion.nameMethod //  Companion = companion object{block body}
}