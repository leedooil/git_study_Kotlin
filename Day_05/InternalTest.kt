internal class InternalClass{
    internal var i = 1
    internal fun icFunc(){
        i += 1
        println(i)
    }
    fun access(){
        icFunc()
    }
    protected class Nested
}

class Other{
    internal val ic = InternalClass()
    fun test(){
        ic.i
        ic.icFunc()
    }
}

fun main() {
    val mic = InternalClass()
    println(mic.i)
    mic.icFunc()
}
