package atom24

import atomictest.eq

fun main() {
    /**
     * 1. 읽기 전용 List와 가변 List
     *
     * - listOf() : 읽기 전용 List 반환
     * - mutableListOf() : 가변 리스트 반환. add(), addAll() 외에 += 연산자를 사용해 원소를 추가할 수 있다.
     *
     */
    val list = mutableListOf<Int>()

    list.add(1)
    list.addAll(listOf(2, 3))

    list += 4
    list += listOf(5, 6)

    list eq listOf(1, 2, 3, 4, 5, 6)


    /**
     * 2. 함수에서 mutableList 를 반환해도 반환 타입이 List<Int>이므로 해당 타입으로 변경된다.
     * 따라서 아래 함수는 읽기 전용 함수를 반환한다.
     */
    getList() eq listOf(1, 2, 3)

    // 읽기 전용 리스트에 원소 추가 연산 시 컴파일 오류 발생
//    getList() += 4

    /**
     * 3. 에일리어싱
     * : MutableList(가변List) 를 List(읽기전용List) 가 참조한 경우
     *   MutableList 값이 변경되면 읽기 전용 리스트의 내부가 변경된 내용을 보게 된다.
     */
    val first = mutableListOf(1)
    val second: List<Int> = first

    first += 2
    second eq listOf(1, 2)  // 읽기 전용 리스트임에도 first 에 인해 변경된 내용을 보게 된다.


    /**
     * 4. += 연산자의 비밀
     * : var/val + 가변/불변List 혼합하여 사용하면 += 연산자를 통해 가변 객체도 변경할 수 있는 것처럼 보인다.
     * 다른 컬렉션에서도 마찬가지이므로 식별자를 정의할 땐 var 보단 val을 써야 혼동을 방지할 수 있다.
     */
    // 4-1. 'val', 'var' 에 가변 리스트 대입
    val mutableList1 = mutableListOf('A')
    mutableList1 += 'B'        // 컴파일러가 += 연산자를 plusAssign()로 변환
    mutableList1.plusAssign('C')
    mutableList1.add('D')

    mutableList1 eq listOf('A', 'B', 'C', 'D')

    // 4-2. val 에 불변 리스트 대입
    val list1 = listOf('A')
//    list1 += 'B'       // 컴파일 에러
//    list1.plusAssign('C')
//    list1.add('D')

    list1 eq listOf('A', 'B', 'C', 'D')

    // 4-3. var 에 불변 리스트 대입
    var list2 = listOf('A')
    list2 += 'B'        // val newList = list2 + 'B'; list2 = newList 와 동일
//    list2.add('C')    // 컴파일 에러

    list2 eq listOf('A', 'B')
}

fun getList(): List<Int> {
    return mutableListOf(1, 2, 3)
}