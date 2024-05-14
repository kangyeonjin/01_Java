package com.ohgiraffers.section3.constant;

public class Application1 {
    public static void main(String[] args) {

        /*
         * 상수
         * 변수가 메모리에 변경될 값을 저장하기 위한 공간을 나타낸다면,
         * 상수는 이와 상반되는 개념이다.
         *
         * 변하지 않는 값(항상 고정된값)을 저장하기 위한 메모리상의 공간을 상수라고함
         *
         * */
        /*
         * 상수의 사용목적
         * 변경되지 않는 고정된 값을 저장할 목적으로 사용함
         * 초기화 이후에 값을 대입하면 컴파일 에러를 발생시켜 수정되지 못하도록 한다.
         *
         * */

        /*
         * 상수의 사용방법
         * 1. 상수를 선언한다. (변수와 비슷하지만 final 이라는 키워드를 사용함)
         * 2. 값을 초기화함(초기화이후에는 값 변경이 불가능)
         * 3. 필요한 위치에 상수를 호출해서사용함
         *
         * */

        //상수는 선언시 자료형 앞에 FINAL키워드를 붙인다.
        final int MAX_AGE;  //대문자사용

        MAX_AGE = 20;  //상수의 첫 초기화
//        MAX_AGE =10;  //한번초기화된 상수는 그 이후에 값을 변경할수없다.

        System.out.println("MAX_AGE = " + MAX_AGE);

//        연산도 가능함
        System.out.println("MAX_AGE = " + (MAX_AGE * 2));

        int sum = MAX_AGE;
        //int MAX_AGE;  //상수도 변수이고, 변수명이 지정되어있기 때문에 같은 변수명으로 다시 선언할수없다


    }
}
