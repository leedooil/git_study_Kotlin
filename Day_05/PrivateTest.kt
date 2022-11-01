private class PrivateClass{
    private var i = 1
    private fun privateFunc(){
        println(i)
        i += 1
        println(i)
    }
    fun access(){
        privateFunc()
    }
}

class OtherClass{
//    val opc = PrivateClass()
    fun test(){
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass()
//    pc.i
//    pc.privateFunc()
    pc.access()
}

fun TopFunction(){
    val tpc = PrivateClass()
}