package com.lec04

data class Money(// 생성자를 여기서 정의??
    val amount: Long
) {
    // 코틀린은 객체마다 연산자를 재정의 할 수 있다.
    operator fun plus(other : Money): Money {
        return Money(other.amount + this.amount)
    }
}