package title15.summary1

fun main(){
    /**
     * 1. 종류
     *  - Int
     *  - Long
     *  - Double
     */
    val n = 1000
    val l = 1000L
    val d = 1000.0
    println("$n $l $d")

    /**
     * 2. 넘침
     */
    println(Int.MAX_VALUE + 1)  // 넘침 발생
    println(Int.MAX_VALUE + 1L) // Long 타입으로 처리되어 넘침이 발생하지 않음

    /**
     * 나눗셈
     */
    val d1: Double = 3.0 + 2 / 5
    val d2: Double = 3 + 2.0 / 5
    println("$d1, $d2");
}