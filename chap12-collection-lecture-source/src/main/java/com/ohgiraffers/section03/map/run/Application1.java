package com.ohgiraffers.section03.map.run;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Application1 {
    //Map
    public static void main(String[] args) {

        /*
        * map 인터페이스 특징
        * collection 인터페이스와는 다른 저장방식을 가진다
        * 키와 값을 하나의 쌍으로 저장하는 방식을 사용한다
        *
        * key
        * 값(value)을 찾기위한 이름역할을 하는객체를 의미
        * 1. 요소의 저장순서를 유지하지않는다
        * 2. 키는 중복을 허용하지 ㅇ낳지만 키가 다르면 중복되는 값은 저장가능하다
        *
        * hashmap, hashtable, treemap등 대표적인 클래스가 존재한다
        * hashmap이 가장 많이 사용되며 hashtable은 jdk 1.0부터 존재해
        * hashmap과 동일하게 동작된다
        * > 하위 호한을 위해 남겨놓은것
        * 따라서 가급적이면 hashmap을 사용하는것이 권장된다
        *
        * */

        HashMap hMap =  new HashMap();
        Map hMap2 =  new HashMap();

        //put()
        //키와 값둘다 객체여야한다
        //atuoBoxing처리된다. 12 >
        hMap.put("one", new Date());
        hMap.put(12, "red apple");
        hMap.put(33,123);

        System.out.println(hMap);

        //키 중복 확인
        //같은 키값에 value를 다르게 하게되면 덮어씌워진다
        hMap.put(12, "yellow banana");
        System.out.println(hMap);

        //값 중복 확인
        hMap.put(12, "yellow banana");
        hMap.put(13, "yellow banana");
        hMap.put(14, "yellow banana");

        System.out.println(hMap);

        //remove() >삭제
        //key값으로 접근해서 저장된 값을 삭제
        hMap.remove(13);
        hMap.remove(14);

        System.out.println(hMap);

        //저장된 객체수 확인
        System.out.println("hMap에 저장된 객체수 : "+hMap.size());







    }

}
