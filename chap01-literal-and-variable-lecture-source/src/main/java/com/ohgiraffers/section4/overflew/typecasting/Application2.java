package com.ohgiraffers.section4.overflew.typecasting;

public class Application2 {
    public static void main(String[] args) {

        /*강제형변환
        * 바꾸려느 자료형으로 캐스트 연산자를 이용하여 형변환한다
        * ex. (바꿀 자료형) 값;
        *
        * */

        /*
        *  자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
         * 1. 강제형 규칙
         *   1-1. 큰 자료형에서 작은 자료형으로 변경시 강제 형변환이 필요하다.
         *   1-2. 실수를 정수로 변경 시 강제형변환이 필요하다.
         *   1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
         *   1-4. 논리형은 강제 형변환 규칙에서도 제외된다.
        * */

//        long 자료형 > int 자료형
        long lnum = 8;
//        int inum = lnum;  //데이터 손실가능성을 컴파일러가 알려준다

        int inum = (int) lnum;  //변경하려는 자료형을 명시하여, 강제형변환을 해야한다
        System.out.println("inum = " + inum);

//        short snum =("snum = " + snum);
//        System.out.println(snum);

        short snum = (short) inum;
        byte bnum = (byte) snum;
        System.out.println(bnum);

        //실수끼리 강제형변환
        double dnum = 8.0;
        //float fnum = dnum;
        float fnum = (float) dnum;
        System.out.println(fnum);

//실수를 정수로 변경시 강제 형변환

        float fnum2 = 4.0f;
        //long lnum2= fnum2;
        long lnum2 =(long) fnum2;
        System.out.println("lnum2 = " + lnum2);

//        문자형을 int미만 크기의 변수에 저장할때 강제 형변환이 필요
        char ch = 'a';
        byte bnum2 = (byte) ch;
//        byte bnum2 = ch;

        short snum2 = (short) ch;  //부호비트라서 값의범위가 달라서 강제 형변환을 해야함

//        정수를 char자료형에 강제형변환이 가능하다


        /*
        * 강제 형변환을 해도 논리형은 규칙에서 제외된다*/

//        boolean inTrue = true;
//        byte b = (byte)  isTrue;
//        short s = (short)  isTrue;
//        int i= (int)  isTrue;
//        float f = (float)  isTrue;
//        double d = (double)  isTrue;
//        char c = (char)  isTrue;
//




    }

}
