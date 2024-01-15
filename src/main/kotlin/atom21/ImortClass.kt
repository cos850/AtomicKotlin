package atom21

/**
 * 프로그래밍 근본 원칙 DRY (Don't Repeat Yourself)
 * => 코드의 반복은 유지보수성을 떨어트리고 실수할 가능성을 높인다.
 *
 * import
 * : 함수, 클래스, 프로퍼티를 불러와 사용할 수 있다.
 *  'as' 키워드를 사용해 이름 변경 가능
 */
import kotlin.math.PI
import kotlin.math.cos

import kotlin.math.PI as circleRatio
import kotlin.math.cos as cosine

import kotlin.math.* // 패티지의 모든 내용을 임포트

fun main(){
    println(PI)
    println(cos(PI))
    println(cos(2*PI))

    println(circleRatio)
    println(cosine(circleRatio))
    println(cosine(2*circleRatio))

    println(E)
    println(E.roundToInt())
    println(E.toInt())
}

