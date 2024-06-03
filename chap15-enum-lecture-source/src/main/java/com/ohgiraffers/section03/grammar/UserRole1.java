package com.ohgiraffers.section03.grammar;

public enum UserRole1 {
    //enum은 상수하나하나가 인스턴스가 될수있다
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIIN;


    /*
    * 기본생성자를 가질수있다
    * default 와 private접근 제한 사용가능하지만,
    * 외부에서 호출은 불가능(묵시적으로 private
    * enum타입음 고정된 상수들의 집합으로
    * 런타임이 아닌 컴파일시에 모든 값이 결정되어있어야하함
    * 생성자를 가질시, 열거형 상수선언 마지막에 세미콜론을 붙여야한다
    * */

    UserRole1(){}

    public String gerNameToLowerCase(){
        return this.name().toLowerCase();
    }

}
