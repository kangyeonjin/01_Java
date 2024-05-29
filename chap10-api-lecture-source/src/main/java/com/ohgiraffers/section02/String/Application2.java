package com.ohgiraffers.section02.String;

public class Application2 {
    public static void main(String[] args) {
        /*문자열 객체를 만드는 다양한 방법*/

        /*1.""리터럴형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리
        * singleton
        * 2.new String("문자열"):매번새로운 인스턴스를 생성*/

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println((str1 == str2));
        System.out.println((str2 == str3));
        System.out.println((str2 == str4));

        /*해시코드값비고*/
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        //문자열은 불변이라는 특징
        str2 += "oracle";

        System.out.println((str1==str2));

        /*equals():String 클래스의 equals()메소드는 인스턴스 비교가 아닌 문자열 값을 비교해서
        * 동일한 값으 가지는 경우 true, 다른값을 가지는 경우 false를 반환하도록
        * object의 equals()메소드를 재정의(overring)해두었다
        * 따라서 문자열 인스턴스 생성방식과 상관없이 동일한 문자열인지 비교하기 위해서는
        * ==연산대신에 equals()메소드를 사용해야한다*/

        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));



    }
}
