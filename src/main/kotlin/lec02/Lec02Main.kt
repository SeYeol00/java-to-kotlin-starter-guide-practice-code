package lec02

import com.lannstark.lec02.Person


fun main(){

    // 바로 호출을 하기 위해서는 safe call을 써야한다.
    // 변수 선언 떄 ?을 타입에 붙인다.
    val str: String? = "ABC"
    // safe call 예시
    println(str?.length)
    // safe call과 Elvis 연산자
    println(str?.length ?:0)
    // null이면 0 출력 아니면 그대로

    println(startWith("BC"))

    // 런타임에서 에러가 날 수 있다.
    println(startWith(null))

    // 코틀린에서 자바코드를 참조할 때는 코틀린이 자바코드의  널에 대한 어노테이션을 이해한다.
    val person = Person("공부하는 개발자") // null이 들어가면 런타임 때 오류가 난다.
    startsWithA(person.name)

}

fun startsWithA(str: String):Boolean{
    return str.startsWith("A")
}

// 코틀린에서 반환 타입은 이렇게 쓴다.
// fun 함수이름(파라미터 이름 : 타입(?)) : 반환타입
fun startWithA1(str : String?) : Boolean { // null이 가능하니까 ?를 붙일 수 있다.
    // 엘비스 연산자 사용, 아래랑 같다.
    return str?.startsWith("A") ?:throw IllegalArgumentException("null이 들어왔습니다.")

//    if(str == null){
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    }
//    return str.startsWith("A")
}

// 반환 타입 널 값 처리 허용
fun startWithA2(str: String?) : Boolean?{
    return str?.startsWith("A")
//    if(str == null){
//        return null
//    }
//    return str.startsWith("A")
}

// 코틀린에서는 널이 가능한 타입을 완전히 다르게 취급한다.
// null이 인수로 가능하면 바로 호출은 불가능하다
// 옵셔널 느낌이다
fun startWithA3(str:String?):Boolean{
    return str?.startsWith("A") ?:false
//    if (str == null){
//        return false
//    }
//    return str.startsWith("A")
}

fun startWith(str: String?) : Boolean{
    // 절대 널이 올 수 없다는 표시 = !!
    return str!!.startsWith("A")
}