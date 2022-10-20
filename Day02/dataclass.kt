package com.example.leedooil

data class Ticket(val companyName : String, val name : String, val date : String, var seatNumber: Int)
class TicketNormal(val companyName : String, val name : String, val date : String, var seatNumber: Int)

// toString(), hashCode(), equals(), copy()가 자동생성됨

fun main(){
    val ticketA = Ticket("koreanAir","dooilLee","2022-10-21",14)
    val ticketB = TicketNormal("koreanAir","dooilLee","2022-10-21",14)

    println(ticketA)
    println(ticketB)
}