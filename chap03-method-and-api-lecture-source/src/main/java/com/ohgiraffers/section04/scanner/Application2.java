package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /*
        * nextLine(): 공백을 포함한 한줄 입력을 위한 개행문자 전까지 문자열로 반환한다
        * next(): 공백문자나 개행문자 전 까지 읽어서 문자열로 반환한다.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("인사말을 입력해주세요"); //안녕하세요 반갑습니다
        String greeting = sc.nextLine(); //안녕하세요 반갑습니다 전부 저장
        System.out.println(greeting);

        sc.nextLine(); //앞에서 출력했던 문자 남아있으므로 실행해주면 리셋됨
        String greeting2 = sc.next(); //안녕하세요 > 이거만저장
        System.out.println(greeting2);


    }

}
