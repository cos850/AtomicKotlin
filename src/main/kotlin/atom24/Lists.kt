package atom24

import atomictest.capture
import atomictest.eq

fun main() {
    val ints = listOf(99, 3, 5, 7, 11, 13)
    ints eq "[99, 3, 5, 7, 11, 13]"

    // List 원소 이터레이션
    var result = ""
    for(i in ints) {
        result += "$i "
    }

    result eq "99 3 5 7 11 13"

    // List 원소 인덱싱
    ints[1] eq 3

    // 인덱스를 벗어난 접근 시 오류 발생
    capture { ints[6] } eq (ArrayIndexOutOfBoundsException::class)
}