package atom19

class Alien(name: String) {
    val greeting = "Poor $name!"
}

fun main(){
    val alien = Alien("Mr. Meeseeks")
    println(alien.greeting)
}