package com.ohgiraffers.doit.chap03.Q2;

public class Application {
    public static void main(String[] args) {
        //홍길동씨의 주민등록번호는 881120-1068234이다
        //앞자리에 해당하는 부분으로 나누어 출력
        //주민등록번호 나누기

        String pin = "881120-1068234";
        String yyyymmdd = pin.substring(0,6);

        System.out.println(yyyymmdd);



    }
}
