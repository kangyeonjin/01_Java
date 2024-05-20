package com.ohgiraffers.section01.practice;

import java.util.Scanner;

public class Practice2 {
public void prac2(){
        Scanner sc = new Scanner(System.in);

//       두 과목의 평균이 60점 이상이고,
//       두 과목 모두다 40점 이상이여야 합격이 가능하다.
//       평균이 60점 미만일 경우 “시험 불합격”
//       60점은 넘지만 한과목이 40점 미만일 경우 “한과목 과락으로 인한 불합격”
//       두 조건다 통과할경우 “시험 합격”


        System.out.println("영어점수를 입력하세요");
        int eng = sc.nextInt();

        if (eng >= 40) {
            System.out.println("합격");
        } else if(eng < 40){
                System.out.println("불합격");
            }

        System.out.println("수학점수를 입력하세요");
        int math = sc.nextInt();

        if (math >= 40) {
            System.out.println("합격");
        }else if(math < 40){
                System.out.println("불합격");
            }

        if (eng + math/2 >= 60) {
            System.out.println("시험 합격");
        }else if(eng + math/2 < 60){
            System.out.println("시험 불합격");
        }else if(eng < 40 || math < 40){
            System.out.println("한과목 과락으로인한 불합격");
        }

    }
}
