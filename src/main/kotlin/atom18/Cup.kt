package atom18

class Cup {
    var percentFull = 0
}

class Cup2 {
    var percentFull = 0
    val max = 100
    fun add(increase: Int): Int {
        percentFull += increase
        if(percentFull > max)
            percentFull = max
        return percentFull
    }
}

fun main(){
    val c1 = Cup()
    c1.percentFull = 50

    val c2 = Cup()
    c2.percentFull = 100

    println(c1.percentFull)
    println(c2.percentFull)

    val cup = Cup2()
    cup.add(50)
    println(cup.percentFull)
    cup.add(70)
    println(cup.percentFull)
}