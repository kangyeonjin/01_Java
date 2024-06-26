package com.ohgiraffers.section02.demensinal;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 2차원배열(가변배열)
        *가변배열의 경우 각 인덱스별 배열을 따로 할당해야한다
        * 선언과 동시에 모든 배열을 할당할수 없으며, 할당할 배열의 개수만 지정하고
        * 각 인덱스에 서로 다른 길의 배열을 따로 할당해야한다
        *
        * 자료형[][] 변수명 = new 자료형[할당할 배열의 갯수][];
        * 변수명[배열 인덱스]= new 자료형[배열의 길이]
        * */

        //선언
        int[][] iarr= new int[3][];
        iarr[0] = new int[3];
//        iarr[1] = new char[3];//자료형이 다른 배열은 하나로 묶어 관리가 불가능
        iarr[1] = new int[2];

        //일차원배열
        int[] arr = new int[5];
        iarr[2] = arr;  //미리 할당해동 배열을 이용해서 활용가능하다

        iarr[0][0] = 1;
        iarr[0][1] = 2;
        iarr[0][2] = 3;
//        iarr[0][3] = 4;  //존재하지 않는 인덱스에 접근하는경우 ArrayIndexOutOfBoundsException발생
        iarr[1][0] = 4;
        iarr[1][1] = 5;

        iarr[2][0] = 6;
        iarr[2][1] = 7;
        iarr[2][2] = 8;
        iarr[2][3] = 9;
        iarr[2][4] = 10;

        int value = 0;

        //모든 배열에 순차적으로 접근해서 1씩 증가하는 value를 할당해줌
        for(int i=0; i<iarr.length; i++){
            for(int j=0; j<iarr[i].length; j++){
                iarr[i][j] = ++value;
            }
        }
        for(int i=0; i<iarr.length; i++){
            for(int j=0; j<iarr[i].length;j++){
                System.out.println(iarr[i][j]+"");
            }
            System.out.println();
        }
    }

}
