class Bird6(var name: String, var wing: Int, var beak: String, var color: String){

    fun fly() = println("Fly wing : $wing")
    fun sing(vol : Int) = println("Sing vol : $vol")
}

fun main() {
    val coco = Bird6("bird",11,"long","orange")
    println("coco.name : ${coco.name}, coco.wing ${coco.wing}")
    println("coco.color : ${coco.color}, coco.beak ${coco.beak}")
}
