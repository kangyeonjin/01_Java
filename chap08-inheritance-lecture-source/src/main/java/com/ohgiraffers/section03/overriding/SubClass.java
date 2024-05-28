package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass{

    //1. 메소드 이름을 변경하면 에러발생

//    @Override
//    public void method2(int num) {  //메서드명을 바꾸면새로운메서드로 인식이됨

//    }

    //2. 메소드의 리턴타입 변경하면에러발생


    @Override
    public int method(int num) {
       return num;
    }

    //3. 매개변수 갯수나 ,타입이 변경되면 에러발생


    @Override
    public void method(String name) {
    }
    public void method(int num, int num2) {
    }


}
