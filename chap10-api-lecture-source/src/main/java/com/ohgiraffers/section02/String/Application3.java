package com.ohgiraffers.section02.String;

public class Application3 {
    public static void main(String[] args) {
        //문자열 분리

        /*
        * split():정규표현식을 이용하여 문자열을 분리함
        *         비정규화된 문자열을 분리할때 좋다(공백문자열값포함)
        *         정규표현식을 이용하기떄문에 속도가 느리다
        * StringTokenizer : 문자열의 모든 문자를 구분자로 하여 문자열을 분리하다나
        *                   정형화된 문자열 패텅을 분리할떄 사용하기좋다(공백문자무시)
        *                   split보다 속도면에서 더 빠르다
        *                   구분자를 생략하는 경우 구분자이다
        *
        * */

        String emp1 = "100,홍길동,서울,영업부";  //모든값존재
        String emp2 = "200,유관순,총무부";  //주소값없음
        String emp3 = "300,이순신,경기도";  //부서없음

        String[] empArr1 = emp1.split(",");
        String[] empArr2 = emp2.split(",");
        String[] empArr3 = emp3.split(",");

//        System.out.println(empArr2.length);

        System.out.println("=======empArr1======="); //정상 출력
        for(int i =0;i < empArr1.length;i++) {
            System.out.println(i + empArr1[i]);
        }

        System.out.println("=======empArr2=======");//중간값이 빈 문자열
        for(int i =0;i < empArr2.length;i++){
            System.out.println(i+empArr2[i]);
        }

        System.out.println("=======empArr3======="); //마지막값이 출력이 안됨
        for(int i =0; i < empArr3.length; i++){
            System.out.println(i+empArr3[i]);
        }

        System.out.println("=======empArr4======="); //마지막값이 출력이 안됨
        String[] empArr4 = emp3.split(",",-1);
        for(int i =0; i < empArr4.length; i++){
            System.out.println(i+empArr4[i]);
        }



    }
}
