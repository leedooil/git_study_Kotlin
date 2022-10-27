fun main() {
    var n = 4

    if ((n%2) == 1){
        println("n is an Odd number")
    }
    if ((n%2) == 0){
        println("n is an Even number")
    }

    var num1 = 10
    var num2 = 10
    val result1 = ++num1
    val result2 = num2++

    println("result1 : ${result1}")
    println("result2 : ${result2}")

    println("num1 : $num1")
    println("num2 : $num2")

    var x = 4
    var y = 0b0000_1010
    var z = 0x0F

    println("x shl 2 -> ${x shl 2}")
    println("x.inv -> ${x.inv()}")

    println("y shr 2 -> ${y/4}, ${y shr 2}")
    println("x shr 4 -> ${x*16}, ${x shr 4}")
    println("z shr 4 -> ${z*16}, ${z shr 4}")

    x = 64
    println("x shr 4 -> ${x/4}, ${x shr 2}")
}













