fun main() {
    var test : Number = 12.2
    println("$test")

    test = 12
    println("$test")

    test = 120L
    println("$test")

    test += 12.0f
    println("$test")

    val num = 256
    if (num is Int){
        print(num)
    } else if (num !is Int){
        print("Not a Int")
    }

//    val num2 : float = 25.0f
//    if (num2 is Int){
//        print(num2)
//    } else if (num2 !is Int){
//        print("Not a Int")
//    }
}