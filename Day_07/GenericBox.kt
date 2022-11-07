class Box<T>(t:T){
    var name = t
}

fun main() {
    val box1 : Box<Int> = Box(1)
    val box2 : Box<String> = Box("Hello")

    println(box1.name)
    println(box2.name)
}