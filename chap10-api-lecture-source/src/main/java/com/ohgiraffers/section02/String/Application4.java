package com.ohgiraffers.section02.String;

public class Application4 {
    public static void main(String[] args) {
        //이스케이프(escape) 문자

        /*
        * escape문자
        * 문자열내에서 사용하는 문자 중 특수문자를 표현하거나 특수기능을 사용할때 사요됨
        * 이스케이프 문자         의미
        * \n           개행(줄바꿈)
        * \t           탭
        * \n
        * \'           작은따옴표
        * \"           큰따옴표
        * \\           역슬레쉬표시
        *
        * */
        System.out.println("안녕하세요, \n 저는 홍길동입니다");

        System.out.println("안녕하세요, \t 저는 홍길동입니다");
        System.out.println("안녕하세요, 저는 홍길동입니다");

        System.out.println("안녕하세요, 저는 '홍길동'입니다");
//        System.out.println('');
        System.out.println('\'');
//                System.out.println("안녕하세요, 저는 '홍길동'입니다");
        System.out.println("안녕하세요, 저는 \"홍길동\" 입니다");
        System.out.println("안녕하세요, 저는 \\홍길동\\ 입니다");

        /*
        * split할때 이스케이프 문자를 사용해야하는 특수문자도 존재한다
        * 이스케이프 문자 사용안하는 특수문자
        * ~'!@#-_;:`,<>/
        * 이스케이프 문자를 사용하는 특수문자(\\)
        * $^*()+|{}.?=
        * \\
        * */

        String str = "java^oracle^jdbc";
        String[] sarr = str.split("\\^");

        for(String s :sarr){
            System.out.println(s);
        }


    }
}
