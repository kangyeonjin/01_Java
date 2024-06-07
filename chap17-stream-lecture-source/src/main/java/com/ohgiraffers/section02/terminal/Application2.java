package com.ohgiraffers.section02.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {

        /*
        * reduce
        * 스트림에 있는 모든요소를누적시킨다
        * Optional<T> reduce(BinaryOperator<T> accmulator);
        * T reduce(T indentity, BinaryOperator<T> accmulator);
        *
        * */

        //인자가 1개일경우
        OptionalInt reduceOneParm = IntStream.range(1,4)
//                .reduce((a,b)->{
//                    return Integer.sum(a, b);
//                });
        .reduce(Integer::sum);
        System.out.println(reduceOneParm); //1+2+3

        //인자가 2개일경우
        int resultTwoParm = IntStream.range(1,4)
                .reduce(100,Integer::sum); //100부터 스트림안의 요소를 누적시켜라
        System.out.println(resultTwoParm); //identity > 초기값

    }

}
