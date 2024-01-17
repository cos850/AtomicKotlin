package atom23

/**
 * 예외 (Exception)
 * : 오류가 발생한 지점에서 '던져지는' 객체
 *
 * - 예외가 던져지면 실행경로가 중단되고, 예외 객체는 현재 문맥을 벗어난다.
 *  예외를 잡아내지 않으면 프로그램이 중단되면서 stack trace가 출력된다.
 */
fun main(){
    val i = "1$".toInt()
}