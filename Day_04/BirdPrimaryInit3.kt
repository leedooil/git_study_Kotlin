class Bird8(var name: String = "NONAME", var wing: Int = 2, var beak: String, var color: String){

    fun fly() = println("Fly wing : $wing")
    fun sing(vol : Int) = println("Sing vol : $vol")
}

fun main() {
    val coco = Bird8(beak = "long", color = "red")
    println("coco.name : ${coco.name}, coco.wing ${coco.wing}")
    println("coco.color : ${coco.color}, coco.beak ${coco.beak}")
    coco.fly()
}
