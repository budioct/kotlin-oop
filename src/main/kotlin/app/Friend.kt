package app

data class Friend(val name: String)

/**
 * cara menghindari null pointer
 */

fun sayHello(friend: Friend?) {

    // cara 1 (Rekomen)
    //println("Hello ${friend?.name}") // jika ada value dan jika tidak ada value --> Hello null.. ini tidak bagus
    // if (friend != null){
    //    println("Hello ${friend.name}")
    // } // ini baru bagus

    // cara 2
    // val name = friend?.name ?: "Friend" // jika null akan di ganti "Friend"
    // println("Hello ${name}")

    // cara 3
    val name = friend!!.name // akan Error Exception Runtime jika value nya null
     println("Hello ${name}")

}

fun main() {

//    sayHello(Friend("budhi"))
    sayHello(null)

}