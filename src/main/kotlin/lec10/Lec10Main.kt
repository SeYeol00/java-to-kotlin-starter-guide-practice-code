package lec10

fun main(){
    Derived(10)
}


open class Base(
    // 생성자
    open val number: Int = 100
    ){
    init {
        // 상위클래스에서 하위 클래스에서 오버라이드한 프로퍼티에 접근하는 것을 주의한다.
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number){
    init {
        println("Derived Class")
    }
}