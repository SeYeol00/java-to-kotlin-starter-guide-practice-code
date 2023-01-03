package com.lec16

class Person constructor(
    private val firstName: String,
    private val lastName: String,
    private var age: Int
) {

    fun getAge(): Int{
        return this.age
    }
    fun setAge(): Int{
        return this.getAge() + 1
    }


    fun nextYearAge(): Int{
        println("맴버 함수")
        return this.age + 1
    }
}