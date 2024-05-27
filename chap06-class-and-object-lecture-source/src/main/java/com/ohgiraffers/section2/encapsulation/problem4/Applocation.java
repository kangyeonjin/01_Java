package com.ohgiraffers.section2.encapsulation.problem4;

public class Applocation {

    public static void main(String[] args) {

        Monster monster1 = new Monster();

        //kind필드는 private로 접근제한이 되어 있기 떄문에
        //필드로 직접 접근이 안된다
//        monster1.kinds="";
//        monster1.hp =10;

        //선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
        //public으로 접근을 허용한 메소드만 이용할수있게 해놓은것
        //  >>캡슐화

        monster1.setkinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());

        /*
        * 클래스 작성시, 특별한 목적이 아닌 이상 캡슐화가 기본 원칙으로 사용됨
        * */


    }
}
