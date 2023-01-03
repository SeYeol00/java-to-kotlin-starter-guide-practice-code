package com.lec17

import com.lannstark.lec17.Fruit

fun main(){
    val fruits = listOf<Fruit>(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )
    // 람다 == 이름 없는 함수
    // 코틀린에서는 함수를 바로 넘길 수 있다. 코틀린에서 람다 다루기
    // 람다도 변수에 할당하기 때문에 타입이 있다.
    // (변수 타입) -> 타입
    // 변수와 결과의 타입을 기입한다.
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean{
        return fruit.name.equals("사과")
    }

    // 화살표를 이용한 람다 표현, fruit을 받고 함수로 넘겨준다.
    // 중괄호와 익명 함수
    // 이걸 많이 사용함
    val isApple2 = {fruit: Fruit -> fruit.name.equals("사과")}

    isApple(fruits[0])
    // invoke -> 호출
    isApple.invoke(fruits[0])

    //          넘길 인자, 사용할 함수
    //                   바로 적어줘도 된다.
    //                     파라미터가 1개면 it으로 퉁칠 수 있다.
    //                     다만 직접 써주는 걸 추천한다.
    filterFruits(fruits) { fruit -> fruit.name.equals("사과") }
}

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean // 람다, 람다 표현식의 타입 지정
): List<Fruit>{
    val results = mutableListOf<Fruit>()
    for(fruit in fruits){
        if(filter(fruit)){
            results.add(fruit)
        }
    }
    return results
}