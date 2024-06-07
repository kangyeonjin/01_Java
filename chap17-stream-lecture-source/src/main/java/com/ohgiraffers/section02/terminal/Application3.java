package com.ohgiraffers.section02.terminal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Application3 {

    public static void main(String[] args) {

        /*
        * collect() : Collector타입받아서 처리하는데, 메소드를 통해 컬렉션을 출력으로 받을수있다.
        * */

        List<Member> memberList = Arrays.asList(
                new Member("test01","testName01"),
                new Member("test02","testName02"),
                new Member("test03","testName03")
        );
        List<String> collectorCollection = memberList
                .stream()
                .map(Member::getGetMemberName)//testName01, testName02,testName03
                .toList();

        System.out.println(collectorCollection);

//        String str = memberList
//                .stream()
//                .map(Member::getMemberName)
//                .collect(Collections.joining());

//        System.out.println(str);
    }

//    String str2 = memberList
//            .stream()
//            .map(Member::getGetMemberName)
//            .collect(Collections.joining("||","*시작*","*끝*"));
//
//    System.out.println(str2);


}
