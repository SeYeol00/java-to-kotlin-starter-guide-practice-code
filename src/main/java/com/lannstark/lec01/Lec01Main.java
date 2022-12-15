package com.lannstark.lec01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lec01Main {

  public static void main(String[] args) {
    long number1 = 10L; // (1)
    final long number2 = 10L; // (2)
    // final은 불변 즉, 값을 할당 받고 나서

    Long number3 = 1_000L; // (3)
    Person person = new Person("최태현"); // (4)

    // final이 붙어있어도 컬렉션은 값을 추가 가능하다.
    final List<Integer> numbers = Arrays.asList(1,2);
    numbers.add(3);
  }

}
