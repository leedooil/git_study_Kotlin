class Manager{
    operator fun invoke(value: String){
        println(value)
    }
}

fun main() {
    val manager = Manager()
    manager("Do something for me!")
}