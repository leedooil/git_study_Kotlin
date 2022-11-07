class Box3<out T>(val size:Int)

fun main() {
    val anys:Box3<Any> = Box3<Int>(10)
//    val nothings:Box3<Nothing> = Box3<Int>(20)
    println(anys.size)
}