package com.ohgiraffers.api.split;

public class splitTest {

    public static void main(String[] args) {
        String str = "J a v a P r o g r a m ";

//        System.out.println(str.replaceAll(" "," ").length());  //공백 포함 글자수
//        System.out.println(str.replaceAll(" ", "").length());  //공백제외 글자수

        String[] words = str.split(" "); //공백
        char[] cha = new char[words.length];  //문자열을 배열로

        System.out.println(cha);

        //모두 대문자 출력
        String upperCase = str.toUpperCase();
        System.out.println(upperCase);


}

}
