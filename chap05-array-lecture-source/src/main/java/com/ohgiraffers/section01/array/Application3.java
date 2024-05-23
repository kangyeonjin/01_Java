package com.ohgiraffers.section01.array;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 배열에 초기화 되는 자료형 별 기본값
        * 정수 : 0
        * 실수 :0.0
        * 논리 : false
        * 문자 : \n0000
        * 참조 : null
        * */

        int[] iarr = new int[5];
//        double[] do = new double[5];
//        boolean[] boo = new boolean[5];
//        char[] ch = new char[5];
//        String str = new String[5];

        System.out.println(iarr[0]);
        System.out.println(iarr[1]);
        System.out.println(iarr[2]);
        System.out.println(iarr[3]);
        System.out.println(iarr[4]);


        //배열이 저장되는 heap영역은 값이 없는 빈공간이 존재할수없다
        //기본값으로 초기화가 된다
        for(int i = 0; i < 5; i++){

            System.out.println("iarr["+i+"]의값"+iarr[i]);

        }

        /*
        * 자바에서 지정한 기본값이외의 값으로 초기화를 하고싶은 경우에 블럭을 이용한다
        * 블럭을 사용하는 경우, new사용하지 않아도 되고 값의 갯수만큼 자동으로 크기가 설정된다
        * */

        int[] iarr2 = {1,2,3,4,5};
        int[] iarr3 = new int[]{1,2,3,4,5,6};

        System.out.println(iarr2.length);
        System.out.println(iarr3.length);

        for(int i = 0; i < iarr2.length; i++){

            System.out.println("=========iarr의 각 인덱스값==========");
            System.out.println("iarr["+i+"]의값"+iarr2[i]);
        }

//        String[] sarr = {"apple","banana","grape","orange"}
//        System.out.println("=========sarr의 각 인덱스값==========");
//        for(int = 0; i<sarr.length; i++){
//            System.out.println("sarr["+i+"]의값"+sarr[i]);
//        }


    }
}
