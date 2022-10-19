package com.example.leedooil

/*
 * @author Dooil Lee
 * @email ldi316@naver.com
 * @created 2022-10-19
 * @desc
 */

open class Human(val name : String = "Anonymous"){

    constructor(name : String, age : Int) : this(name){
        println("my name is ${name}, ${age}years old")
    }

    init{
        println("New human has been born!!")
    }

    fun eatingCake(){
        println("This is so YUMMMYYYYYY~~~~")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){

    override fun singASong(){
        super.singASong()
        println("라라라라")
        println("my name is : ${name}")
   }
}


fun main(){
//    val human = Human("dooil")
//
//    val stranger = Human()
//
//    human.eatingCake()

//    val mom = Human("Risa", 53)

//    println("this human's name is ${stranger.name}")

val korean = Korean()
korean.singASong()
}