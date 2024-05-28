package com.ohgiraffers.section04.use3;

public class SuperDice implements Dice{

    private  int max = 10;
    private  int min = 1;

//- min 과 max 를 필드로 가지고 있다.
// - getNumber() 시 min ~ max까지의 랜덤한 수를 출력해준다.
    public SuperDice(){
        this.min = 1;
        this.max = 10;
    }


    @Override
    public int getNumber() {

        return (int)(Math.random()*(max-min+1)) + min;

    }

}
