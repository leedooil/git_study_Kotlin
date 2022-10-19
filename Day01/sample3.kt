package com.example.leedooil

fun main(){
    nullcheck()
}

// 7. Nullable / NonNull

fun nullcheck() {
    //NPE : Null Pointer Exception

    var name = "dooil"

    var nullName: String? = null

    var nameInUpperCase: String = name.uppercase()

    var nullNameInUpperCase = nullName?.uppercase()

    // ?:

    val lastName : String? = "Lee"

    val fulName = name+" "+(lastName ?: "NO lastName")

    var mLastName = lastName ?: throw IllegalAccessException("No last name")

    println(fulName)

}

// !!

fun ignoreNulls(str : String?){
    val mNotNull : String = str!!
    val upper = mNotNull.uppercase()

    val email : String? = "ldi316@naver.com"
    email?.let {
        println("my email is ${email}")
    }
}



















