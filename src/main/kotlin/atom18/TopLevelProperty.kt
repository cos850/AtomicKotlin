package atom18

// val은 변경 불가능하므로 최상위 수준에 정의해도 안전
val constant = 42

// var는 가변이므로 안티패턴으로 간주됨
var counter = 0

fun main(){
    counter++
    println("$constant, $counter")
}