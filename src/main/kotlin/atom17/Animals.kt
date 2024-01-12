package atom17

class Giraffe
class Bear
class Hippo

class Dog {
    // 맴버함수 = 메서드 = 클래스에 속한 함수
    fun bark() = "yip!"
}

class Cat {
    fun meow() = "mrrow!"
}

// 최상위 함수 = 클래스에 속하지 않는 함수
fun rootFun() = "rootFun"

fun main() {
    val g1 = Giraffe()
    val g2 = Giraffe()
    val b = Bear()
    val h = Hippo()

    println(g1)
    println(g2)
    println(b)
    println(h)

    val dog = Dog()
    val cat = Cat()

    println(cat.meow())
}