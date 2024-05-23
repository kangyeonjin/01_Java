package com.ohgiraffers.section02.looping;

public class test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void test1(){
        for (int i=1; i <10; i++){
            for(int j=1; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void test2(){
        for(int i =0; i <=5; i++){
            for(int j=1; j<4; j++)
            System.out.print("*");
        }
        System.out.println();
    }
}