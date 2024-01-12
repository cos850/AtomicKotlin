package atom19

class Scientist1(val name: String)
class Scientist2(val name: String) {
    override fun toString(): String  = "Scientist('$name')"
}

fun main() {
    val einstein = Scientist1("Albert Einstein")
    println(einstein)   // toString 을 override 하지 않아 디폴트 구현(클래스이름+객체물리주소)을 출력한다.

    val zeep = Scientist2("Zeep Xanflorp")
    println(zeep)   // toString 을 override 하여 유용한 결과를 출력한다.
}