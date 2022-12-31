package lec08

fun main(){
    // named argument 지정 파라미터
    // 기본 값이 있는 것 제외하고 특정한 것만 쓸 떄 사용
    // 자바의 builder의 장점을 가지고 있다.
    repeat("Hello world ", useNewLine = true)
    // 빌더와 같은 효과
    printNameAndGender(gender = "FEMALE", name = "최태현")

    printAll("A","B","C")

    val array = arrayOf("A","B","C")
    // 스프레드 연산자 *
    // 배열을 바로 넣을 순 없다.
    printAll(*array)

}

// 새로운 형태, 리턴 대신에 블락을 없애고 = 을 쓸 수 있다.
// public은 생략 가능
// = 을 쓰면 반환 타입 자동 추론도 가능하다.
fun max(a: Int, b: Int) = if(a > b) a  else b

// 코틀린의 오버로딩
// 인수 기본 값 지정 하기, default parameter
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true){
    // 범위 지정해주기
    for( i in 1..num){
        if(useNewLine){
            println(str)
        }else{
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String){
    println(name)
    println(gender)
}

// 가변인자 호출
fun printAll(vararg strings: String){
    for(str in strings){
        println(str)
    }
}