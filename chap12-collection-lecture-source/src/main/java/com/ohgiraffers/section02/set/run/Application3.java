package com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Application3 {
    //TreeSet
    public static void main(String[] args) {

        /*
        * TreeSet클래스
        * TreeSet클래스는 데이터가 정렬된 상태로 저장되는
        * 이진검색트리의 형태로 요소를 저장한다
        * 이진검색트리는 데이터를 추가하거나 제거하는 등
        * 기본동작시간이 매우 빠르다
        * set인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를
        * 유지하는것이 다른점
        * */

        TreeSet<String> tSet = new TreeSet<>();
//        set<String> tSet1 = new HashSet<>();
        tSet.add("Java");
        tSet.add("oracle");
        tSet.add("Jdbc");
        tSet.add("html");
        tSet.add("css");

        //자동 오름차순 정렬
        System.out.println(tSet);

        //목록만들어서 하나씩 대문자로 변경해서 출력

        Iterator<String> iter = tSet.iterator();

//        hasNext() : 다음값이 있는지 확인
//        next() : 다음값을 가져오는

        while(iter.hasNext()){
            System.out.println((String)iter.next().toUpperCase());
        }

        System.out.println();
        Object[] arr = tSet.toArray();
        for(Object obj : arr){
//            System.out.println((String) obj.toUpperCase());
        }



    }

}
