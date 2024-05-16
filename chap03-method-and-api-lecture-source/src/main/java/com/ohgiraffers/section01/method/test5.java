package com.ohgiraffers.section01.method;

public class test5 {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        test5 app = new test5();
        System.out.println("두수를 더한 결과 : " + app.PlusTwoNumber(a,b));

    }
    public int PlusTwoNumber(int a, int b){
        return a + b;
    }

}
