package lec09

import java.lang.IllegalArgumentException

// 코틀린은 기본이 퍼블릭
// 생성자를 위에 써줘야한다.
//              constructor => 생성자
// 프로퍼티 => 필드 + getter + setter
// 코틀린은 getter setter를 안 써도 된다.
// constructor 생략 가능하다.

// 필드 값에 생성자 인수를 붙여준다.
// 필드를 생성자 인수와 합쳐서 표현이 가능하다.
//    val name: String = name
//    var age: Int = age
// 바디는 아무것도 없으면 생략 가능하다.
class Person (val name: String, var age: Int){// 주 생성자는 반드시 존재해야한다.
    // 생성자 제약조건 추가
    init { // 클래스가 초기화되는 시점에 한 번 호출되는 블록
        // validation 로직을 넣는다.
        if (age<=0){
            throw IllegalArgumentException("나이는 ${-1}일 수 없습니다.")
        }
    }

    // 생성자 오버로딩, 부 생성자
    // 위에 있는 생성자는 그대로 두고
    // 새로운 생성자를 만들고 this로 최종적으로 주 생성자를 호출한다.

    constructor(name: String): this(name,1){
        println("첫 번째 부생성자")
    }

    constructor():this("홍길동"){
        println("두 번째 부 생성자 ")
    }
}



fun main(){
    val person = Person(name ="박세열", age = 25)

    // getName()이 그냥 name으로 표현 된다.
    println(person.name)
    // setAge 또한 그냥 age로 대체된다.
    // 파이썬 문법화가 된 느낌
    // 하지만 실제로 둘 다 getter, setter를 쓰는 거다.
    person.age = 10
    println(person.age)
}
