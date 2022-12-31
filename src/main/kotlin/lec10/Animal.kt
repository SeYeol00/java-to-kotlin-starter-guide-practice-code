package lec10

abstract class Animal(
    // 필드,생성자,getter
    protected val species: String,

    // 추상 프로퍼티가 아니라면
    // 프로퍼티를 오버라이드 할 때는 무조건 open을 붙여야 한다.
    protected open val legCount: Int,
){
    abstract fun move()

}