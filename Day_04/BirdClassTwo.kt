class Bird5{
    var name : String
    var wing : Int
    var beak : String
    var color : String

    constructor(name: String, wing: Int, beak: String, color: String){
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    constructor(name: String, beak: String){
        this.name = name
        this.wing = 2
        this.beak = beak
        this.color = "grey"
    }

    fun fly() = println("Fly wing : $wing")
    fun sing(vol : Int) = println("Sing vol : $vol")
}

fun main(args:Array<String>) {
    val bird1 = Bird5("mybird",2,"short","blue")
    val bird2 = Bird5("mybird","long")

    println("bird1.color : ${bird1.color}")
    println("bird2.color : ${bird2.color}")
    bird1.fly()
    bird2.fly()
    bird1.sing(3)
    bird2.sing(0)
}
