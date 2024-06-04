package com.ohgiraffers.lamda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Application1 {
    public static void main(String[] args) {

        Application1 app = new Application1();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();

    }

//    <pre>
//     * @실습문제1
//     * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
//     * </pre>

    private void test1() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String formattedNow = now.format(formatter);
        System.out.println(formattedNow);

    }

//    <pre>
//     * @실습문제2
//     * 로또를 생성하는 람다식을 작성하세요.
//            * - 리턴타입 Set<Integer>
//     * </pre>

    private void test2() {





    }

//     <pre>
//     * @실습문제3
//     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
//     * 현재 1달러는 1350원이다.
//     * </pre>

    private void test3() {




    }

    private void test4() {




    }

    private void test5() {




    }


}
