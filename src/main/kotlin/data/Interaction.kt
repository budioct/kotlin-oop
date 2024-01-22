package data

interface Interaction {

    val name: String
    fun sayHello(name: String)

    // tidak boleh initiliazed attribute / properties / field
    // tetapi boleh bikin langsung block body method yang di sebut (Concrit Function)
    fun bro(name: String): Unit {
        // block body
    }

}

interface Go : Interaction {
    fun go() {
        println("Goooooo!!!")
    }
}

interface MoveA {
    fun move() = println("Modve A")
}

interface MoveB {
    fun move() = println("Modve B")
}

open class Contoh

// inheritance class hanya boleh 1.. jika tidak akan Exception: Only one class may appear in a supertype list
// inheritance interface boleh lebih dari 1
class Human(override val name: String) : Contoh(), Go, MoveA, MoveB {

    // implement method contract interface
    override fun sayHello(name: String) {
        println("hello $name, my name is ${this.name}")
    }

    // overrid supaya tidak conflict deklarasi nama method yang sama
    override fun move() {
        super<MoveA>.move() // super<interface>.fun() // call method interface MoveA
        super<MoveA>.move() // call method interface MoveB
        println("Move Human")
    }

}
