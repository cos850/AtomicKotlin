package atom23

import atomictest.capture
import atomictest.eq

fun averageIncom(income: Int, months: Int) = income / months
fun averageIncomReturnNull(income: Int, months: Int) = if(months == 0) null else income/months
fun averageIncomThrowException(income: Int, months: Int) = if(months == 0) throw IllegalArgumentException("Months can't be zero") else income / months

fun main() {
    averageIncom(3300, 3) eq 1100

    /**
     * months 가 0 인 경우 오류가 발생하므로 null 을 돌려주거나 정확한 오류 메세지를 돌려준다.
     * null 을 반환하는 것 보다 예외를 던지는 것을 추천한다.
     */
    capture { averageIncom(5000, 0) } eq ArithmeticException::class

    /**
     * null을 던지는 경우
     */
    averageIncomReturnNull(5000, 0) eq null

    /**
     * 오류를 던지는 경우
     */
    capture { averageIncomThrowException(5000, 0) } eq IllegalArgumentException::class
    averageIncomThrowException(5000, 0) // Exception in thread "main" java.lang.IllegalArgumentException: Months can't be zero
}
