package com.example.leedooil

fun main(){
    forAndWhile()
}

// 4. 조건식

fun maxBy(a : Int, b : Int) : Int{
    if(a > b){
        return a
    }else{
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if(a>b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
    }

    var b : Int = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression : 값을 반환하는 return이 있으면
// 코틀린의 모든함수는 아무리 리턴값이 없더라도
// 무조건 Uni를 리턴하기 때문에 Expression이다

// Statement : ~를 해 라고 명령하면
// 자바의 void 함수와 같음

// 5. Array and List

// Array : 메모리가 이미 할당되어 나오기 때문에 사이즈가 정해짐 처음에 크기지정해야댐
// List :  1. List(수정불가능,읽기만가능)
//         2. MutableList(수정가능,읽기 쓰기 가능)

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20
}

// 6. For / While

fun forAndWhile(){

    val students = arrayListOf("joyce","james","jenny","jennifer")

    for (name in students){
        println("${name}")
    }

    for((index, name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    for(i in 1..10 step 2){
        sum +=i
    }
    println(sum)

    var index = 0
    while (index<10){
        println("current index : ${index}")
        index++
    }

}

































