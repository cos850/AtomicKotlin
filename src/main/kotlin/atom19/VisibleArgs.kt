package atom19

class MutableNameAlien(var name: String)
class FixedNameAlien(val name: String)

// MultipleArgs
class AlienSpecies(
    val name: String,
    val eyes: Int,
    val hands: Int,
    val legs: Int
) {
    fun describe() = "$name with $eyes eyes, $hands hands and $legs legs"
}

fun main(){
    val alien1 = MutableNameAlien("Reverse Giraffe")
    val alien2 = FixedNameAlien("Krombopolis Michael")

    alien1.name = "Parasite"
    // val 이므로 오류 발생
//    alien2.name = "Parasite"

    val kevin = AlienSpecies("Zigerion", 2, 2, 2)
    val mortyJr = AlienSpecies("Gazorpian", 2, 6, 2)

    println(kevin.describe())
    println(mortyJr.describe())
}