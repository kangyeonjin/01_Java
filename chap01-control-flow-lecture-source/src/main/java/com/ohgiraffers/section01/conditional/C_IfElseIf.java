package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_IfElseIf {
    /*if-else-if문
     * if([조건식]){
     * //조건식1이 true일때 실행할 명령문
     * }else if ([조건식2){
     * //조건식1이 false이고, 조건식2가 true일떄 실행할 명령문
     * }else{
     * //조건식1이 false이고 조건식2가 false일때 실행할 명령문
     * }
     *
     * if -else-if문은 조건식 1의 결과 값이 참이면 if{}안에 있는 코드를 실행하고,
     * 조건식 1이 false이면 조건식 2를 확인하여 참true이면 else if{}안에 있는 코드를 실해한다.
     * 조건식 1과 조건식 2가 결과값이 모두 거짓이면 else{}안에 있는 코드를 실행한다
     * */

    /*
     * 금도끼 은도끼 동화에서 산신령이 어떤 도끼가 나무꾼의 도끼인지 물어보는 시나리오
     * */

    public void testSimpleIfElseIfStatement() {
        System.out.println("산속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨림");
        System.out.println("연못에서 산신령나와서 금,은,쇠도끼 중에 골라라");
        System.out.println("어느게 니꺼냐 ? 1. 금, 2. 은, 3.쇠");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt(); //1,2,3중에 받아온다

        if (answer == 1) {
            System.out.println("아무것도 안줄꺼다");
        } else if (answer == 2) {
            System.out.println("잘가라");
        } else if (answer == 3) {
            System.out.println("정직하네 다주께");

        } else {
            System.out.println("잘못입력했어");
        }
        System.out.println("산신령 안녕");

    }


//    public void testNestedIfElseIfStatement() {
//
//        /* 필기.
//         *  ohgiraffers 대학의 김xx교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
//         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
//         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
//         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
//         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
//         * */
//
//        System.out.println("김00교수님은 수기로 성적계산해서 등급매김");
//        System.out.println("90 >= A, 80 >= B, 70 >= C, 60 >= D, 60 < F");
//        System.out.println("등급의 중간점수인(95,85..)경우 +를 붙임");
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("점수를 입력하세요 : ");
//        int num = sc.nextInt();
//
//        if (90 >= num) {
//            System.out.println('A');
//            else if (80 >= num) {
//                System.out.println('B');
//            } else if (70 >= num) {
//                System.out.println('C');
//            } else if(60 >= num){
//                System.out.println('D');
//            }
//            else{
//                System.out.println('F');
//            }
//
//
//        String name = "기본이름";
//        int point = 100;
//        String grade = "F";
//
//        System.out.println(name + "학생의 점수는" + point + "이고, 등급은" + grade + "입니다.");
//        }


    public void testNestedIfElseIfStatement2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.println("학생의 점수를 입력하세요 : ");
        int point = sc.nextInt();
        String grade;


        if (point >= 90) {
            grade = "A";

            if (point >= 95) {
                grade += "+";
            }

        } else if (point >= 80) {
            grade = "B";

            if (point >= 85) {
                grade += "+";
            }

        } else if (point >= 70) {
            grade = "C";

            if (point >= 75) {
                grade += "+";
            }

        } else if (point >= 60) {
            grade = "D";

            if (point >= 65) {
                grade += "+";
            }

        } else {
            grade = "F";
        }


        System.out.println(name + "학생의 점수는" + point + "이고, 등급은" + grade + "입니다.");
    }
}


