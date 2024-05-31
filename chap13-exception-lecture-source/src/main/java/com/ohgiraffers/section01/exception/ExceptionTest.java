package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money)throws Exception{
        System.out.println(money);

        if(money >= price){
            System.out.println("상품을 구입하기 위한 금액이 충분합니다");
        }else {

            /*
            * 강제로 예외 발생
            * 예외를 발생시키도 메소드 헤드에 throws구문을 추가
            * 예외를 발생시키는 쪽에서는 throw로 예외에 대한 책임을 위임해서
            * 해당예외에 대한 처리를 강제화시킨다
            * */

            throw new Exception();

        }
        System.out.println("즐거운 쇼핑하세요~~~");

    }


}
