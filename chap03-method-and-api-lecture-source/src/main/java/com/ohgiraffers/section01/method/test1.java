package com.ohgiraffers.section01.method;

public class test1 {
    public static void main(String[] args) {

        System.out.println("main()시작됨");

        test1 aa = new test1();
        aa.method1();

        System.out.println("main()종료됨");
    }
    public void method1(){

        System.out.println("method 호출");

        method2();

        System.out.println("method 종료");

    }
    public void method2(){

        System.out.println("method 호출");

        System.out.println("method 종료");

    }

}

