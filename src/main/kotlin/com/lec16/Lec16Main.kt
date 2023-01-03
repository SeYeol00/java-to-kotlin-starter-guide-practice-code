package com.lec16

fun Person.nextYearAge(): Int{
    println("확장 함수")
    return this.setAge()
}

// 확장 함수는 원본 클래스의 private, protected 멤버 접근이 안된다.

fun main(){
    val person = Person("A","B",16)
    person.nextYearAge()
    // 확장함수 vs 멤버함수에서 멤버함수가 우선적으로 호출된다.
}

// 중위함수 -> 함수를 호출하는 새로운 방법
// 함수 앞에 infix라고 붙여준다.


// inline 함수
// 함수가 호출되는 대신 함수를 호출한 지점에 함수 본문을 그래도 복붙하고 싶은 경우
// 함수 앞에 inline이라고 붙인다.
// 함수를 파라키터로 전달할 때의 오버헤드를 줄일 수 있다.



// 지역함수
// 함수 안에 함수로 중복되는 코드 정리 용도로 간편하다.
