package app

import data.Student

fun main() {

    // let function
    val student = Student("budhi", 78)
    student.let {
        println("let function")
        println("name: ${it.name}")
        println("score: ${it.score}\n")
    }

    // run function
    student.run {
        println("run function")
        println("name: ${this.name}")
        println("score: ${this.score}\n")
    }

    // apply function
    val student2 = Student("malik", 82).apply {
        println("\napply function")
        println("name: ${this.name}")
        println("score: ${this.score}")
    }
    println(student2)

    // also function
    val student3 = Student("jamal", 82).also {
        println("\nalso function")
        println("name: ${it.name}")
        println("score: ${it.score}")
    }
    println(student3)

    // with function
    val student4 = Student("husin", 81)
    with(student4) {
        println("\nname: ${this.name}")
        println("score: ${this.score}")
    }
}