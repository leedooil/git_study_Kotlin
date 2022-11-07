class Box4<in T>(val size:Int)

fun main() {
//    val anys:Box4<Any> = Box4<Int>(10)
    val nothings:Box4<Nothing> = Box4<Int>(20)
    println(nothings.size)
}