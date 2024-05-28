package com.ohgiraffers.section04.use3;
//다이서가 주사위를 던져 랜덤한 숫자를 출력하게 하고싶다.
public class Application {
    public static void main(String[] args) {

//        Dice dice = new HellDice();
        Dice dice = new SuperDice();

        Dicer dicer = new Dicer();

        dicer.throwDice(dice);

    }
}