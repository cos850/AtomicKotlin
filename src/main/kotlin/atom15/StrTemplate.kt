package title15.summary1

fun main() {
    /**
     * 1. 문자열 치환
     * 문자열 템플릿을 사용해 String 내부에 값을 삽입할 수 있다.
     * 식별자 앞에 "$"를 붙이면 해당 "$식별자"가 해당 식별자의 값으로 치환된다.
     */
    val answer = 42
    println("Found $answer!")   // Found 42!

    /**
     * 2. 식 치환
     * "${...}" 를 사용하면 내부 식의 결과가 "${...}" 전체와 치환된다.
     */
    val condition = true
    println(
        "${if(condition) 'a' else 'b'}"
    )

    /**
     * 3. 식별자가 아닌 경우
     * "$" 뒤에 오는 문자열이 식별자가 아닌 경우 아무 일도 일어나지 않는다.
     */
    println("printing a $1")

    /**
     * 4. 삼중 큰따옴표
     * 삼중 큰따옴표(""") 를 사용하면 여러 줄의 문자나 특수 문자가 포함된 문자를 저장할 수 있다.
     */
    fun json(q: String, a: Int) = """{
        "question": "$q",
        "answer": $a
    }"""
    println(json("The Ultimate", 42))
}