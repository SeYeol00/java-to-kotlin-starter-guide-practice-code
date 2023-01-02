package com.lec12

fun main(){
    // 코틀린의 익명 클래스 사용
    // 자바에서는 new Movable로 생성해주었다.
    // 코틀린에서는 object 키워드를 쓴다.
    // 빈 주입할 때 익명 클래스를 썼었다.
    moveSomething(object : Movable{
        // 이렇게 구현한다.
        override fun move() {
            println("무브 무브")
        }

        override fun fly() {
            println("날다 날다")
        }

    })
}

private fun moveSomething(movable: Movable){
    movable.move()
    movable.fly()
}