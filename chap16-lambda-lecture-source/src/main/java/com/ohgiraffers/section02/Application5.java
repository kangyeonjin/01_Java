package com.ohgiraffers.section02;

import java.util.Objects;
import java.util.function.Predicate;

public class Application5 {
    public static void main(String[] args) {
        /*Predicate : 매개변수와 boolean리턴값이 있는 textXXX()가지고있다
         *           이 메소드들은 매개변수 값을 이용하여 true혹은 false값을 리턴하는 역할
         * */

        /*
         * Predicate<T>#test(Tt) :boolean:T를 조사하여 boolean을 리턴한다
         * */

        Predicate<Object> predicate = value -> value instanceof String;
        System.out.println(predicate.test("123"));
        System.out.println(predicate.test(123));


    }
}
