package com.lec13

class House constructor(
    private var address: String,
    private var livingRoom: LivingRoom,
) {
    // 코틀린에서는 중첩 클래스를 그냥 만들면 된다.
    // static이 없기 때문에 알아서 코틀린이 static을 해준다.
    // 바깥 클래스에 대한 참조를 가지고 있는 내부 클래스 => inner를 붙인다.
    inner class LivingRoom constructor(
        private var area: Double
    ) {
        // 바깥 클래스의 필드를 참조하기
        // custom getter
        val address: String
            // this@.상위클래스.상위클래스 필드
            get() = this@House.address
    }
}