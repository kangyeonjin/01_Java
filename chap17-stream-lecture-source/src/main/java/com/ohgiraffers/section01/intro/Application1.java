package com.ohgiraffers.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 스트림(stream)
        * 자바 8버전부터추가된 기능으로, 컬렉션에 저장된 엘리먼트(요소)들을
        * 하나씩 순회하며 처리할수있는 기능
        * 스트림을 이용하면 배열 또는 컬렉션을 함수 여러개를 사용해서 결과를 쉽게 얻을수있다
        * 람다식과 함께 사용될수있으며 컬렉션에 들어있는 데이터에 대한
        * 처리를 간결하게 표현할수있다
        * 스트림을 사용하면 람다식을 활용해 코드양이 많이 줄어든다
        *
        * */

        /*
        * 스트림의 특성
        * 1. 스트림은 원본데이터를 변경시키지않는다
        * 2.스트림은일회용이기때문에 최종 연산이 일어난후 다시 스트림을 생성해서 사용해야한다
        * 3. 스트림은 작업을 내부적으로 반복처리한다
        * 4. 스트림은 작업을 병렬로 처리할수있다(멀티쓰레드)*/

        List<String> stringList = new ArrayList<>(Arrays.asList("e","a", "b", "c","d","c","a"));

        System.out.println("======= stream 사용 이전 ============");
        for(String str : stringList){
            System.out.println(str);
        }

        System.out.println("======= stream 사용 이후 ============");
        stringList.stream().forEach(System.out::println);

        /*
        * distinct(): 중복을 제거한다
        * sorted() : 오름차순으로 정렬이됨(내림차순정렬 : Comparatoe.reverseorder())
        * limit(): 매개변수로 넣은 정수만큼 잘라준다
        * */

        System.out.println("======= stream 연산 ============");
        //stread생성 //distinct,sorted,limit가 중간연산  //forEach최종연산
//        stringList.stream().distinct().sorted().limit(5).forEach(System.out::println);
//        stringList.stream().distinct().forEach(System.out::println);
//        stringList.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        stringList.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);


    }
}
