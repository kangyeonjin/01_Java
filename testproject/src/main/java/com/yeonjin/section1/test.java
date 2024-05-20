package com.yeonjin.section1;

import java.util.Scanner;

public class test {
    public void testSimpleSwitchStatement(){
        Scanner sc = new Scanner(System.in);

        System.out.println("금도끼 은도끼");
        System.out.println("도끼를 선택하세요");
        int cho = sc.nextLine();

        switch(cho){
            case "금도끼" :
                System.out.println("아무것도 안줌");

                break;

            case "은도끼" :
                System.out.println("집으로가");
                break;

            case "쇠도끼" :
                System.out.println("집으로가");
                break;

        }

        System.out.println(+"");

    }

}
