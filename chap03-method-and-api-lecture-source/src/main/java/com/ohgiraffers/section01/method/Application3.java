package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {

        int num = 0;  //지역변수

        /*
        * 전달인자와 매개변수를 이용한 메소드 호출
        *
        * 변수의 종류
        * 1. 지역변수
        * 2. 매개변수
        * 3.전역변수(필드)
        * 4.클래스(static)변수
        *
        * */

        /*
        * 지역변수
        *
        * 지역변수는 선언한 메소드 블럭(영역) 내부에서만 사용가능하다.
        * 다른메소드간 서로 공유해야하는 값이 존재할경우, 메소드 호출시 사용하는 괄호를 이용해서 값을 전달할수 있다.
        * 이때 전달되는 값을 전달인자라고 부르고
        * 메소드 선언부 괄호안에 전달인자를 받기 위해 선언하는 변수를 매개 변수라고 부른다.
        *
        * */

        Application3 app3 = new Application3();
        //전달인자와 매개변수를 이용한 메소드 호출테스트

        app3.testMethod(20);
//        app3.testMethod(age :"20");  //자료형이 틀림
//        app3.testMethod(age : 20,30,40);  //갯수가 틀림
//        app3.testMethod();  //아무것도 넣지 않으면 실행이 안됨


        //변수에 값을 저장해서 전달 할 수 있다.
        int age =15;
//        String str = "15";
        app3.testMethod(age);

        //자동형변환을 이요해 값 전달이 가능하다
        byte byteAge =10;
        app3.testMethod(byteAge); //자동형변환

        long longAge = 5;
        app3.testMethod((int)longAge); //강제형변환

        app3.testMethod(age+3);  //15+3 =18


    }


    //나이를 받아와서 "당신의 나이는~세 입니다."
    public void testMethod(int age){

        System.out.println("당신의 나이는 "+ age + "세 입니다");

    }

    public void testMethod1(int tall) {

        System.out.println("당신의 키는 "+ tall + " 입니다");

    }
}
