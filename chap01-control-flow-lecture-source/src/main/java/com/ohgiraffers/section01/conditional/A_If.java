package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_If {
    //실행용 클래스


        /*
        * [if문 표현식]
        * if([조건식]){
        *  //조건시깅 true일때 실행할 명령문
        * else
        * }
        * */

        /*
        * 조건식 : true or false 가 나오는 연산신을 조건식이라고한다
        * if문은 조건식의 결과값이 참(true) 나오면 {}안에 있는 코드를 실행하고
        * 조건식의 결과값이 거짓(false){}안에 있는 코드를 무시한다.
        *
        * */

        public void testSimpleIfStatement() {

           //정수 한개를 입력받아
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자 하나를 입력하세요");
            int num = sc.nextInt();

        // 그 수가 짝수이면 " 입력하신 숫자는 짝수입니다"라고 출력
            if (num % 2 == 0){
                System.out.println("입력하신 숫자는 짝수입니다.");
            }

        //짝수가 아니면 출력하지 않는 코드를 작성한다.
        //단. 조건과 상관없이 프로그램이 종료될때 '프로그램을 종료합니다"라고 출력
            System.out.println("프로그램을 종료합니다.");

    }
    public void testNestedIfStatement() {


    //중첩된 if문 실행 흐름확인
    //정수 한개를 입력받아
    Scanner sc = new Scanner(System.in);
    System.out.println("숫자를 한개 입력하세요 ;");
    int num = sc.nextInt();


    // 그 수가 양수인 경우에만 짝수인지를 확인하여
    if(num > 0 ) {
        if(num % 2 == 0){
            System.out.println("입력하신 숫자는 양수이면서 짝수이다");
        }

    }
    //짝수이면 "입력하신 숫자는 양수이면서 짝수입니다."
    //둘중하나라도 해당하지 않으면 아무 내용도 출력하지 않는 코드를 작성해보자
    //단 조건과 상관없이 프로그램이 종료될떄 "프로그램을 종료합니다다 라고 출력되도록한다

    System.out.println("프로그램을 종료합니다.");

    }

    }

