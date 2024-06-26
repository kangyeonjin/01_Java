package com.ohgiraffers.section01.exception;

public class Application1 {
    public static void main(String[] args) throws Exception {
        /*
        * 예외처리
        * 자바프로그램 작성시 자바 문법에 맞지 않는경우
        * 코드를 컴파일 하려고 할때 컴파일 에러를 발생시킨다
        * >>문법상의 오류
        * 컴퓨터프로그램이 동작하는 도중에 예상치못한 상태가 발생하여
        * 실행중인 프로그램이 영향을 받는 것을 오류와 예외
        * 이 두가지로 구분할수있다
        *
        * */

        /*
        * 오류
        * 시스템상에서 프로그램에 심각한 문제를 발생하여 실행중인 프로그램이 종료되는것
        * 이러한 오류는개잘자가 미리 예측하여 처리하는것이 불가능하며
        * 오류에대한 처리는 할수없다
        * 예외
        * 오류와 마찬가지로 실행중인 프로그램을 비정상적으로 종료시키지만
        * 발생할수있는 상황을 미리 예측하고 처리할수있는 미약한 오류를 의미한다
        * 개발자는 이러한 예외에 대해 예외처리를 통해 예외 상황을 적절히 처리하여 코드의 흐름을 컨트롤한다*/

        /*강제로 예외를 발생
        * -throw new예외 클래스명()
        * 예외 처리방법
        * 1. throw 로 위임(나를 호출한곳으로 예외를던진다)
        * 2. try catch로 처리
        * */

        ExceptionTest et = new ExceptionTest();

        et.checkEnoughMoney(10000,50000);
        et.checkEnoughMoney(10000,5000);

        //예외 발생 코드 아래에 있는 코드는 동작하지않고 종료
        System.out.println("프로그램을 종료합니다");







    }

}
