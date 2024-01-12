package atom18

class House {
    var sofa: String  = ""
}

class Sofa {
    val cover: String = "Loveseat cover"
}

fun main(){
    val house = House()
    house.sofa = "Simple sleeper sofa: $89.00"
    println(house.sofa)

    // sofa는 var로 선언되었으므로 변경 가능.
    // val로 선언된 house만 변경 불가능.
    house.sofa = "New leather sofa: $3,099.00"
    println(house.sofa)
    
    var sofa = Sofa()
    sofa = Sofa()
    
    // cover는 val로 선언되어 변경 불가능하고
    // var로 선언된 sofa는 변경 가능
//    sofa.cover = "New Cover"
}