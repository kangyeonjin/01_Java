package com.ohgiraffers.doit.chap03.Q6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Application {
    public static void main(String[] args) {
        //리스트역순으로 정렬하기
        //[1,3,5,4,2] 를  [5,4,3,2,1]

        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.reverseOrder());

        System.out.println(myList);

    }


}



