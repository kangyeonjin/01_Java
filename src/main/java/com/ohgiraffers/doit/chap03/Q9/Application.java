package com.ohgiraffers.doit.chap03.Q9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Application {

    //중복숫자 제거하기???????????
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> temp = new HashSet<>(numbers);
        ArrayList<Integer> result = new ArrayList<>(temp);
        System.out.println(result);


    }
}
