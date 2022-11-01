open class Base2{
    protected var i = 1
    protected fun protectedFunc(){
        println(i)
        i += 1
        println(i)
    }
    fun access(){
        protectedFunc()
    }
    protected class Nested
}

class Derived : Base2(){
    fun test(base: Base2) : Int{
        protectedFunc()
        return i
    }
}

fun main() {
    val base = Base2()
    val derived = Derived()
//    base.i
//    base.protectedFunc()
    base.access()
}
