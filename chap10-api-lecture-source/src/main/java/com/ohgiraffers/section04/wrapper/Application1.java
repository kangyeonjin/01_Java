package com.ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 기본타입         레퍼클래스
        * byte             Byte
        * short            Short
        * int              Int
        * long             Long
        * float            Float
        * double           Double
        * char             Char
        * boolean          Boolean
        * */

        /*
        * 박싱(boxing) 언박싱(unboxing)
        * 기본타입에서 레퍼클래스의 인스턴스로 인스턴스화 하는 것을 박싱이라고함
        * 레퍼클래스에서 타입의 인스턴스를 기본타입으로 변경하는것을 언박싱
        *
        * */

        int intValue = 20;
//        Integer boxingNumber1 = new Integer(intValue);  //생성자로 박싱
        Integer boxingNumber1 = Integer.valueOf(intValue); //static 메소드 이용 //박싱
        int unBoxingNumber = boxingNumber1.intValue();  //언박싱

        /*오토박싱과 오토언박싱
        * >박싱과 언박싱이 필요한상황에서 자바컴파일러가 자동으로 처리해준다
        * 이런자동화된 박싱과 언박싱을 오토박싱, 오토언박싱*/

        Integer boxingNumber2 = intValue;  //오토박싱

        int unBoxingNumber2 = boxingNumber2;  //오토언박싱

        //wrapper클래스의 값비교
        int inum =20;
        Integer integerNum1 = Integer.valueOf(20);  //박싱
        Integer integerNum2 = Integer.valueOf(20);
        Integer integerNum3 = 20;  //오토박싱
        Integer integerNum4 = 20;

        //기본타입과 래퍼클래스타입 == 연산으로 비교
        System.out.println("int와 Integer비교 :"+(inum==integerNum1));  //true
        System.out.println("int와 Integer비교 :"+(inum==integerNum3));  //true


        //오토박싱과 박싱도 == 연산으로 비교가능
//        System.out.println("int와 Integer비교 :"+(inter==integerNum3));  //true


    }
}
