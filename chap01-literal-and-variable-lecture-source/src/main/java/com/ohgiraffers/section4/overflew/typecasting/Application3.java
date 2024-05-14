package com.ohgiraffers.section4.overflew.typecasting;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 자동형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        *
        * 다른 자료형 끼리의 연산은 큰 자료형으로 자동형변환후 연산처리가된다
        *
        * */
    int inum = 10;
    long lnum = 100;

    /*
    * 1. 두수의 연산결과를 int형으로 반환후 int자료형변수에 리턴
    * */

        int isum =  (int) (inum + lnum);
        System.out.println("isum = " + isum);

//        long 형 값을 int로 형변환 한뒤에 연산을 진행
        int isum2 = inum + (int) lnum;
        System.out.println("isum = " + isum2);


//        주의 - int미만의 연산처리 결과는 int형
//        int형이 정수형의 default타입이기 때문
        byte byteNum1 =1;
        byte byteNum2 = 2;
        short shortNum = 3;
        short shortNum2 =4;

        int result1 =byteNum1 + byteNum2;
        int result2 = shortNum + shortNum2;
        int result3 = byteNum1 + shortNum;
        int result4 = shortNum + byteNum1;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);





    }

}
