package com.lec15

// 함수형 프로그래밍 공부
// 배열과 컬렉션

// 배열은 잘 사용하지 않는다.



fun main(){
     val array = arrayOf(100,200)

    // array에 있는 값을 사용해서 실제 코드에 담기
    // array의 인덱스를 분석해서 i에 담는다.
    for(i in array.indices){
        println("${i}, ${array[i]}")
    }

    // 코틀린의 배열에서는 파이썬 리스트처럼 값을 가변적으로 넣을 수 있다.
    array.plus(300)
    // 인덱스와 벨류를 한 번에 받는 방법
    for((index,value) in array.withIndex()){
        println("$index, $value")
    }

    // 불변 리스트
    // 생성할 때 값을 넣으면 자동으로 타입 캐스팅이 되지만
    val numbers = listOf<Int>(100,200)
    println(numbers[0])

    // 시작부터 비어있는 리스트
    // 여기서는 타입을 지정해주어야 한다.
//    val emptyList = emptyList<Int>()
    useNumbers(emptyList())

    // 하나 가져오기
    println(numbers[0])

    // 리스트를 for-each문으로 돌기
    for(number in numbers){
        println(number)
    }

    for((index, value) in numbers.withIndex()){
        println("$index, $value")
    }

    // 가변 리스트 만들기
    val numbers2 = mutableListOf<Int>(100,200)
    numbers2.add(300)
    // 기본 구현체는 어레이리스트
    // 우선 불변 리스트를 만들고, 꼭 필요한 경우 가변 리스트로 바꾸자


    // 가변 집합 만들기
    // set은 중복 불가다.
    val numbers3 = mutableSetOf<Int>(100,200)
    // 기본 구현체는 링크드 셋

    // 코틀린의 가변 map
    val oldMap = mutableMapOf<Int,String>()
    // 이것도 리스트 처럼 접근이 가능하다.
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    // 페어 함수와 비슷한 초기화, to 키워드를 쓴다.
    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    // key만 가져올 수도 있다.
    for(key in oldMap.keys){
        println(key)
        println(oldMap[key])
    }

    // key와 value 둘 다 가져오기
    for((key, value) in oldMap.entries){
        println(key)
        println(value)
    }

    // 컬렉션의 null 가능성
    // ? 위치에 따라 null이 어떤 타입에 허용되는지 판정됨
    // 코틀린 쪽의 컬렉션이 자바에서 호출되면 컬렉션 내용이 변할 수 있음을 감안해야 한다.
    // 코틀린에서 자바 컬렉션을 가져다 사용할 때는 플랫폼 타입을 신경써야 한다.



}
// 타입 추론이 가능하다면 생략 가능하다.
private fun useNumbers(emptyList: List<Int>) {

}
