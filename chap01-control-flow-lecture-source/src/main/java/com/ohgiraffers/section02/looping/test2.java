package com.ohgiraffers.section02.looping;

public class test2 {
    public void a(){

        //1부터 100까지의 합구하기

        int sum = 0;
        for(int i =1; i <= 3; i++){
            sum += i;
        }

        System.out.println("1부터 3까지의합 : "+ sum);
    }

    public void b(){
        // 별찍기
        for(int i = 0; i <4; i++){
            for(int j =1; j < 4-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j< 2*i+1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    public void c(){
        //구구단 출력
        for(int i =2; i <=9; i++){
            System.out.println(i+"단 : ");
            for(int j =1; j<=9; j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }

    }

}
