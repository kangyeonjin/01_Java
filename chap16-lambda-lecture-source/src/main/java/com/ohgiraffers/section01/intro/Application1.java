package com.ohgiraffers.section01.intro;

public class Application1 {
    public static void main(String[] args) {

        /*람다식(lambda)
        * 메소드를 하나의 식으로 표현한것
        * 메소드를 람다식으로 표현하면 메소드 이름이 없는 익명함수라고 할수있다
        * 람다식자체는 알론조 처치가 개발한 계산법을 기초로했다
        * f(x,y)= x*y
        * 위의 함수를 람다식으로 변경하면 다음과 같아
        * (x,y) >x*y*/

        /*
        * 람다표현식
        * 매개변수가 없는경우
        * ()>{...}
        *
        * 매개변수가 있는경우
        * (매개변수, ...) > {...}
        *
        * 람다식에서 매개변수의 타입은 추론이 가능하기때문에
        * 명시적으로 작성하지 않아도 된다
        * 또한 매개변수가 한개만 존재하는 경우()를 생략할수있으면
        * 실행문이 한줄인 경우{}는 생략가능하다
        * */

        /*
        * 인터페이스에 정의된 추상메서드를 활용하는 방법 3가지
        * 1. 인터페이스를 상속받은클래스를 정의해서기능을 완성후 사용하는 방법
        * 2. 익명클래스를 활용해서 메소드를 정의후 사용하는 방법
        * 3. 람다식을 활용하는 방법*/

        //1. 인터페이스를 구현한 구현체 이용방식
        Calculator c1 = new CalculatorImpl();
        System.out.println(c1.sumTwoNumber(10,20));

        //2. 익명 클래스를 활용한 방식
        Calculator c2 = new Calculator() {
            @Override
            public int sumTwoNumber(int a, int b) {
                return a + b;
            }
        };
        System.out.println(c2.sumTwoNumber(20,30));

        //3. 람다식을 활용한 방식
        Calculator c3 = (x, y) -> x * y;
        System.out.println(c3.sumTwoNumber(40,50));



    }
}
