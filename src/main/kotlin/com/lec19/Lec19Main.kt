package com.lec19

import com.lannstark.lec03.Person
import com.lec19.a.printHelloWorld as printHelloWorldA // as import
import com.lec19.b.printHelloWorld as printHelloWorldB // as import



// data class는 구조분해가 가능하다. 또한 componentN이라는 함수도 자동으로 만들어준다.
// data class가 아닌데 구조분해를 사용하고 싶다면, componentN 함수를 직접 구현할 수 있다.
data class Person constructor(
    val name: String,
    val age: Int
)

class Person2 constructor(
    val name2: String,
    val age2: Int
){
    // componentN 직접 구현
    // 연산자처럼 간주되어야해서 앞에 operator를 붙여준다.
    operator fun component1(): String{
        return this.name2
    }
    operator fun component2(): Int{
        return this.age2
    }
}




fun main(){
    printHelloWorldA()
    printHelloWorldB()

    // 구조 분해, person을 만들었다가 다시 필드로 분해한 것
    val person = Person(name ="최태현", age = 100)
    // val (name,age) =  person

    // componentN이라는 함수
    val name = person.component1()
    val age = person.component2()
    println("$name, $age")



    val person2 = Person2("박세열", 26)
    val (name2,age2) = person2

    // return: 기본적으로 가장 가까운 enclosing function 또는 익명 함수로 값이 반환된다.
    // break: 가장 가까운 루프가 제거된다.
    // continue: 가장 가까운 루프를 다음 step으로 보낸다.
    val numbers = listOf<Int>(1,2,3)
    // 인수 넣고 화살표로 넘기기
    numbers.map { number -> number+1 }
        // foreach문에 람다식을 넘기기
        // foreach에서는 continue나 break를 쓸 수 없다.
        .forEach{println(it)}

    // 굳이 쓰고싶다면
    run {
        numbers.forEach{number ->
        if(number == 2){
            return@run
            }
        }
    }

    // 특정 expression에 라벨이름@을 붙여 하나의 라벨로 간주하고
    // break, continue, return 등을 사용하는 기능
    // 되도록이면 쓰지 말자
    loop@ for(i in 1..100){
        for(j in 1..100){
            if (j == 2){
                break@loop
            }
        }
    }

    // takeif 주어진 조건을 만족하면 결과, 아니면 null
    // takeunless, 주어진 조건을 만족하면 null, 아니면 결과

}