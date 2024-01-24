package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {

    // polymorphism harus di tampung key var supaya bisa di reusable oleh child class nya
    var employee = Employee("budhi")
    employee.sayHello("jamal")

    employee = Manager("husin")
    employee.sayHello("joko")

    employee = VicePresident("ucup")
    employee.sayHello("dimas")

}