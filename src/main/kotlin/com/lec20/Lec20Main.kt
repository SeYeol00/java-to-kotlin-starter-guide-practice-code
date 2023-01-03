package com.lec20

import com.lec19.Person

// scope function -> 영역함수


fun main(){

}

fun printPerson(person: Person?){
    // let이란 메서드, 스코프 펑션의 한 종류다. 확장함수
    // 일시적인 영역을 생성하는 것이다.
    // 람다를 받아서 실행시키는 함수
    person?.let{
        println(it.name)
        println(it.age)
    }
    if (person != null){
        println(person.name)
        println(person.age)
    }
}