package title15.summary1

fun main(){
    /**
     *  1. String Iteration
     */
    for(c in "Kotlin")  // 변수 c 는 Char 타입으로 추론
        print("$c ")

    println()

    /**
     * 2. Range
     * ".." 을 사용해 양 끝 값을 포함한 범위를 만듬
     * "step"을 사용해 증갓값 지정
     */
    for(i in 1..10)
        print("$i ")

    println()

    for(i in 0..10 step 2)
        print("$i ")
}