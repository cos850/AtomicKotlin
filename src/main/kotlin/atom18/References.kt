package atom18

class Kitchen {
    var table: String = "Round table"
}

fun main() {
    val kitchen1 = Kitchen()
    val kitchen2 = kitchen1 // kitchen2 는 kitchen1을 참조한다.
    println("Kitchen1: ${kitchen1.table}")
    println("Kitchen2: ${kitchen2.table}")

    kitchen1.table = "Square table"
    println("Kitchen1: ${kitchen1.table}")
    println("Kitchen2: ${kitchen2.table}")
}