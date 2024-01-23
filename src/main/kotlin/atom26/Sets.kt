package atom26

import atomictest.eq

fun main() {

    /** 읽기 전용 Set 초기화 */
    val intSet = setOf(1, 1, 2, 4, 5, 6, 6, 7, 5)

    /** Set 은 원소가 유일함. 중복이 제거되어 있음 */
    intSet eq setOf(1, 2, 4, 5, 6, 7)

    /** Set 은 순서가 중요하지 않음 */
    setOf(1, 2) eq setOf(2, 1)

    /** "in" 키워드로 원소 확인 */
    (7 in intSet) eq true
    (99 in intSet) eq false

    /** contains() 함수로 원소 확인 */
    intSet.contains(7) eq true
    intSet.contains(99) eq false

    /** 다른 집합 포함하는지 */
    intSet.containsAll(setOf(1, 7, 2)) eq true
    intSet.containsAll(setOf(1, 9, 2)) eq false

    /** 다양한 벤다이어그램 연산 사용가능. 중위 연산이 가능하다. */
    intSet.union(setOf(3, 4, 5, 9)) eq setOf(1, 2, 3, 4, 5, 6, 7, 9) // 합집합
    intSet intersect setOf(0, 1, 2, 3, 7, 8) eq setOf(1, 2, 7)  // 교집합
    intSet subtract setOf(4, 5, 6, 7) eq setOf(1, 2)    // 차집합

    /** 리스트 중복 제거 - Set or distinct */
    listOf(1, 2, 2, 3).toSet() eq setOf(1, 2, 3)
    listOf(1, 2, 2, 3).distinct() eq listOf(1, 2, 3)

    /** 가변 Set */
    val mutableSet = mutableSetOf(1, 2, 2, 3, 4)
    mutableSet.add(42)
    mutableSet += 22
    mutableSet eq mutableSetOf(1, 2, 3, 4, 42, 22)
}