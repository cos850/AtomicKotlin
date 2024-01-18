package atom24

import atomictest.eq


fun main() {
    val doubles = listOf(1.1, 1.2, 1.3, 1.4, 1.5)
    doubles.sum() eq 6.5

    var strings = listOf("Twas", "Brilling", "And", "Slithy", "Toves")

    strings eq listOf("Twas", "Brilling", "And", "Slithy", "Toves")

    strings.sorted() eq listOf("And", "Brilling", "Slithy", "Toves", "Twas")    // 새 List 생성

    strings.reversed() eq listOf("Toves", "Slithy", "And", "Brilling", "Twas")  // 새 List 생성

    strings.first() eq "Twas"

    strings.takeLast(2) eq listOf("Slithy", "Toves")


    /**
     * 파라미터화한 타입
     * '<>' 는 제네릭이아니라 '타입 파라미터' 라고 함
     */

    // 타입 추론
    val numbers = listOf(1, 2, 3)
    val strings2 =  listOf("one", "two", "three")

    // 타입 명시
    val numbersWithType: List<Int> = listOf(1, 2, 3)
    val stringsWithType: List<String> = listOf("one", "two", "three")

    // 결과는 동일하다.
    numbers eq numbersWithType
    strings2 eq stringsWithType
}