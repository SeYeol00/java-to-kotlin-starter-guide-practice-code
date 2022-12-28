package lec05

import java.lang.IllegalArgumentException

fun main(){

}

// void는 생략 가능
fun validateScoreIsNotNegative(score:Int){
    if(score<0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

// 자바에서 if문은 Statement
// 코틀린에서 if문은 Expression
// Statement: 프로그램의 문장, 하나의 값으로 도출되지 않는다.
// Expression: 하나의 값으로 도출되는 문장
// 즉 코틀린에서는 변수에 if문을 담을 수 있다.
// 자바도 3항 연산자를 사용하여 표현이 가능하다.
fun getPassOrFail(score: Int):String{
    return if(score>=50){
        "P"
    }else{
        "F"
    }
}

fun getGrade(score:Int):String{
    return if(score>=90){
        "A"
    }else if (score>=80){
        "B"
    }else if (score>=70){
        "C"
    }else {
        "D"
    }
}

// 코틀린에서 범위를 표한하는 문법 in
fun validateScoreIsIn(score:Int){
    // 이거 사기인듯 ..
    if(score in 0..100){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

// 코틀린에서는 switch case문이 없고 when이 있다.
fun getGradeWithSwitch(score: Int): String {
    return when(score){
        //          화살표로 case를 표현한다.
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

// 이런 코드가 가능하다.
fun startWithA(obj: Any): Boolean{
    return when(obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int){
    when(number){
        // or 조건 검사
        1,0,-1 -> println("어디서 많이 본 숫자입니다.")
        else -> println("숫자가 1, 0, -1이 아닙니다.")
    }
}

fun judgeNumber2(number: Int){
    when{
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
    }
}