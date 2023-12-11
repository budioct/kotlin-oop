package data

// open: inheritance able class
// open: override able function
// open: override able properties / field / attribute
open class Shape {
    open val corner: Int = -1
}

// default inherited class is final
// default function override is final
// default properties / field / attribute override is final
class Rectangle : Shape(){
    override val corner: Int = 4
}

class Triangle : Shape() {
    override val corner: Int = 3
}