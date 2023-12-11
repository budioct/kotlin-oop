package data

class User(var usernameParam: String, var passwordParam: String) {

    // properties di constructor
    // set langsung di constructor primary.. tidak bisa membuat secondary constructor

    // var username: String = usernameParam
    // var password: String = passwordParam

    override fun toString(): String {
        return "User with username=$usernameParam"
    }

}