class Calc4<T:Number>{
    fun plus(arg1:T,arg2:T):Double{
        return arg1.toDouble() + arg2.toDouble()
    }
}

fun main(args:Array<String>) {
    val calc = Calc4<Int>()
    println(calc.plus(10,20))

    val calc2 = Calc4<Double>()
    val calc3 = Calc4<Long>()
//    val calc4 = Calc4<String>()

    println(calc2.plus(2.5,3.5))
    println(calc3.plus(5L,10L))
}