package atom22
import atomictest.eq

fun main(){
    calculateBMI(160, 68) eq "Normal weight" // error
    calculateBMI(100, 68) eq "Underweight"  // success
    calculateBMI(200, 68) eq "Overweight"   // error
}

// Int 로 인해 bmi 계산 결과가 0임
fun calculateBMI(
    weight: Int,
    height: Int
): String {
    val bmi = weight/(height * height) * 703.07
    return if(bmi < 18.5) "Underweight"
        else if(bmi < 25) "Normal weight"
        else "Overweight"
}