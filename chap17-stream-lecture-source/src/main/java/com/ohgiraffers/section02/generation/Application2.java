package com.ohgiraffers.section02.generation;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {

     /*
     * 기본타입스트림생성
     * range(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자로 종료값전까지 범위의 스트림생성
     * rangeCLosed(시작값, 종료값) : 시작값부터 1씩 증가하는 숫자로 종료값까지의 범위의 스트림생성
     *
     * */

        IntStream intStream = IntStream.range(5, 10); //10전까지 범위으 스트림생성
        intStream.forEach(value -> System.out.print(value+""));
        System.out.println(); //줄바꿈

        LongStream longStream2 = LongStream.rangeClosed(5, 10);
        longStream2.forEach(value -> System.out.print(value+""));
        System.out.println(); //줄바꿈

        /*
        * Wrapper 클래스 자료형의 스트림으로 변환이 필요할때 boxing을 통해 할수있다
        * boxing : 기본자료형을 레퍼로 바꾸는것
        * doubles(갯수) :
        * boxed(): 기본타입스트림인 xxxstream을 박싱하여 wrapper타입의 stream<xxx>로 반환
        * */

        //실수형 랜덤수 5개를 담은 doublestream
        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.println(value+""));
        System.out.println();  //줄바꿈

        //문자열을 intstream으로 변환
        IntStream helloworldChars = "hello world".chars();  //문자열을 int형으로 변경
        helloworldChars.forEach(v -> System.out.print(v+" "));
        System.out.println(); //줄바꿈

        Stream<String> stringStream1 = Stream.of("java", "oracle", "jdbc");
        Stream<String> stringStream2 = Stream.of("html", "css", "javascript");

        //스트림은 1회성으로사용가능하며
        //이미 최종연산이 끝난 스트림은 재사용이 불가능하다
        //다시 사용할시 IllegalStateException이 발생한다
//        stringStream1.forEach(System.out::print);
//        stringStream2.forEach(System.out::print);

        /*
        * concat() : 두개의 스트림을 동일타입 스트림으로 합치기
        * */

        System.out.println("==========concatStream===========");
        Stream<String> concatStream = Stream.concat(stringStream1, stringStream2);
        concatStream.forEach(System.out::print);


        }

    }

