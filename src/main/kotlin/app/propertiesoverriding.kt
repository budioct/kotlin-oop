package app

import data.Rectangle
import data.Shape
import data.Triangle

fun main() {

    val shape = Shape()
    val rectangle = Rectangle()
    val triangle = Triangle()

    println(shape.corner)
    shape.printName()
    println(rectangle.corner)
    rectangle.printName()
    println(triangle.corner)

}