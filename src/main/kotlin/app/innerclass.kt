package app

import data.Boss

fun main() {

    // access inner child umumnya
    //val employee = Boss.Employee("inner child")

    // karena menggunakan keyword "inner" untuk mengaskes class inner child di kotlin mirip seperti Three atau polimorphis (berubah bentuk)
    val boss1 = Boss("imam")
    val employee1 = boss1.Employee("asep")
    val employee2 = boss1.Employee("udin")

    val boss2 = Boss("asiman")
    val employee3 = boss2.Employee("hakim")
    val employee4 = boss2.Employee("heri")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}