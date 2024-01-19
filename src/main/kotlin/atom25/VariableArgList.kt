package atom25

import atomictest.eq

/**
 * vararg 키워드를 사용하면 임의의 길이로 인자를 받는 함수 정의 가능 (ex: listOf)
 * vararg 로 선언된 인자가 최대 하나만 있어야 하며 마지막에 선언하는게 간편함
 * 이때 전달된 파라미터는 Array 타입이다.
 */
fun v(s: String, vararg d: Double) : Unit = println("s=$s, d=${""+ d.size + ", " + d::class }")

fun sum(vararg numbers: Int): Int {
    var total = 0
    for(n in numbers) {
        total += n
    }
    return total
}

/**
 * Array 를 Array 타입 단일 인자가 아니라
 * 인자 목록으로 변환하고 싶으면 스프레드 연산자(*)를 사용한다
 */
fun spread(vararg s: Int): Unit {
    for(ss in s) print(ss)
}


fun main() {
    v("abc", 1.0, 2.0)
    v("abc", 1.0, 2.0, 3.0)
    v("abc", 1.0, 2.0, 3.0, 4.0)

    sum(1, 2, 3, 4, 5) eq 15

    spread(1, 2, *intArrayOf(1, 2), 3)

}