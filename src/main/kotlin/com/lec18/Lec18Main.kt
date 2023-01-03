package com.lec18

import com.lannstark.lec17.Fruit


// 컬렉션을 함수형으로 다루기

// filter {인수 -> 람다}
// map{인수 -> 인수.필드}
// mapNotNull{인수 -> 인수.~}


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
    // {} => 함수 선언 혹은 다중 인자
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }

    // 조건식 관리
    // all: 조건을 모두 만족하면 true 그렇지 않으면 false
    // none: 주어진 조건을 모두 불만족하면 true, 그렇지 않으면 false
    // ex) val isNoApple = fruits.any{  fruit -> fruit.factoryPrice >= 10_000 }
    // filter 외에도 groupBy, associatedBy 등등 많다.
    // flatMap
}

private fun filterFruits(
    // 인수와 인수 타입, 함수를 인수로 받는다.
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean // 람다, 람다 표현식의 타입 지정
): List<Fruit>{
    return fruits.filter(filter)
}