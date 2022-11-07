open class Parent
class Child: Parent()
class Cup<T>

fun main() {
    val obj1: Parent = Child()

    val obj2: Parent = Parent()
    val obj3: Cup<Parent> = Cup<Parent>()
    val obj4: Cup<Child> = Cup<Child>()

    val obj5 = Cup<Child>()
    val obj6: Cup<Child> = obj5
}