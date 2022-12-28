package lec01

import com.lannstark.lec01.Person

fun main(){

    // 자바에서 final이 안 붙는 가변 변수는 무조건 var -> variable
    var number1 : Long  = 10L

    // 자바에서 final이 붙는 불변 변수는 무조건 val -> value
    val number2 = 10L
    // 코틀린은 타입을 의무적으로 작성 안 해도 되지만 작성할 수 있다.

    var number3 : Int = 10

    // val 컬렉션은 element를 추가할 수 있다.
    // 모든 변수는 우선 val로 만들고 꼭 필요한 경우 var로 변경한다.

    // 코틀린에서는 프리미티브 타입과 레퍼런스 타입을 구분하지 않아도 된다.
    // 코틀린은 숫자, 문자, 불린과 같은 몇몇 타입은 내부적으로 특별한 표현을 갖는다.
    // 이 타입들은 실행 시에 프리미티브 벨류로 표현되지만, 코드에서는 평범한 클래스처럼 보인다.
    // 즉 long, int, boolean은 Long, Integer, Boolean으로 합쳐져있다는 뜻이다.
    var number4 : Long = 10L

    // 기본적으로 코틀린은 대부분에 null을 못 넣게 해놨다.
    // null은 아예 다른 타입으로 취급한다.
    // 넣게하고 싶다면 타입? 처럼 물음표를 추가해야한다.
    var number5 : Long? = 1000L
    number5 = null

    // 코틀린에서는 new를 쓰면 안된다.
    var person = Person("최태현")




}
