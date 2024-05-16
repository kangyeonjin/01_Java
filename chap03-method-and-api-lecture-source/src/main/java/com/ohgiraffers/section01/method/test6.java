package com.ohgiraffers.section01.method;

public class test6 {
    public static void main(String[] args) {

//        어플리케이션 2개를 활용하여 호출하기(60+40)
        int a = 60;
        int b = 40;

        test7 aa = new test7();
        int min = aa.non(a, b);

        System.out.println("두수중 최소값은 : " + min);
    }
}
