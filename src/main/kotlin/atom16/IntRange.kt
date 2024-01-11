package atom16

/**
 * 1. 객체
 * - 클래스: 새로운 데이터 타입의 기초가 될 프로퍼티와 함수를 정의. "사용자 정의 타입" 이라고 부르기도 함
 * - 멤버: 클래스에 속한 프로퍼티나 함수
 * - 멤버 함수: 함수 안에 정의되며 특정 클래스에 속한 객체가 있어야 사용될 수 있는 함수
 * - 객체 생성: 클래스에 해당되는 val, var 값을 만드는 과정. 클래스의 "인스턴스를 생성"한다고도 함
 */
fun main(){
    // IntRange 맴버 함수 관련하여 코틀린 문서 참조 가능
    val r1 = IntRange(0, 10)
    val r2 = IntRange(5, 7)

    println(r1)
    println(r2)

    // IntRange의 맴버 함수 호출
    val r = IntRange(0, 10)
    println(r.sum())
}