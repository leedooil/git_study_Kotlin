fun main() {
    for (i in 1..5){
        if (i==3) break
        print(i)
    }
    println()
    println("outside")

    println()
    labelBreak()

    println()
    labelBreak2()

    println()
    labelBreak3()
}

fun labelBreak(){
    println("labelBreak")
    for (i in 1..5){
        second@ for (j in 1..5){
            if (j==3) break
            println("i : $i, j : $j")
        }
        println("after for j")
    }
        println("after for i")
}

fun labelBreak2(){
    println("labelBreak2")
    first@ for (i in 1..5){
        second@ for (j in 1..5){
            if (j==3) break@first
            println("i : $i, j : $j")
        }
        println("after for j")
    }
    println("after for i")
}

fun labelBreak3(){
    println("labelBreak3")
    first@ for (i in 1..5){
        second@ for (j in 1..5){
            if (j==3) continue@first
            println("i : $i, j : $j")
        }
        println("after for j")
    }
    println("after for i")
}

