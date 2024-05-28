package com.ohgiraffers.section04.use3;

public class HellDice implements Dice{
//- Dice 인터페이스를 구현한 구현체
//- getNumber() 시 무조건 4를 return 해준다.

    @Override
    public int getNumber() {
        return 4;
    }
}
