package com.ohgiraffers.section3.abstraction;

public class CarRacer {
    /*
     * 1.카레이서 클래스
     *  -속성 : 자동차
     *  -행위 : 시동을 걸어라,d엑셀을 밟아, 브레이크 밟아, 시동꺼
     * */
    private final Car car = new Car();
    public void startUp(){
        car.startUp();
    }
    public void stepAccelator(){
        car.go();
    }
    public void stepBreak(){
        car.stop();
    }
    public  void turnOff(){
        car.turnOff();

    }


}
