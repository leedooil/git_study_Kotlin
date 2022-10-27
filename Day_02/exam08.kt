fun main() {
    var a : Any = 1
    a = 20L
    println("a : $a, type : ${a.javaClass}")

    checkArg("Hello")
    checkArg(5)
}

fun checkArg(x : Any){
    if (x is String){
        println("x is String : $x")
    }
    if (x is Int){
        println("x is Int : $x")
    }
}