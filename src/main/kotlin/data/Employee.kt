package data

// open: inheritance able class
// open: override able function
open class Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }
}

// default inherited class is final
// default function override is final
open class Manager(name: String) : Employee(name) {
    final override fun sayHello(name: String) {
        println("Hello $name, My name is Manager ${this.name}")
    } // final override // cannot override subsequent inherited functions

    open fun availableOverride(name: String){
        println("Hello $name, available for override function ${this.name}" )
    } // open able override function, tanpa keyword open function tetap bisa di override

}

final class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, My name is VicePresident ${this.name}")
    }
}

final class SuperManager(name: String) : Manager(name) {
    //override fun sayHello(name: String) {
    //    println("Hello $name, My name is SuperManager ${this.name}")
    //} // Error // 'sayHello' in 'Manager' is final and cannot be overridden

    override fun availableOverride(name: String) {
        println("Hello $name, My name is availableOverride ${this.name}")
    }

}