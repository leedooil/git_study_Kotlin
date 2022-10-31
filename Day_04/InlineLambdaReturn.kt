fun main() {
    retFunc()
    println()
    retFunc2()
    println()
    retFunc3()
    println()
    retFunc4()
}

inline fun inlineLambda(a: Int, b: Int, out: (Int,Int) -> Unit){
    out(a,b)
}

fun retFunc(){
    println("start of retFunc")
    inlineLambda(13,3){a,b ->
        val result = a+b
        if (result > 0) return
        println("result : $result")
    }
    println("end of retFunc")
}

fun inlineLambda2(a: Int, b: Int, out: (Int,Int) -> Unit){
    out(a,b)
}

fun retFunc2(){
    println("start of retFunc")
    inlineLambda2(13,3) lit@{a,b ->
        val result = a+b
        if (result > 0) return@lit
        println("result : $result")
    }
    println("end of retFunc")
}

fun inlineLambda3(a: Int, b: Int, out: (Int,Int) -> Unit){
    out(a,b)
}

fun retFunc3(){
    println("start of retFunc")
    inlineLambda3(13,3){a,b ->
        val result = a+b
        if (result > 0) return@inlineLambda3
        println("result : $result")
    }
    println("end of retFunc")
}

fun inlineLambda4(a: Int, b: Int, out: (Int,Int) -> Unit){
    out(a,b)
}

fun retFunc4(){
    println("start of retFunc")
    inlineLambda4(13,3, fun(a,b) {
        val result = a+b
        if (result > 0) return@inlineLambda4
        println("result : $result")
    })
    println("end of retFunc")
}