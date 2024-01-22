package app

import data.Note

fun main() {

    // access getter and setter

    val note = Note("Belajar Kolin")

    println(note.title) // access getter

    note.title = "" // access setter
    println(note.title)



}