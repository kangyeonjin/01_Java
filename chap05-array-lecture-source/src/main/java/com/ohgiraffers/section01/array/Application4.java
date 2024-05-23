package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        /*
        * 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램
        *
        * */

        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);

        int sum =0;
        double avg =0;

        //점수를 입력받는다
        for(int i=0; i < scores.length; i++){

            System.out.println((i+1)+"번째 학생의 점수르 입력 :");
            scores[i] = sc.nextInt();

        }



        //입력받은 점수를 scores배열에 저장
        //배열에 값을 합계 >int
//        sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
        for(int i = 0; i < scores.length; i++){
                    sum = sum +scores[i];
                }
        //배열의 값들을 평균 >실수
        avg = (double) sum/ scores.length;

        System.out.println(sum);
        System.out.println(avg);


//        for (int i = 0; i < 5; i++){
//            System.out.println((i+1)+"의 점수를 입력하세요");
//            scores[i] = sc.nextInt();
//            sum += scores[i];
//        }
//
//        // 합계와 평균 계산하기
//        double average = (double) sum / scores.length;
//
//        // 결과 출력하기
//        System.out.println("합계: " + sum);
//        System.out.println("평균: " + average);

//        sc.close();
    }



    }

