package com.ohgiraffers.section3.abstraction;

public class Car {

    private boolean isOn;  //기본 false
    private int speed;  //기본 0

    //이미 걸려있는 경우 다시 시동을 걸수없다
    public void startUp(){

        if(isOn){
            System.out.println("이미 시동이 걸려있습니다");
        }else{
            this.isOn = true;
            System.out.println("시동을 걸었습니다 출발할준비가 되었습니다");
        }

    }

    public void go(){
        if(isOn){
            System.out.println("차가 앞으로 움직입니다");
            this.speed += 10;
            System.out.println("현재차의 시속은"+this.speed+"km입니다");
//            for(int i =; i <)

        }else{
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요");
        }
       //시동이 걸려있고, 달리는 상태일떄만 멈출수있다

    }
    public void stop(){
        if(isOn){

            if(this.speed >0){
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다 차를 멈춥니다");
            }else{
                System.out.println("차느 이미 멈춰있는 상태입니다");

            }
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요");
        }
    }

    public void turnOff (){
        if(isOn){
            if(speed>0){
                System.out.println("달리는 상태에서는 시동을 끌수없습니다,차를 멈추세요");
            }else {
                this.isOn = false;
                System.out.println("시동을 끕니다 다시 운행하시려면 시동을 켜주세요");
            }
        }else{
            System.out.println("이미 시동이 꺼져있는 상태입니다. 시동상태를 확인해주세요");
        }

    }
}
