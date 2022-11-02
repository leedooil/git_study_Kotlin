import kotlin.properties.Delegates

class User4 {
    var name : String by Delegates.observable("NONAME"){
        prop, old, new ->
        println("$old -> $new")
    }
}

fun main() {
    val user4 = User4()
    user4.name = "Kildong"
    user4.name = "Dooly"
}