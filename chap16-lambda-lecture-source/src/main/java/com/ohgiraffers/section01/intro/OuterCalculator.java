package com.ohgiraffers.section01.intro;

public interface OuterCalculator {

    //내부 인터페이스
    @FunctionalInterface
    public interface Sum{
        int sumTwoNumbers(int a, int b);
    }
    @FunctionalInterface
    public  interface Minus{
        int minusTwoNumbers(int a, int b);
    }
    @FunctionalInterface
    public interface Multiply{
        int multiplyTwoNumbers(int a, int b);
    }
    @FunctionalInterface
    public interface Divison{
        int divisionTwoNumbers(int a, int b);
    }

}
