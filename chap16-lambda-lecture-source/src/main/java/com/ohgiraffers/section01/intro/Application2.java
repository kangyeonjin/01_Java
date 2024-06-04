package com.ohgiraffers.section01.intro;

public class Application2 {
    public static void main(String[] args) {

        OuterCalculator.Sum sum = (x,y) -> x + y;

        //minus
        OuterCalculator.Minus minus = (x,y) -> x - y;

        //multiple
        OuterCalculator.Multiply multiply = (x,y) -> x * y;

        //division
        OuterCalculator.Divison div = (x,y) -> x / y;

        System.out.println(sum.sumTwoNumbers(20,10));
        System.out.println(minus.minusTwoNumbers(50,30));
        System.out.println(multiply.multiplyTwoNumbers(2,2));
        System.out.println(div.divisionTwoNumbers(60,30));


    }

}
