package com.ohgiraffers.section3.abstraction;

public class Application2 {
    public static void main(String[] args) {

////        test dogi = new test();
//////        test dogi2 = new test();
////
////        dogi.setKinds("골든리트리버");
////        dogi.setDog("Max");
////
////        System.out.println(dogi.getInfo());
//
//       test author = new test();
//       author.setBook("Effective Java");
//       author.setName("Jousua Bloch");
//       author.setCover("hard");
//       author.setPage(416);
//
//        System.out.println(author.getInfo());

        test james = new test();
        james.setAge(30);
        james.setGender("남자");
        james.setCount(3);
        james.setName("james");

        System.out.println(james.print());

    }

}
