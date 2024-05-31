package com.ohgiraffers.doit.chap03.Q5;

public class Application {
    public static void main(String[] args) {


        //replaceAll메서드 사용
        //문자열바꾸기 " : >> # "으로  바꿔서 출력
        String a = "a:b:c:d";

        String b = a.replaceAll(":", "#");

        System.out.print(b);



    }

}
