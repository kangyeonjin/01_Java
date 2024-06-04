package com.ohgiraffers.section03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 메소드 참조
        * 함수형 인터페이스를 람다식으로 쓰는게 아닌,
        * 일반 메소드를 참조시켜 선언하는 방법
        * 일반 메소드를 참조하기 위해서는 함수형 인터페이스의 매개변수 타입/갯수/반환형과
        * 메소드의 매개변수 타입/갯수/반환형이 같아야한다
        * [메소드 참조표현식]
        * 클래스이름 : : 메소드이름
        * 참조변수이름 ::메소드이름
        * */

        //BiFuntion<T,U>:R:T,U를 R로 매핑
        //Strind, String문자열 두개를 받아서 equals를 비교해서 결과를 boolean형태로 return

        BiFunction<String,String,Boolean> biFunction = String::equals;
        System.out.println(biFunction.apply("java","oracle"));

//        String str = "java";
//        System.out.println(str.equals("java"));

        Consumer<Object> objectsConsumer = System.out::println;
        objectsConsumer.accept("사용");

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("css");

        forEach(subjects, /*메소드참조*/ System.out ::println);


    }
    //extends super
    //extends ? ->
    //상한제한 하한제한
    //extends 상한제한 -> 오브젝트 상위 타입은 받을 수없다(제한)
    //super하한제한 -> Object자식타입은 받을 수없다(제한)
    //반복할 객체 리스트를 받고, consumer를 이용해서 뭔가 출력할거다
    private static void forEach(List<? extends Object> list,Consumer<Object>consumer) {
        for(Object obj : list){
            consumer.accept(obj);
        }
    }

}
