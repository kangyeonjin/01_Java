package com.ohgiraffers.section2.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {

        monster monster = new monster();
        monster.name = "두치";
        monster.hp = 200;

        System.out.println(monster.name);
        System.out.println(monster.hp);

        monster monster2 = new monster();
        monster2.name = "뿌꾸";
        monster2.hp = -200;

        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster2.name = " + monster2.hp);

        //
//        monster3.hp =-200;

        System.out.println(monster2.name);
        System.out.println(monster2.hp);

        monster monster3= new monster();
        monster3.name = "드라쿨라";
        monster3.setHp(200);

        System.out.println(monster3.name);
        System.out.println(monster3.hp);

        monster monster4= new monster();
        monster4.name = "프랑켄슈타인";
        monster4.setHp(-1000);

        System.out.println(monster4.name);
        System.out.println(monster4.hp);



    }
}
