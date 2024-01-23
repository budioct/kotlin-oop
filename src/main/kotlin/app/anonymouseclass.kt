package app

import data.Action

fun fireAction(action: Action) {
    action.action()
}

class SampleAction : Action {
    override fun action() {
        println("This is sample action")
    }
}

fun main() {

    fireAction(SampleAction()) // access SampleAction which one inherit/implement interface Action

    // access anonymouse(class no name) function with keyword object
    fireAction(object : Action{
        override fun action() {
            println("Action One")
        }
    })
    fireAction(object : Action{
        override fun action() = println("Action Two")
    })
}
