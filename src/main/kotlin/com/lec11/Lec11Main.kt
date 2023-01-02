package com.lec11



// 접근제어자

// 접근 제어자가 생략되어 있으면 다 public이 붙어있다고 간주
// protected는 파일의 최상단에 쓸 수 없다.
// internal은 같은 모듈에서만 접근
// private은 같은 파일에서만 접근 가능

val a = 3
fun add(num1: Int, num2: Int): Int{
    return num1 + num2
}

// 생성자에 접근 지시어를 붙이려면 constructor를 써주어야한다.
// final을 풀려면 open을 써라
class Cat private constructor(
    val price: Int
){}
class Car constructor(
    // getter setter에 접근제어자를 여기서 지정
    internal val name: String,
    // 이러면 getter setter 모두 private이 붙음
    private val owner: String,
    _price: Int
){
    var price = _price
        private set
}


fun main(){

}

