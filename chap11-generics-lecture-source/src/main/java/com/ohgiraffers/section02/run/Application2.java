package com.ohgiraffers.section02.run;

import com.ohgiraffers.section02.*;

import java.sql.SQLOutput;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 와읻드 카드
        * 제네릭 클래스 타입의 객체를 메소드의 매개변수로 받을때
        * 그 객체의 타입 변수를 제한할수있다
        *
        * <?> : 제한없음
        * <?extends[type]> :와일드카드의 상한제한
        *                   Type고ㅏ type의 후손을 이용해 생성한 인스턴스만 인자로 사용가능
        * <? super[type]> : 와일드카드의 하한제한
        *                   Type과 Type의 부모를 이용해 생성한 인스턴스만 인자로 사용가능
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();
        //매개변수의 타입제한이 없는 경우
        //토끼농장 생성자체가 불가능하면 매개변수로 사용불가능
//        whildCardFarm.anyType(new RabbitFarm<>(new Mammal()));

        System.out.println("===================");
        //RabbitFarm생성만 가능하면<?>에서는 모두 매개변수로 사용가능하다
        wildCardFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

        System.out.println("========<extend>=========");
        //extends Bunny이기 때문에 Bunny이거나 Bunny의 후손 토끼 농장만 매개변수사용가능
        //상위타입으로 만든 토끼농장은 매개변수로 사용불가능
//        wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<Bunny>(new DrunkenBunny()));

        System.out.println("=================<super>===============");
        //extends Bunny의 <? super>이기때문에 Bunny이거나 Bunny의 후손토끼
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit()));
        wildCardFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
//        wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

    }

}
