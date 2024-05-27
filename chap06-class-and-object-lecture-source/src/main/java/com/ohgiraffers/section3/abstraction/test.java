package com.ohgiraffers.section3.abstraction;

public class test {
//    private String dog;
//    private String kinds;
//
//    public void setKinds(String kinds){
//        this.kinds = kinds;
//    }
//
//    public void setDog(String setDogs){
//        this.dog = setDogs;
//    }
//
//    public String getInfo(){
//        return "강아지의 종류는 "+this.kinds+"이고,이름은"+this.dog+"입니다";
//    }

//    Tesla Model S를 만들고
//    2022년식이며
//    전기차인
//    자동차 객체를 생성하여 값을 출력

//    private String Model;
//    private String kinds;
//    private long year;
//
//    public void setKinds(String kinds){
//        this.kinds = kinds;
//    }
//    public void setModel(String Model){
//        this.Model = Model;
//
//    }
//    public void setYear(long year){
//        this.year = year;
//    }
//
//    public String print(){
//        return "Tesla는 "+this.year+"년식 모델인 " +this.Model +this.kinds+"를 출시했습니다.";
//    }

//    나이가 30살이고
//    이름이 James인 남자가 있습니다.
//    이 남자는 결혼을 했고
//    자식이 셋 있습니다.
//    이를 표현하는 클래스를 만들고,
//    객체를 생성하여 값을 출력하세요.

    private String name;
    private int age;
    private String gender;
    private int count;

    public void setAge(int age) {
        if(age >0){
            this.age = age;
        }else {
            this.age = Math.abs(age);
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String print() {
        return this.name + "는" + this.age + "살" + this.gender + "이며" + this.count + "명의 자녀가 있습니다";
    }


//    Dell 브랜드의
//    XPS 13 모델이고,
//    16GB RAM과
//    512GB SSD를 가진
//    노트북을 표현하는 클래스를

//    private String brand;
//    private String model;
//    private




}