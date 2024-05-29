package com.ohgiraffers.section04.wrapper;

public class Application3 {
    //기본자료형값을 문자열로 변경
    public static void main(String[] args) {
        /*
        * valueOf : 기본자료형 값을  Wapper클래스타입으로 변환시키는 메소드
        * toString : 필드값을 문자열로 반환하는메소드
        * */

        String b = Byte.valueOf((byte) 1).toString();
        String s = Short.valueOf((short)2).toString();
        String i = Integer.valueOf((int) 3).toString();
        String l = Long.valueOf(8l).toString();
        String f = Float.valueOf(4.0f).toString();
        String d = Double.valueOf(8.0).toString();
        //String bl =Boolean.valueOf(true);
        String c = Character.valueOf('a').toString();

        //sting클래스의 valueof를 사용할수도 있다
        String str = String.valueOf(10);

        //문자열합치기를 이용해 string으로 변환할수도있다
        String str2 = 123 + "";

    }

}
