package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // "12345"  //1이 0번째임
        System.out.println("아무 문자나 입력하세요");
        String str = sc.nextLine();
        char ch = str.charAt(0);
        System.out.println(ch);
        System.out.println("입력하신문자는" + ch +"입니다");


    }

}
