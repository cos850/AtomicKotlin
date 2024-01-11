package title15.summary1

/**
 * 1. 데이터 타입 var, val
 *  - val: 값을 변경할 수 없는 식별자 (value)
 *  - var: 값을 변경할 수 있는 식별자 (variable)
 *
 *  예시)
 *  - val 식별자: 타입 = 초기화 식
 *  - var identifier1 = initialization
 *  - var identifier2: Type = initialization
 */
val daysInFebruary = 28
val daysInMarch: Int = 31

var hoursSpent = 20 // 타입을 명시하지 않아도 Int 타입이 추론되었다. 따라서 추후에 20.5 와 같은 Double 형의 값으로 변경할 수는 없다.

/**
 * 2. 함수
 * 예시)
 * - 일반 함수 정의
 * fun functionName(arg1: Type1, arg2: Type2, ...): ReturnType {
 *  // 내부 코드
 *  return result
 * }
 *
 * - 축약형
 * fun 함수이름(파라미터1: 타입1, 파라미터2: 타입2):반환타입 = 결과를_계산하는_식
 */
fun cube(x: Int): Int {
    return x * x * x
}

fun bang(s: String) = s + "!"

fun main() {
    println(cube(3))
    println(bang("pop"))
}