package com.ohgiraffers.subproject;

public class Barista {

    private int cofeStock = 5000;

    public Coffee[] makeCoffee(Order order) {

//        재고 자감처리 - 커피 한잔에 20g사용
//        커피생성

        Coffee[] coffees = new Coffee[order.getCount()];

        for (int i = 0; i < coffees.length; i++) {
            coffees[i] = new Coffee(order.getMenuName(), order.getOption());
        }
        return coffees;

    }
}

