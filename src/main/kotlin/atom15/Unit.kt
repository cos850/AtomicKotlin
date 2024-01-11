package title15.summary1

/**
 * 1. Unit 타입
 *
 * - 문: 상태 변경 (결과 값을 돌려주지 않기 때문에 상태를 변경하는 "부수효과"를 가짐)
 * - 식: 값을 만듬 (결과 값을 돌려줌)
 *
 * => 함수는 식 이므로 반드시 값을 반환해야 함. 이를 위해 코틀린에서는 Unit 이라는 타입을 사용
 */
fun main(){
    val result = println("result Unit")
    println(result)
}