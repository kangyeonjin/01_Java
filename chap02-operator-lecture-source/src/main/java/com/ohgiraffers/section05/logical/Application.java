package com.ohgiraffers.section05.logical;

public class Application {

    public static void main(String[] args) {

        /*
        논리연산자
        논리값을 취급하는 연산자

        논리연산자의 종류

        1. 논리 연결연산자
       두개의 피연산자를 가지는 이항연산자, 연산자의 결합방향은 왼쪽에서 오른쪽이다
       두개의 논리식을 판단하여 참과 거짓을 판단한다

        1-1.&& (논리and) 연산자
                -두개의 논리식이 모두 참일경우 true반환
                -둘중한개라도 거짓인경우 거짓을 반환하는 연산

        1-2. || (논리or)
                -두개의 논리식 중 둘중 하나라도 참일 경우 true반환
                -둘다 모두 거짓일 경우  False를 반환하는 연산

        2. 논리 부정 연산자
           피연산자가 하나인 단항연산자로 피연산자의 결합방향은 왼쪽에서 오른쪽이다

        2-1 !(논리not) 연산자 : 논리식의 결과가 참이면 거짓을, 거짓이면 참을 반환함
        * */

        //둘중하나라도 거짓이면 거짓
        System.out.println();
        System.out.println("=================논리 and 연산======================");
        System.out.println("true와 true의 논리 and연산 : " + (true && true)); //true
        System.out.println("true와 false의 논리 and연산 : " + (true && false));  //false
        System.out.println("false와 true의 논리 and연산 : " + (false && true)); //false
        System.out.println("false와 false의 논리 and연산 : " + (false && false));  //false

        //둘중하나만 true이면 true
        System.out.println();
        System.out.println("=================논리 or 연산======================");
        System.out.println("true와 true의 논리 and연산 : " + (true || true)); //true
        System.out.println("true와 false의 논리 and연산 : " + (true || false));  //true
        System.out.println("false와 true의 논리 and연산 : " + (false || true)); //true
        System.out.println("false와 false의 논리 and연산 : " + (false || false));  //false


        System.out.println();
        System.out.println("=================논리 not 연산======================");
        System.out.println("true의 논리 not 연산 : " + (!true)); //false
        System.out.println("false의 논리 not 연산 : " + (!false));  //true

        /*
        * 논리식에 논리 연산자 활용
        *
        * */

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println();
        System.out.println("============논리식에 논리 연산자 활용==================");
        System.out.println("=========and연산=============");
        System.out.println("a가 b보다 작으면서 c가d보다작은지 확인 : " +(a<b && c<d)); //true이고 true이니까 true
        System.out.println("a가 b보다 작으면서 c가d보다 큰지 확인 : " +(a<b && c>d)); //false
        System.out.println("a가 b보다 크면서 c가d보다 작은지 확인 : " +(a>b && c<d)); //false
        System.out.println("a가 b보다 크면서 c가d보다 큰지 확인 : " +(a>b && c>d));  //false

        System.out.println("============or연산=============");
        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 :"+ (a < b ||c < d));
        System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 :"+ (a < b ||c < d));
        System.out.println("a가 b보다 크거나 c가 d보다 작은지 확인 :"+ (a > b ||c < d));
        System.out.println("a가 b보다 크거나 c가 d보다 작은지 확인 :"+ (a > b ||c > d));





    }

}
