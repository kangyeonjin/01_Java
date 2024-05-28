package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    //추상메서드는 필드를 가질수있다
    private int nonStaticField;
    private static  int staticField;

    //생성자도 만들수있다 > 하지만 직접 인스턴스를 생성할수는 없다

    public Product(){

    }

    //추상클래스는 일반적인 메서드를 가질수있다.
    public void nonStaticField(){
        System.out.println("Product 클래스의 nonstaticMethod호출");
    }

    public static void StaticField(){
        System.out.println();
    }

    public abstract void abstMethod();



}
