package com.ohgiraffers.section02.abstractclass;

//자바에서는 단일 상속만 가능하다
public class SmartPhone extends Product /*java.util.Scanner*/{

    public SmartPhone(){}

    @Override
    public void abstMethod(){
        System.out.println("product 클래스의 abstMethod를 오버라이딩한 메소드로 호출");
    }

    public void printSmartPhone(){
        System.out.println("SmartPhone클래스의 printSmartPhone메서드 호출함");
    }



}
