package atom20

/**
 * 가시성을 제한하기 위한 접근자 사용.
 *
 * : 변화해야하는 요소와 동일하게 유지되어야 하는 요소를 분리한다.
 *
 */
private var index = 0
private class Animal(val name: String)
private fun recordAnimal(
    animal: Animal
) {
    println("Animal #$index: ${animal.name}")
    index++
}

fun recordAnimals(){
    recordAnimal(Animal("Tiger"))
    recordAnimal(Animal("Antelope"))
}

fun recordAnimalsCount(){
    println("$index animals are here!")
}