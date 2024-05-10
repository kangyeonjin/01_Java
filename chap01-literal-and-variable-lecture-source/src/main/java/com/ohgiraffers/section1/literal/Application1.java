package com.ohgiraffers.section1.literal;

public class Application1 {
    public static void main(String[] args) {
        /*
        System.out.print("a");
        System.out.print("a");
        System.out.println("b");
        System.out.print("c");

        System.out.println("편해요");
        System.out.println();
        */

        //주석 단축키 : ctrl + /
//        여러줄 주석처리 하고자할때  /* 내용 */
//
        //수업목표 : 여러가진 값의 형태를 출력할수있다.

//    정수출력
    System.out.println(123);
//    실수출력
        System.out.println(12.3);
//    문자열출력
        System.out.println('a'); //문자형태의 값은 홀따옴표로 감싸주어야한다.
//        System.out.println('ab'); //문자가아닌 문자열이므로 안됨

        System.out.println('1'); //문자형 따옴표있기때문
//        System.out.println('');

//        문자열출력
        System.out.println("안녕하세요");
//        문자열은 문자가 여러개가 나열된 형태를 의미하며 쌍따옴포로 감싸져있음
        System.out.println("123"); //필기 :정수이지만 쌍따옴표로 감싸져있기 때문에 문자열로 보아야한다.
        System.out.println(""); //아무값도 없는 빈쌍따옴표도 문자열로 취급된다
        System.out.println("a");//한개의 문자도 쌍따옴표로 감싸면 문자열이다(문자a와는 다름)

//        논리값 출력
        System.out.println(true);
        System.out.println(false);
    }
}