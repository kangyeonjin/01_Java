package com.ohgiraffers.section02;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.*;

public class Application1 {
    public static void main(String[] args) {

        /*표준 함수적 인터페이스
        * JDK 8자주 사용되는 함수적 인터페이스를 표준 API로 제공하고있다
        * Consumer : 리턴앖이 없는 accept()메소드를 가지고있다(매개변수 소비자 역할)
        * Supplier : 매개변수가 없고 , 리턴값이 있는 getXXX()메소드가지고있다
        * Function : 매개변수와 리턴값이 있는 applyXXX()메소드를 가지고 있다(매개변수를 리턴값으로 매핑)
        * Operator : Function과 똑같이 applyXXX()메소드를 가지고 있는데, 매개변수로 연산을 한후 통일된 타입으로 리턴
        * Predecate : 매개변수와 boolean값을 반환하는 testXXX()메소드르 가지고있다(매개변수활용해서 boolean값리턴)
        *
        * */

        Runnable runnable = () -> System.out.println("hello");

        runnable.run();

        /*Consumer<T>#accept(T t) : void : 객체 T를 받아 소비*/

        Consumer<String> consumer = str-> System.out.println(str);
        consumer.accept("hello world");

        /*BiConsumer<T, U>#accept(Tt,Uu):void: 객체 T, U를 받아 소비*/

        BiConsumer<String, LocalTime> biConsumer = (str, time) -> System.out.println(str + time);
        biConsumer.accept("hello world", LocalTime.now());

        /*IntConsumer#accept(int value) :void :int값을 받아서 소비한다*/
        IntConsumer intConsumer = num -> System.out.println("입력하신 정수의 제곱은" + (num * num));
        intConsumer.accept(10);

        /*LongConsumer#accept(long value) :void :long값을 받아서 소비한다*/
        LongConsumer longConsumer = num -> System.out.println(num);
        longConsumer.accept(12345);

        /*ObjLongConsumer<T>#accept(T t,long value) :void :객체 T와 int값을 받아 소비한다*/
        ObjIntConsumer<java.util.Random> objIntConsumer =
                ((random, value) -> System.out.println(value));
        objIntConsumer.accept(new java.util.Random(),10);

        /*ObjLongConsumer<T>#accept(T t,long value) :void :객체 T와 long값을 받아 소비한다*/
//        ObjLongConsumer<LocalDate> objLongConsumer =
//                (date, days) -> System.out.println(date + days + date.plusDays(days));
//
//        /*ObjLongConsumer<T>#accept(T t,long value) :void :객체 T와 double값을 받아 소비한다*/
//        ObjIntConsumer<StringBuilder> objDoubleConsumer =
//                (sb, doubleValue) -> System.out.println(sb.append(Math.abs(doubleValue)));
//
//                objDoubleConsumer.accept(new StringBuilder(""),-123.5);





    }

}
