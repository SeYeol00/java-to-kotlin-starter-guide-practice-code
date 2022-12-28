package lec03

import com.lannstark.lec03.Person

fun main(){
    // 변수가 nullable이면 적절한 처리가 필요하다.
    val number1:Int? = 3
    // 코틀린에서 타입을 변환하려면 명시적으로 to변환 타입을 사용해야 합니다.
    val number2: Long = number1?.toLong() ?:0L // 널이 아니면 그 값, 널이면 0

    printAgeIfPerson(Person("",100))

    val person = Person("최태현",100)
    // 파라미터 바인딩 가능, html태그에서 파라미터 바인딩 생각하자
    println("이름 : ${person.name}")

    val str: String = """
        ABC
        EFG
        ${person.name}
    """.trimIndent()
    println(str)

    // 스트링 인덱싱 가능, char를 굳이 안 써도 된다.
    val str2:String = "ABC"
    println(str2[0])
    println(str2[2])

}

// Any는 자바의 Object와 같은 타입이다. 모든 타입의 상위 클래스
//fun printAgeIfPerson(obj: Any){
//    // 자바의 instanceof == 코틀린의 is
//    // !is는 아니라면 즉, 반대 뜻을 보인다.
//    if(obj is Person){
//        // 자바의 강제 형변환 () == 코틀린에서는 as
//        val person = obj as Person // as Person 생략 가능 -> 스마트 캐스트
//        println(person.age)
//    }
//}

fun printAgeIfPerson(obj: Any?){
        // 자바의 강제 형변환 () == 코틀린에서는 as
        val person = obj as? Person // as Person 생략 가능 -> 스마트 캐스트
        println(person?.age)
}