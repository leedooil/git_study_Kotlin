class Person2(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    val person2 : Person2 by lazy {
        isPersonInstantiated = true
        Person2("Kim", 23)
    }
    val personDelegate = lazy { Person2("Hong",40) }

    println("person2 Init : $isPersonInstantiated")
    println("personDelegate Init : ${personDelegate.isInitialized()}")

    println("person2.name = ${person2.name}")
    println("personDelegate.value.name = ${personDelegate.value.name}")

    println("person Init : ${isPersonInstantiated}")
    println("personDelegate Init : ${personDelegate.isInitialized()}")
}