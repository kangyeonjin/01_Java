package com.ohgiraffers.section04.comparison;

public class Application {

    public static void main(String[] args) {

        /*
        * 비교연산자
        * 비교연산자는 피연산자 사이에 상대적인 크기를 판단해 참 혹은 거짓을 반환하는 연산자
        * 연산자중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건물의 조건절에 많이 사용
        *
        * 비교연산자의 종류
        * '==' : 왼쪽의 연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환
        * '!=' 왼쪽의 피연산자와 오른쪽의 피연산자가 다르면true 같으면 false를 반환
        * '>' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 크면 true 아니면 false를 반환
        * '>=' 왼쪽의 피연산자가 오른쪽의 피연산자보다 크거나 같은면 true 아니면false를 반환
        * '<' ;왼쪽의 피연산자가 오른쪾의 피연산자보다 작으면 true 아니면false
        * '<=' : 왼쪽의 피연산자가 오른쪽의 피연산자보다 같거나 작으면 true아니면false
        *
        *
        * */

        //정수비교
        int inum1 = 10;
        int inum2 = 20;

        System.out.println(("====================정수값 비교======================"));
        System.out.println("inum1과 inum2가 같은지 비교 = " + (inum1 == inum2));  //false
        System.out.println("inum1과 inum2가 같지 않은지 비교 = " + (inum1 != inum2));  //true
        System.out.println("inum1과 inum2가 큰지 비교 = " + (inum1 > inum2));  //false
        System.out.println("inum1과 inum2가 크거나같은지 비교 = " + (inum1 >= inum2));  //false
        System.out.println("inum1과 inum2가 작은지 비교 = " + (inum1 < inum2));  //true
        System.out.println("inum1과 inum2가 작거나같은지 비교 = " + (inum1 <= inum2));  //true


        //실수
        double dnum1 =10.0;
        double dnum2 = 20.0;

        System.out.println();
        System.out.println(("====================실수값 비교======================"));
        System.out.println("dum1과 dnum2가 같은지 비교 = " + (dnum1 == dnum2));  //false
        System.out.println("dum1과 dnum2가 같지 않은지 비교 = " + (dnum1 != dnum2));  //true
        System.out.println("dum1과 dnum2가 큰지 비교 = " + (dnum1 > dnum2));  //false
        System.out.println("dum1과 dnum2가 크거나같은지 비교 = " + (dnum1 >= dnum2));  //false
        System.out.println("dum1과 dnum2가 작은지 비교 = " + (dnum1 < dnum2));  //true
        System.out.println("dum1과 dnum2가 작거나같은지 비교 = " + (dnum1 <= dnum2));  //true

        //문자값 비교
        char ch1 = 'a'; //97
        char ch2 = 'A'; //65

        System.out.println();
        System.out.println(("====================문자값 비교======================"));
        System.out.println("ch1과 ch2가 같은지 비교 = " + (ch1 == ch2));  //false
        System.out.println("ch1과 ch2가 같지 않은지 비교 = " + (ch1 != ch2));  //true
        System.out.println("ch1과 ch2가 큰지 비교 = " + (ch1 > ch2));  //true
        System.out.println("ch1과 ch2가 크거나같은지 비교 = " + (ch1 >= ch2));  //true
        System.out.println("ch1과 ch2가 작은지 비교 = " + (ch1 < ch2));  //false
        System.out.println("ch1과 ch2가 작거나같은지 비교 = " + (ch1 <= ch2));  //false

        //논리값비교
        //==와 !=는  비교가 가능하지만 대소비교는 불가능하다
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println();
        System.out.println(("====================논리값 비교======================"));
        System.out.println("bool1과 bool2가 같은지 비교 = " + (bool1 == bool2));  //false
        System.out.println("bool1과 bool2가 같지 않은지 비교 = " + (bool1 != bool2));  //true
//        System.out.println("bool1과 bool2가 큰지 비교 = " + (bool1 > bool2));  //true
//        System.out.println("bool1과 bool2가 크거나같은지 비교 = " + (bool1 >= bool2));  //true
//        System.out.println("bool1과 bool2가 작은지 비교 = " + (bool1 < bool2));  //false
//        System.out.println("bool1과 bool2가 작거나같은지 비교 = " + (ch1 <= ch2));  //false

        //문자열 비교
        //==와 !=는 비교가 가능하지만 대소 비교는 불가능
        String str1 = "java";
        String str2 = "java";

        System.out.println();
        System.out.println(("====================문자열값 비교======================"));
        System.out.println("str1과 str2가 같은지 비교 = " + (str1 == str2));  //false
        System.out.println("str1과 str2가 같지 않은지 비교 = " + (str1 != str2));  //true
//        System.out.println("str1과 str2가 큰지 비교 = " + (str1 > str2));  //true
//        System.out.println("str1과 str2가 크거나같은지 비교 = " + (str1 >= str2));  //true
//        System.out.println("str1과 str2가 작은지 비교 = " + (str1 < str2));  //false
//        System.out.println("str1과 str2가 작거나같은지 비교 = " + (str1 <= str2));  //false

        int x = 10;
        int y = 11;

        boolean result = x <= y;
        System.out.println("result =" + result);









    }
}
