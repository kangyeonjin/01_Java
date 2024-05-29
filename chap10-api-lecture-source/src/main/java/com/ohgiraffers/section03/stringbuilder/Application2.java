package com.ohgiraffers.section03.stringbuilder;

public class Application2 {
    //stringbuilder에 자주사용되는 메서드
    public static void main(String[] args) {

        /*
        * delete()시작인덱스와 종료인덱스를 이용해서 문자열에서 원하는 부분의 문자열 제거
        * deletecharAt(): 문자열인덱스를 이용해서 문자하나를제거
        * > 둘다 원본에 영향을 미친다
        *
        * */

        StringBuilder sb = new StringBuilder("javaoracle");
        StringBuilder sb2 = new StringBuilder("javaoracle");

        System.out.println(sb);
        System.out.println(sb.delete(2,5));
        System.out.println(sb);


        System.out.println(sb2);
        System.out.println(sb2.deleteCharAt(2));
        System.out.println(sb2);


    }

}
