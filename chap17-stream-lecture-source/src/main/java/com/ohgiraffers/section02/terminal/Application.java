package com.ohgiraffers.section02.terminal;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) {

        /*
        * Calculating
        * 수학연산과 관련된, 다양한 메소드를 제공하는데 최소, 최대 종합등의 결과를 보여준다
        *
        * */


        //count(): 스트림에 담겨잇는 갯수를 반환
        long count = IntStream.range(1, 10).count();
        //sum() : 스트림에 담겨있는 숫자들의 총합을 반환
        long sum = IntStream.range(1,9).sum();

        System.out.println(count);
        System.out.println(sum);

        int oddSum = IntStream.range(1,10)
                .filter(i -> i % 2 ==1)
                .sum();
        System.out.println(oddSum);

        //OptionalInt : 값이 존재할수도 있고, 존재하지 않을수도 있는"int"를 표현하는 타입
        OptionalInt max = IntStream.range(1,10).max();
        OptionalInt min = IntStream.range(1,10).min();

        System.out.println(max);
        System.out.println(min);

    }

}
