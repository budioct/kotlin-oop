package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {

    val employee = Employee("budhi")
    val manager = Manager("adam")
    val vicePresident = VicePresident("husein")

    employee.sayHello("udin")
    manager.sayHello("udin")
    vicePresident.sayHello("udin")


}