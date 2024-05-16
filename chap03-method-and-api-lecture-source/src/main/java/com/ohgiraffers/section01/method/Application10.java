package com.ohgiraffers.section01.method;

public class Application10 {
    public static void main(String[] args) {
        //더하기
        int num1 = 16;
        int num2 = 5;

        Calculator calc = new Calculator();
        int plusResult = calc.plusTwoNumber(num1, num2);
        System.out.println(plusResult);

        //빼기
        Calculator calc1 = new Calculator();
        int plusResult1 = calc1.minusTwoNumber(num1, num2);
        System.out.println(plusResult1);


        //곱하기
        Calculator calc2 = new Calculator();
        int plusResult2 = calc2.multipleTwoNumber(num1, num2);
        System.out.println(plusResult2);

        //나누기
        Calculator calc3 = new Calculator();
        int plusResult3 = calc3.divideTwoNumber(num1, num2);
        System.out.println(plusResult3);

        //나머지
        Calculator calc4 = new Calculator();
        int plusResult4 = calc4.remainTwoNumber(num1, num2);
        System.out.println(plusResult4);

    }
}
