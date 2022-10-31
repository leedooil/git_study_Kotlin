import java.lang.Exception

class InvalidNameException (message : String) : Exception(message)

fun main() {
    var name = "ldi316"
//    var name = "이두일"
    try {
        validateName(name)
    }catch (e:InvalidNameException){
        println(e.message)
    }catch (e:Exception){
        println(e.message)
    }
        println(name)
}

fun validateName(name : String){
    if (name.matches(Regex(".*\\d+.*")))
        throw InvalidNameException("Your name : $name : contains numerals.")
}