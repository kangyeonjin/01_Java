package com.ohgiraffers.api.object.car;

public class App {
    public static void main(String[] args) {
//        차이름과 차색깔이 같다면 같은 객체로 처리합니다.
            Car myCar = new Car("Sonata", "검정", 2000);
            Car yourCar = new Car("Sonata", "검정", 2500);

            System.out.println(myCar.equals(yourCar)); // true
            System.out.println(myCar.hashCode() == yourCar.hashCode()); // true

            Car hisCar = new Car("Sonata", "화이트", 2000);
            System.out.println(myCar.equals(hisCar)); // false
            System.out.println(myCar.hashCode() == hisCar.hashCode()); // false




    }
}
