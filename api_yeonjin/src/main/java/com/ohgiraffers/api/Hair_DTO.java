package com.ohgiraffers.api;

public class Hair_DTO {
    //  dto 클래스를 설계하고,
    //  객체배열로 변환후에 출력

        private int number;         // 회원번호
        private String name;        // 회원명
        private int age;            // 나이
        private char gender;        // 성별
        private double height;      // 키
        private double weight;      // 몸무게
        private boolean isActivated;// 회원탈퇴여부(활성화여부)

    public Hair_DTO() {
        this.number = number;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.isActivated = isActivated;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }

    @Override
    public String toString() {
        return "Hair_DTO{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", isActivated=" + isActivated +
                '}';
    }
}



