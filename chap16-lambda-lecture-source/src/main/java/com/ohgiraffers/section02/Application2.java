package com.ohgiraffers.section02;

import java.time.LocalDateTime;
import java.util.function.*;

public class Application2 {
    public static void main(String[] args) {

        //Supplier : 매개변수가 없고 리턴값이 있는 getXXX() 매서드를 가지고 있다
        //*Supplier<>#get():객체 T를 리턴한다

        Supplier<LocalDateTime> supplier =() -> LocalDateTime.now();
        LocalDateTime localDateTime = supplier.get();
        System.out.println(localDateTime);

        /*BooleanSuplier#getAsBoolean() :boolean :boolean값을 리턴한다*/

        BooleanSupplier booleanSupplier =() ->{
            int random = (int) (Math.random() * 2);
            return random ==0? false : true;
        };
        System.out.println(booleanSupplier.getAsBoolean());

        /*IntSupplier#getAsInt() : int : int값을 리턴한다*/
        IntSupplier intSupplier =() ->(int) (Math.random()*6)+1;
        System.out.println(intSupplier.getAsInt());

        /*DoubleSupplier#getAsDouble() : Double : Double값을 리턴한다*/
        DoubleSupplier doubleSupplier =() -> Math.random();
        System.out.println(doubleSupplier.getAsDouble());

        /*LongSupplier#getAsLong() : Long : Long값을 리턴한다*/
        LongSupplier longSupplier =() ->
                new java.util.Date().getTime();
        System.out.println(longSupplier.getAsLong());


    }
}
