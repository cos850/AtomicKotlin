package atom20

/**
 * 접근제어자
 * 
 * 1. public (default)
 * : 코틀린의 기본 접근 제어자로, 어디에서나 접근할 수 있음
 * 
 * 2. private
 * : 해당 파일(.kt) 또는 클래스내에서만 접근할 수 있음
 * 
 * 3. protected
 * : 해당 파일(.kt) 또는 클래스 내에서와 자식 클래스 내에서는 접근 가능. top-level 에서는 선언할 수 없음.
 * 
 * 4. internal
 * : 같은 모듈 내부 어디서나 접근 가능. 모듈 내부에서는 접근 가능하지만 모듈 소비측에서는 접근할 수 없음 
 */
class Counter(var start: Int) {
    fun increment() {
        start += 1
    }
    override fun toString() = start.toString()
}

class CounterHolder(ctr: Counter) {
    private val ctr = ctr
    override fun toString() = "CounterHolder: $ctr"
}

fun main() {
    // 에일리어싱(aliasing): 한 객체에 대해 참조를 여러 개 유지하는 것
    val c = Counter(11)
    val ch = CounterHolder(c)
    println(ch)

    c.increment()
    println(ch)

    val ch2 = CounterHolder(Counter(9))
    println(ch2)
}