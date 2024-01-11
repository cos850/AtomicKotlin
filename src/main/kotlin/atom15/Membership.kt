package title15.summary1

/**
 * 1. in 키워드
 * "in" 키워드를 사용해 어떤 값이 범위에 속하는지 검사
 * "!in" 를 사용하면 범위에 속해있지 않는 경우 true를 반환한다.
 */
fun intNumRange(n: Int) = n in 50..100

fun notLowerCase(ch: Char) = ch !in 'a'..'z'

fun main(){
    val i1 = 11
    val i2 = 100
    val c1 = 'K'
    val c2 = 'k'

    println("$i1 is ${intNumRange(i1)}")
    println("$i2 is ${intNumRange(i2)}")
    println("$c1 is ${notLowerCase(c1)}")
    println("$c2 is ${notLowerCase(c2)}")
}