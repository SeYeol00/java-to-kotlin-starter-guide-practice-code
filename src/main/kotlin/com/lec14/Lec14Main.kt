package com.lec14

fun main(){
    val dto1 = PersonDto("최태현", 100)
    val dto2 = PersonDto("박세열", 26)
    println(dto1 == dto2)
    println(dto1)

}

// dto 예시
// data class -> dto + @Data
// 앞에 data만 붙이자
// 빌더, 해쉬코드, toString 등을 모두 사용 가능
data class PersonDto constructor(
    private val name: String,
    private val age: Int
)

fun handleCountry(country: Country){
    when(country){
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
        // enum을 쓸 떄는 else를 안 써도 된다.
    }
}

// 코틀린의 enum 클래스
// 자바 enum이랑 거의 똑같다.
enum class Country constructor(
    private val code: String
){
    KOREA("KO"),
    AMERICA("US")
}

// 히위 클래스를 봉인하자
// 하위 클래스의 타입을 모두 기억한다.
sealed class HyundaiCar constructor(
    val name:String,
    val price: Long
)
// 상속 느낌? 하위에서 모두 구현해야한다.
// 컴파일 타임 때 하위 클래스의 타입을 모두 기억한다.
// 즉 런타임 때 클래스 타입이 추가될 수 없다.
// 즉 enum이랑 비슷하다. -> when을 쓸 떄 좋다.
// 추상화가 필요한 엔티티나 DTO에 sealed class를 활용한다.
class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Granduer : HyundaiCar("그랜저", 3_000L)