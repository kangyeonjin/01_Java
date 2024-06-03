package com.ohgiraffers.section01.intenum;

public class Application {

    public static void main(String[] args) {

        /*
         * Enum(열거타임)
         * 제한된 값 목록이 필요한경우 사용한다
         * 이넘이란 관련있는 상수의 집합의 클래스를 의미한다
         * 각각의 열거상수는 열거 객체로 생성된다
         * 기존의 상수를 정의하는 방법을 효과적으로 대체한다*
         *
         * 기존정수 열거 패턴의 단점
         * 1. 정수형 상수는 의미가 있는 문자열로 출력하기 어렵다
         * 2. 정수열거 그룹에 속한 상수들을 조회 할수없다(갯수 확인도 불가능)
         * 3. 타입의 안전을 보장 할 수없다
         *
         * */

        //1. 정수값만 저장하고 있는 필드일 뿐
        int subject1 = Subject.JAVA;
        int subject2 = Subject.HTML;

        if(subject1 ==subject2){
            System.out.println("두 과목은 같은 과목입니다.");
        }

        //2.문자열로 출력하기 까다롭다
        int num =0;
        String subjectText ="";

        //스위치문을 int를 매개변수로 입력받고
        //return 없고, 과목명을 출력하는 메소드
        //public static, printSubject(){}

        switch (num){
            case Subject.JAVA: subjectText = "JAVA"; break;
            case Subject.JDBC: subjectText = "JDBC"; break;
            case Subject.ORACLE: subjectText = "ORACLE"; break;

        }

        System.out.println(subjectText);

        //3. 타입 안전을 보장 할 수없다.
//        printSubject(5);


    }

    public void printSubject(int subjectNumber){

        String subject ="";

        switch (subjectNumber){
            case Subject.JAVA: subject = "JAVA"; break;
            case Subject.JDBC: subject = "JDBC"; break;
            case Subject.ORACLE: subject = "ORACLE"; break;
        }

        System.out.println(subject);
    }



}
