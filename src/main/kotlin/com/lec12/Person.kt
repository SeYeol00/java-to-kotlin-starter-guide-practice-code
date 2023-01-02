package com.lec12

fun main(){
    Person.Factory.newBaby("ABC")
    Person.newBaby("ABC")


    println(Singleton.a)
    Singleton.a+=10
    println(Singleton.a)
}
class Person private constructor(
    var name: String,
    var age: Int
) {

    // 코틀린에는 static이 없다. 대신 companian object가 있다.
    // 이 블락 안에 있는 변수와 함수가 static이 붙는다.
    // 인스턴스 생성시 초기화 X
    // 정적으로 인스턴스끼리의 값을 공유하는 것 == static
    // 코틀린에서는 companian object 블락에 있다.
    // 이것도 하나의 객체로 인식되서 인터페이스를 만들 수 있다.
    // 동행 객체에 유틸성 함수들을 넣어도 되지만,
    // 최상단 파일을 활용하는 것이 좋다.
    companion object Factory: Log{ // 여기에 모아둔 것들이 스태틱
        // const를 쓰면 컴파일 시, 안 쓰면 런타임시 값을 할당
        // const는 진짜 상수에 쓰는거, 기본 타입과 string에 붙일 수 있음
        // 필드나 변수를 가져올 때 좋다.
        private const val MIN_AGE = 0

        // java에서 static field나 static 함수를 쓰는 것처럼
        // 바로 접근이 가능하다.
        @JvmStatic
        fun newBaby(name: String): Person{
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory에요")
        }
    }
}

// singleton으로 생성하고 싶다. -> object
// 어차피 스프링에서 싱글톤으로 관리하는데 뭐 쓸 일은 거의 없다.
// 다만 알아두면 좋다.
object Singleton{
    var a: Int = 0
}