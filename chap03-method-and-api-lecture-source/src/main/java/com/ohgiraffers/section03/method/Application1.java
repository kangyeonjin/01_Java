package com.ohgiraffers.section03.method;

import com.sun.security.jgss.GSSUtil;

import java.lang.*;  //.* 어떤 단어 들어와도 import 해주겠다.

public class Application1 {
    public static void main(String[] args) {
        /*
        * ApI
        *
        * Application Programming Interface는 프로그램에서 사용할수있도록
        * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할수 있도록 만든 인터페이스를 뜻함
        * 쉽게 말해 우리가 구현할수없거나 구현하기 번거로운 기능들을 JDK를 설치하면 자동으로 사용할수 있도록 제공해놓은 소스코드(클래스나 인터페이스)를 의미
        * ->누군가 작성해놓은 소스코드이니 가져다 쓰는 방법을 본다는 말
        *
        * */

        /*
        * java.lang.math
        * math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스이다
        * 모든 메서드는 static 메소드로 작성되어있다.
        * */

        System.out.println("-7의 절대값 : " + (java.lang.Math.abs(-7)));

//        java.lang 패키지는 자주 사용하기 때문에,
//        컴파일러가 import java.lang.*;를 자동으로 추가해준다.
        System.out.println("-1.25의 절대값" + Math.abs(-1.25));

//        최대값 죄소값
        System.out.println("10과  20중 더 작은것은?" + Math.min(10,20));
        System.out.println("20과  30중 더 큰은?" + Math.max(20,30));

        System.out.println("원주율 : " + Math.PI);

//        난수(랜덤한수)
        /*
        * 0부터 1까지 실수형태의 난수를 발생시킨다
        * 호출할때마다 다른 값을 가진다
        * */
        System.out.println("난수발생 :" + Math.random());





    }

}
