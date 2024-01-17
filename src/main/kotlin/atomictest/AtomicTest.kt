package atomictest

import kotlin.math.abs
import kotlin.reflect.KClass

const val ERROR_TAG = "[Error]"

private fun <L, R> test(
    actual: L,
    expected: R,
    checkEquals: Boolean = true,
    predicate: () -> Boolean
) {
    println(actual)
    if(!predicate())
    {
        // 코틀린의 if 문은 직접 값을 반환하므로 삼항연산자를 제공하지 않는다.
        println("$ERROR_TAG: $actual ${if(checkEquals) "!=" else "=="}  $expected")
    }
}

infix fun Any.eq(rval: String) {
    test(this, rval) {
        toString().trim() == rval.trimIndent()
    }
}

infix fun <T> T.eq(rval: T){
    test(this, rval) {
        this == rval
    }
}

infix fun <T> T.neq(rval: T) {
    test(this, rval, checkEquals = false) { this != rval }
}

infix fun Double.eq(rval: Double) {
    test(this, rval) {
        abs(this - rval) < 0.00000001
    }
}


/**
 * 예외 정보를 저장하는 클래스
 */
class CapturedException(
    private val exceptionClass: KClass<*>
) {
    infix fun eq(inputClass: KClass<*>){
        exceptionClass eq inputClass
    }
}

fun capture(f: ()-> Unit): CapturedException =
    try{
        f()
        CapturedException(Unit::class)
    } catch(e: Throwable) {
        CapturedException(e::class)
    }
