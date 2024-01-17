package atom22

import atomictest.*

/**
 * 중위 표기법 (infix notation)
 * : 코틀린에서는 함수 호출을 중위 표기법으로 호출 할 수 있는 기능을 제공한다.
 *
 * 호출 예시)
 *  "a.함수(b)" -> "a 함수 b"
 */
fun main() {
    val v1 = 11;
    val v2 = "Ontology"

    v1 eq 11
    v2 eq "Ontology"

    v2 neq "Apple"

    // 위의 표기법은 아래와 같으며, infix 키워드를 사용해 함수를 정의한다.
    v1.eq(11)
    v2.eq("Ontology")
    v2.neq("Apple")

    v2.eq("Apple") // 오류

}