fun main(args: Array<String>) {
    namedParam(x=200,z=100)
    namedParam(z=150)

    normalVarargs(1,2,3,4)
    normalVarargs(4,5,6)
}

fun namedParam(x:Int = 100, y:Int = 200, z : Int){
    println(x+y+z)
}

fun normalVarargs(vararg counts : Int){
    for (num in counts){
        print("${num}")
    }
    print("\n")
}