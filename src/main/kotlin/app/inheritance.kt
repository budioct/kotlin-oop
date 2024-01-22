package app

import data.Employee
import data.Manager
import data.SuperManager
import data.VicePresident

fun main() {

    // inheritance
    val employee = Employee("budhi")
    val manager = Manager("adam")
    val vicePresident = VicePresident("husein")
    val superManager = SuperManager("andi")

    employee.sayHello("udin")
    manager.sayHello("udin")
    vicePresident.sayHello("udin")
    superManager.sayHello("udin")

    // override method
    val availableOverrideFunction = SuperManager("Asik")
    availableOverrideFunction.availableOverride("bisa override")

}