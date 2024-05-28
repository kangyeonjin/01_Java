package com.ohgiraffers.section01.polymorphism;

public class Application2 {
    //다형성을 적용해 객체 배열을 만들어 인스턴스를 연속처리
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();
        //Animal클래스가 가지는 메소드를 오버라이딩한 메소드 호출시 동적바이딩을 이용가능
        for(int i=0; i <animals.length;i++){
            animals[i].cry();
        }

        //각 클래스별 고유한 메소드를 동작
        //down-casting을 명시적으로 해줘야함
        //ClassCast instanceof연산자를 이용해서 이용해야한다
        System.out.println("===============" +
                "");
        for(int i=0; i<animals.length;i++){
            if(animals[i] instanceof Rabbit){
                ((Rabbit)animals[i]).jump();
            }else if(animals[i] instanceof Tiger){
                ((Tiger)animals[i]).bite();
            }else{
                System.out.println("호랑이나 토끼가 아닙니다");
            }
        }

    }

}
