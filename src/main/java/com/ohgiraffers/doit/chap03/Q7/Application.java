package com.ohgiraffers.doit.chap03.Q7;

import java.util.ArrayList;
import java.util.Arrays;


public class Application {
    //리스트 문자열로 만들기
    public static void main(String[] args) {

        ArrayList<String> mylist = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ",mylist);
        System.out.println(result);



    }




}
