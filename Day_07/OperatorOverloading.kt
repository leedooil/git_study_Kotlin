class Point(var x:Int=0, var y:Int=0){
    operator fun plus(p:Point) : Point{
        return Point(x+p.x,y+p.y)
    }
}

fun main() {
    val p1 = Point(10,10)
    val p2 = Point(2,9)

    var point = Point()
    point = p1 + p2
    println("point = (${point.x},${point.y})")
}