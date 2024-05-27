package com.ohgiraffers.subproject;

import java.util.Arrays;
import java.util.Scanner;

public class Kiosk {

    private Scanner sc = new Scanner(System.in);
    private Barista barista = new Barista();

    //메뉴
    public void menu(){

        String menu = """
                ==============
                커피주문 프로그램
                ==============
                1. 아메리카노
                2. 라떼
                0. 종료
                
                ===============
                """;

        //메뉴 보여주고 주분받고 확인까지 받음
            while(true){
                System.out.println(menu);
                String choice = sc.next();
                Order order = null;

                switch(choice){
                    case"1" :
                        order = createorder("아메리카노");
                        break;
                    case "2" :
                        order = createorder("라떼");
                        break;
                    case "0" : return; //호출한곳으로 돌아감
                    default:
                        System.out.println("잘못입력함");
                }

                if(order != null){
                    sendCoffeeRequest(order);

                }else{
                    System.out.println("주문을 취소하였습니다");
                }

            }
    }

    private void sendCoffeeRequest(Order order) {
//        객체 배열

        Coffee[] coffees = barista.makeCoffee(order);

        //arrays : 배열에 관련된 기능을 미리 만들어 놓은 패키지
        //tostring : 객체안에 있는 값을 꺼내서 보여줌
        System.out.println(">주문하신 커피"+ Arrays.toString(coffees));
            }

    private Order createorder(String menuName){

        //옵션
        String option = inputOption();
        //수량
        int count = inputCount();
        //주문생성
        Order order = new Order(menuName, option, count);
        //주문확인
        boolean confirmed = confirmedOrder(order);
        return confirmed ? order : null;

    }


    private boolean confirmedOrder(Order order){
        System.out.println("""
                >주문 내역을 확인하세요
                --------------------
                메뉴명 : %s
                옵션 : %s
                수량 : %d
                -------------------
                >주문처리 1. 승인 2. 취소
                입력 :
                """.formatted(order.getMenuName(),order.getOption(),order.getCount()));
        return sc.next().equals("1");  //true or false
    }


    private String inputOption() {
        System.out.println(">옵션을 선택하세요. 1. hot 2.ice");

//        String input = sc.nextInt();
//        String result = "";

        return sc.next().equals("1") ? "HOT" : "ICE";  //삼항연산자

    }

    private int inputCount(){
        System.out.println("수량을 입력 : ");
        return sc.nextInt();

    }


}
