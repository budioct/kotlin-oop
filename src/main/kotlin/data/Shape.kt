package data

// open: inheritance able class
// open: override able function
// open: override able properties / field / attribute
open class Shape {
    open val corner: Int = -1

    open fun printName(){
        println("This is Shape")
    }
}

// default inherited class is final
// default function override is final
// default properties / field / attribute override is final
class Rectangle : Shape(){
    override val corner: Int = 4
    val parentConrner : Int = super.corner // super.corner = Shape.corner // access super properties parent // can only access the above parent once
    override fun printName() {
        println("This is Rectangle")
        super.printName() // super.printName() = Shape.printName() // acces super function parent // can only access the above parent once
    }
}

class Triangle : Shape() {
    override val corner: Int = 3
}