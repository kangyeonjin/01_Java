package com.ohgiraffers.section01.generic;

import org.w3c.dom.ls.LSOutput;

public class Application {
    /*
     * 제네릭
     * 제네릭의 사전적의미는 "일반적인"이라는 의미
     * 자바에서 제네릭이란 데이터의 타입을 일반화한다는 의미를 가진다
     *
     * 제네릭 프로그래밍
     * 데이터의 형식에 의존하지 않고 하나의 값이 다른 데이터 타입들에 가질수있는 기술에
     * 중점을 두어 재사용성을 높일수 있는 프로그래밍 방식
     *
     * 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일시에 저장하는 방법을
     * 컴파일시에 미리 타입검사를 시행하게되면 클래스나 메소드 내부에서
     * 사용되는 객체의 타입 안정성을 높일수있으며
     * 반환값에 대한 타입변환 및 타입 검사에 들어가는 코드 생략이 가능해진다
     *
     * */

    GenericTest<Integer> gt = new GenericTest<Integer>();

//    gt.setValue(10);
//    System.out.println(gt.getValue());
//
//    System.out.println(gt.getValue()instanceof Integer); //gt의 value가 integer
//
//    GenericTest<String> gt1 = new GenericTest<>();
//    gt1.setValue("홍길동");
//    System.out.println(gt1.getValue());
//    System.out.println(gt1.getValue()instanceof String);
//
//    //생성자 쪽에 타입명시를 하지 않아도 적용가능, 빈다이아몬드 연산자는 작성해야함
//    GenericTest<String> gt2 = new GenericTest<>();
//    gt2.setValue(0.5);
//    System.out.println(gt2.getValue());
//    System.out.println(gt2.getValue()instanceof Double);



}
