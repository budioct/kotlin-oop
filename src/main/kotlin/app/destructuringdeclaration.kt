package app

import data.Game
import data.Login
import data.MinMax
import kotlin.math.log

fun main() {

    val game = Game("Game Mobile", 1000)

    // Destructuring Declaration object
    // initialized dari object ke multiple variable
    //val name = game.name
    //val price = game.price

    val (name, price) = game // initialized destructuring object declaration efesien

    println("Game")
    println("name: $name")
    println("price: $price")

    // Destructuring Declaration method
    // val result = MinMax(10, 100)
    // val min = result.min
    // val max = result.max

    // val (min, max) = minmax(10, 100) // initialized destructuring declaration method efesien
    val (min, _) = minmax(10, 100) // initialized destructuring declaration method efesien.. jika tidak perlu tinggal kasih underscore '_'
    println("Min Max")
    println("Min: $min")
    //println("Max: $max")


    val login = Login("budhi", "rahasia")
    // login(login) { login ->
    //     login.username == "budhi" && login.password == "rahasia"
    // }

    // initialized destructuringd eclaration lambda efesien
    val hasilLogin = login(login){ (username, password) ->
        login.username == "budhi" && login.password == "rahasia"
    }
    println("Hasil login: $hasilLogin")


}

// destructuring declaration method
fun minmax(value1: Int, value2: Int): MinMax {

    return when {
        value1 > value2 -> MinMax(value2, value2)
        else -> MinMax(value1, value2)
    }

}

// destructuring declaration method lambda
fun login(login: Login, callback: (Login) -> Boolean): Boolean{
    return callback(login)
}