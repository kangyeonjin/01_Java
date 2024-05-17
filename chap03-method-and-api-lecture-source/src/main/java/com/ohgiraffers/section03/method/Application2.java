package com.ohgiraffers.section03.method;

public class Application2 {
    public static void main(String[] args) {

        /*난수의 활용
        * Math.random()을 이용해 발생한 난수는 0부터 1까지 1천가지의 실수범위는 난수값을 발생시민다.
        * 필요에따라 정수형태의 값을 원하는 범위만큼 발생시켜야하는 경우들이 존재한다.
        *
        * 원하는 범위의 난수르 ㄹ구하는 공식
        * (int)(Math.random * 구하려는 난수의 갯수)+구하려는 난수의 최소값
        * */

//        난수의범위 0 ~ 9 + 숫자
        int random1 = (int) (Math.random() * 10);
        System.out.println("0~9까지의 난수생성 :"+ random1);

        int random2 = (int)(Math.random() * 10) + 1;
        System.out.println("1~10까지의 난수생성 :" +random2);

//        10~15사이의 난수발생

        int random3 = (int)(Math.random() * 6) + 10;   //여섯개의 숫자이므로 *6함
        System.out.println("10~15까지의 난수생성 :" +random3);

//        -128~127사이의 난수발생
        int random4 = (byte)(Math.random()* 256) -128;  //256개의 숫자, 최소값이 -128
        System.out.println("-128~127까지의 난수생성 :" +random4);



    }
}
