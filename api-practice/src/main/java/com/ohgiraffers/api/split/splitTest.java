package com.ohgiraffers.api.split;

import java.lang.reflect.Array;

import java.util.Arrays;

public class splitTest {
    public static void main(String[] args) {
        String str ="J a v a P r o g r a m ";

        //문자열 분리
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));

//        for(String s : strArr){
//            System.out.println(s);
//        }

        //문자 배열로 바꾸기
        //1. 문자배열을 문자열 배열크기로 만들기
        char[] chArr = new char[strArr.length];

        //2. 문자열배열의 값을 문자로 바꿔서,문자배열에 넣기
        for(int i =0; i < strArr.length; i++){
            chArr[i] = strArr[i].charAt(0);
        }
        System.out.println(chArr.length);

        //문자배열에 값이 잘 들어갔는지 확인
        System.out.println(Arrays.toString(chArr));

        //문자배열 > 문자열
        System.out.println("가나다"+'a'+'b');
        String result ="";

        for(char ch :chArr){
            result = result + ch;
        }
        System.out.println(result);

        String result2 = new String(chArr);
        System.out.println(result2);

        //대문자로 바꾸기
        result = result.toUpperCase();
        System.out.println(result);


    }

}
