package app

import data.Employee
import data.Manager
import data.SuperManager
import data.VicePresident

fun main() {

    val employee = Employee("budhi")
    val manager = Manager("adam")
    val vicePresident = VicePresident("husein")
    val superManager = SuperManager("andi")

    employee.sayHello("udin")
    manager.sayHello("udin")
    vicePresident.sayHello("udin")
    superManager.sayHello("udin")


}