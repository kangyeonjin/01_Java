package com.ohgiraffers.section01.practice;

import java.util.Scanner;

public class Practice1 {

    public void prac1() {

        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int num = sc.nextInt();

        if (num >= 9) {
            System.out.println("놀이기구를 탑승하실수 있습니다.");
        } else if(num < 9){
            System.out.println("나이가 9세미만이라 탑승할수없습니다");
        }

        System.out.println("키를 입력하세요");
        int num1 = sc.nextInt();

        if (num1 >= 110) {
            System.out.println("놀이기구를 탑승하실수 있습니다.");
        } else if(num1 < 110){
            System.out.println("키가 110미만이라 탑승 할수없습니다.");
        }

        System.out.println("나이가" + num + "미만이고" + "키가" + num1 + "이라 탑승하실수없습니다");
    }
}

