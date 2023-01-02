package com.lec10

class Penguin(
    // 부 생성자
    species: String
    // 인터페이스도 똑같이 :을 쓴다. 그래서 , 만 붙이고 여러 개 사용 가능하다.
) : Animal(species,2), Swimmable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("팽귄이 움직입니다~ 꿱꿱")
    }

    // custom getter
    override val legCount :Int
        // super랑 this를 쓴다.
        get() = super.legCount + this.wingCount

    // 구현
    // 중복되는 인터페이스를 특정할 때 super<타입>.함수 사용
    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }

//    // 오버라이드로 프로퍼티 게터 생성
//    override val swimAbility: Int
//        // 값을 넣을 수 있다.
//        get() = 3

}