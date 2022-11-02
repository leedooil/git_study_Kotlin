class User2(_id:Int,_name:String,_age:Int){
    val id: Int = _id
    var name : String = _name
        set(value) {
            println("The name was changed")
            field = value.uppercase()
        }
    var age : Int = _age
}

fun main() {
    val user2 = User2(1,"Kildong",35)
    user2.name = "coco"
    println("user2.name = ${user2.name}")
}