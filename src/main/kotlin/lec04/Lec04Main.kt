package lec04

import com.lannstark.lec04.JavaMoney

fun main(){

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if(money1 > money2){
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)



    // 자바에서는 동일설에 ==을 사용, 동등성에 equals를 직접 호출

    // 코틀린에서는 동일성에 ===을 사용, 동등성에 ==을 호촐
    // ==을 사용하면 간접적으로 equals를 호출한다.
    println(money3 === money4)
    println(money3 === money5)

    // 코틀린도 논리 연산자는 Lazy 연산을 한다.
    if(fun1() || fun2()){
        println("본문1")
    }

    if(fun1() && fun2()){
        println("본문2")
    }

    // 코틀린에서는 연산자 오버로딩이 객체마다 가능하다
    val money6 = Money(1_000L)
    val money7 = Money(2_000L)
    println(money6 + money7)

}

fun fun1():Boolean{
    println("fun 1")
    return true
}

fun fun2():Boolean{
    println("fun 2")
    return true
}