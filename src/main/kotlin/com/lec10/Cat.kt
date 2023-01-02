package com.lec10

class Cat(
    //생성자
    species: String
) // 주 생성자를 콜하는 것임 -> super
    : Animal(species,4)
// 상속 받을 때는 한칸 띄고 : 을 쓴다. 이게 extends다.
// 매서드에 :을 붙이면 반환 타입,
// 클래스에 :을 붙이면 extends라고 생각하자.
 {
     override fun move() {
         println("고양이가 사뿐 사뿐 걸어가~")
     }
 }