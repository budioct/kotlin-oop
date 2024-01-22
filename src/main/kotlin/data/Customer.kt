package data

// class with primary constructor
open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String) : this(name, type, 0) // secondary constructor 1, call primary constructor
    constructor(name: String) : this(name, "Standart") // // secondary constructor 2
}

class PremiumCustomer : Customer {
    constructor(name: String) : super(name, "Premium") // secondary constructor 1, call super constructor from parent class
    constructor(name: String, balance: Long) : super(name, "Premium", balance) // secondary constructor 1 access super from parent class
}

// class with primary constructor with inherited class parent
class ExecutiveCustomer(name: String, balance: Long) : Customer(name, "Executive", balance){
    constructor(name: String) : this(name, 0) // secondary constructor 1 access this(current object)
}

