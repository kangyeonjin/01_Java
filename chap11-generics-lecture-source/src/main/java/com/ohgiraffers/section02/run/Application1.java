package com.ohgiraffers.section02.run;

import com.ohgiraffers.section02.*;

public class Application1 {
    //extend :특정타입만 사용하도록 제네릭 범위를 제한할수있다
    public static void main(String[] args) {

        /*
        * extend 키워드를 이용하여 특정 타입만 사용하도록 범위지정
        * >지정한 특정타입과 함께, 특정타입의 자식타입들도 대입가능
        * */

        //Animal타입은 Rabbit의 후손이아니기 떄문에,제네릭클래스인스턴스 생성이 불가

//        RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();


        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry(); //animal의 타입? >Rabbit

//        farm5.setAnimal(new Rabbit());
//        farm5.getAnimal().cry(); //animal의 타입? >Bunny
//
//        farm6.setAnimal(new Rabbit());
//        farm6.getAnimal().cry();  //animal의 타입? >DrunkenBunny


    }

}
