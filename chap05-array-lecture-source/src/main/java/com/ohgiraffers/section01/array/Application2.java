package com.ohgiraffers.section01.array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /*
        * 배열사용방법
        * 1. 배열의 선언
        * 2. 배열의 할당
        * 3. 배열의 인덱스 공간에 값대입
        *
        * */

        /*
        * 배열의 선언
        * 자료형[] 변수명;
        * 자료형 변수명[];
        * */

        //stack에 배열의 주소를 보관할수있는 공간을 만드는것

        int[] iarr;
        char carr[];

        /*선언한 레퍼런스 변수에 배열을 할당하여 대입할수있다
        * new연산자는 heap영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자
        * 발생한 주소를 레퍼런스 변수(참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에
        * 참조자료형이라고함
        * */
        //배열의 할당을 할시에는 반드시 배열의 크기를지정해줘야한다
//        iarr = new int[]; 크기를 지정해주지 않아서 에러가 발생

        iarr = new int[5];
        carr = new char[5]; //타입도 맞춰줘야함 carr = new int[5];는 안됨
        //선언과 할당을 동시에 할수있다
        int[] iarr2 = new int[5];
        char carr2[] = new char[10];
        long[] larr = new long[5];

        System.out.println("iarr2 : "+iarr2);
        System.out.println("chrr2 : "+carr2);
        System.out.println("lon : "+larr);

        /*
        * hashcode(): 일반적으로 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환
        * >동일객체인지 비교할때 사용할 목적으로 많이 쓰이며, 동등객체를 동일객체 취급하기 위한 용도로 overring해서 사용함
        *
        * */

        System.out.println("iarr2의 hashcode :"+iarr2.hashCode());
        System.out.println("char2의 hashcode : "+carr2.hashCode());

        //배열의 길이를 알수있는 기능을 필드로 제공하고 있다
        System.out.println("iarr2의 길이 +"+iarr2.length);
        System.out.println("carr2의 길이 +"+carr2.length);

        Scanner sc = new Scanner(System.in);

        System.out.println("새로할당할 배열의 길이를 입력하세요(scanner) :");
        int size = sc.nextInt();

        double[] darr =  new double[size];
        System.out.println("darr의 hashcode :"+darr.hashCode());
        System.out.println("darr의 길이 :"+ darr.length);

        //한번지정한 배열의 크기는 변경하지 못한다
        darr = new double[30];

        //배열의 사이즈를 변경한것이 아니고, 새로운 배열을 생성해서 그 주소값을 레퍼런스 변수에 덮어쓴것이다
        System.out.println("변경된 darr의 hashcode :"+darr.hashCode());
        System.out.println("변경된 darr의 길이 :"+darr.length);

        //한번 찾아갈수 있는 주소값을 잃어버린 배열은 다시 참조가 불가능함
        darr = null;
        System.out.println("삭제후 darr의 길이 :"+darr.length);

    }
}
