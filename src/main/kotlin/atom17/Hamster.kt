package atom17

import java.util.logging.Handler

class Hamster {
    fun speak() = "Squeak! "

    // this를 굳이 적어야하는 경우가 아니라면 혼란을 야기할 수 있으므로 적지 않는 것을 권장한다.
    fun exercise() = this.speak() + speak() + "Running on wheel"
}

fun main(){
    val hamster = Hamster()
    println(hamster.exercise())
}