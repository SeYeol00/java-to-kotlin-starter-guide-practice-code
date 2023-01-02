package com.lec06

fun main(){
    // listOf는 리스트를 만들어주는 코드
    val numbers = listOf(0L,1L,2L)

    // 코틀린에서 for-each문은 : 대신 in을 사용한다.
    for(number in numbers){
        // iterable이 구현된 타입이면 다 된다.
        println(number)
    }

    // i가 올라가는 경우
    for (i in 1..3 ){
        println(i)
    }
    // i가 내려가는 경우
    for (i in 3 downTo 1){
        println(i)
    }
    // 2칸씩 올라가는 경우
    for (i in 1..5 step 2){
        println(i)
    }

    // while문은 그대로다.


}