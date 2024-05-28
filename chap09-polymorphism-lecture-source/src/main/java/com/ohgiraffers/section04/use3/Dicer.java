package com.ohgiraffers.section04.use3;

public class Dicer {

//- 해당 Dice의 getnumber()를 통해 정수를 반환받고
//- dice Number를 출력해준다.

    public void throwDice(Dice dice) {

        int diceNumber = dice.getNumber();
        System.out.println("하하 내가 나온 숫자는 [" + diceNumber + "] 다 !!!");

    }

}

