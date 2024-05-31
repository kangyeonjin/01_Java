package com.ohgiraffers.doit.chap03.Q8;

import java.util.HashMap;

public class Application {

    //맵에서 값 삭제하기
    //제시문에서 b삭제하기
    public static void main(String[] args) {

        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        int result = grade.remove("B");

        System.out.println(result);  //지워진것
        System.out.println(grade);    //남아있는것

    }






}
