package com.ohgiraffers.section02.set.run;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Application1 {
    public static void main(String[] args) {

        /*
        * set인터페이스를 구현한 set컬렉션 클래스의 특징
        * 요소의 저장순서를 유지하지않는다
        * 같은 요소의 중복 저장을 허용하지 않는다
        * (null값도 중복되지 않게 하나의 null만 저장)
        * */

        /*hashset클래스
        * set컬렉션 클래스에서 가장 많이 사용되는 클래스중 하나이따
        * hash > 해시 알고리즘을 사용해서 검색속도가 빠르다는 장점이 있다*/

        HashSet<String> hSet = new HashSet<>();
//        Set hset2 = new HashSet();
//        Collections hset3 = new HashSet();

        hSet.add(new String("java"));
        hSet.add("oracle");
        hSet.add("jdbc");
        hSet.add("css");

        System.out.println(hSet);
        hSet.add("java");

        //중복을 허용하지 않는다
        System.out.println(hSet);
        System.out.println(hSet.size());
        System.out.println(hSet.contains("oracle"));

        /*저장된 객체를 한개씩 꺼내는 기능이 없다
        * 반복문을 이용해서 연속처리하는 방법*/

        //1.toArray()배열로 바꾸고 for문사용
        Object[] arr = hSet.toArray();
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        //2.iterator()로 목록을 만들어서 연속처리
        Iterator<String> iter = hSet.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        Boolean result = hSet.remove("oracle");
        System.out.println(result);
        System.out.println(hSet);

        hSet.clear();
        System.out.println(hSet.isEmpty());
        System.out.println(hSet);



    }
}
