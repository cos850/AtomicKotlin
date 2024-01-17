package atom23

import atomictest.capture

/**
 * 책의 capture 함수는 exception message 와 비교하지만
 * 편의를 위해 exception class 와 비교하도록 바꾸었다.
 */
fun main() {
    capture {
        "1$".toInt()
    } eq (NumberFormatException::class)
}