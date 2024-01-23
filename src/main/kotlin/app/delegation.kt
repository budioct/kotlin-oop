package app

import data.Delegate
import data.DelegateManual
import data.DelegateOverride
import data.MyBase

fun main() {
    val myBase = MyBase()
    val delegate = Delegate(myBase)
    val delegateManual = DelegateManual(myBase)
    val delegateOverride = DelegateOverride(myBase)

    delegate.sayHello("budhi")
    delegateManual.sayHello("malik")
    delegateOverride.sayHello("husein")
}