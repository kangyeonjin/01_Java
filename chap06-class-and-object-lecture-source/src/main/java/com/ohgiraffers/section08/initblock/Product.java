package com.ohgiraffers.section08.initblock;

public class Product {

    //1. 필드를 초기화하지 않으면 jvm이 정한 기본값으로 객체가 생성된다
//    private  String name;  //제품명
//    private int price;  //제품가격
//    private static String brand;  //제품브랜드


//    2.명시적초기화
    private  String name="갤럭시";  //제품명
    private int price=1000000;  //제품가격
    private static String brand = "삼송;  //제품브랜드

//            3.인스턴스 초기화블럭

    {
        name ="z플립";
        price = 1200000;

        //주의사항
        /*인스턴스 초기화 블럭에서는 static필드를 초기화 할수있는 것처럼 보이지만
        이미 static초기화 블럭은 클래스가 로드될때 이미 기본값으로 초기화를 진행했다
        따라서 인스턴스 초기화 블럭이 동작하는 시점에 이미 초기화가 진행된 정적필드에
        인스턴스 초기화 블럭에서 대입한 값으로 덮어쓰게 되는것
        * */
        brand ="삼성";

        System.out.println("인스턴스 초기화 블럭 동작함..");

    }
    static {
        //static초기화 블럭에서는 nonstatic필드를 초기화 하지 못한다
//        name = "아이폰";
//        price = 1300000;
         brand="엘지";
        System.out.println("정적초기화 블럭 동작함..");

    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;

    }

    //필드값 전체 문자열 합치기해서 문자열 반환
    public String getInformation(){
        return "Product [name="+this.name+",price = "+this.price+
                ",brand="+Product.brand+"J";


    }
}
