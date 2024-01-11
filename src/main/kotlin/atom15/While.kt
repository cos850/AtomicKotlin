package title15.summary1

fun testCondition(i: Int) = i < 100

fun main() {
    // while
    var i = 0
    while(testCondition(i))
    {
        print(".")
        i += 10
    }

    // do while
    i = 0
    do {
        print('.')
        i += 10
    } while (testCondition(i))
}