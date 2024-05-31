package com.ohgiraffers.section02;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 사용자 정의의 예외 클래스
        * RuntimeExciption의 후손 대부분은 예외 처리를 강제화 하지않음
        * 이런경우에도 예외를 강제화 하고 싶을때는 사전에 정의된 예외 클래스외에
        * 개발자가 원하는 명칭의 예외 클래스를 만들어 작성할수있다.
        * */

        ExceptionTest et = new ExceptionTest();

        try {

            et.checkEnoughMoney(10000,5000);

        }catch (Exception e){

            //출력하고 로그를 남기는것
            e.printStackTrace();

        }



    }
}
