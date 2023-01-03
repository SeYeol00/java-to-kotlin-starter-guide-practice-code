package com.lec16

// 코틀린에서 다양한 함수를 다루는 방법

// 확장함수
// 코틀린은 자바와 백퍼 호환하는 걸 목표로 한다.
// 기존 자바 코드 위에 자연스럽게 코틀린 코드를 추가하기 위해
// 클래스 내에 있는 메소드처럼 호출 가능하지만 함수는 밖에 만들 수 있게 하는것-> 확장 함수


// String 클래스를 확장하는 확장함수
// this로 불려진 인스턴스를 가리킨다.

fun main(){
    val str = "ABC"
    println(str.lastChar())
}

// 확장 함수
fun String.lastChar(): Char{
    return this[this.length -1]
}