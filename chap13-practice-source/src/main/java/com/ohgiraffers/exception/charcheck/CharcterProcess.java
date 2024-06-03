package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class CharcterProcess {

    //전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
    // 공백문자가 있으면, CharCheckException 발생

    public CharcterProcess(){} //기본 생성자

    public int countAlpha(String s) throws CharCheckException{

        int count =0;
        //문자를 입력받아서
        //문자에서 영문자갯수를 세는 메서드
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  //입력받기

        char[] alphas = new char[26];  //알파벳 배열공간 만들기

        for(int i=0; i < alphas.length; i++){  //알파벳길이만큼 반복함
            alphas[i] =0;
        }

        for(int i= 0; i <str.length(); i++){  //입력받은 문자열 길이만큼 반복하기
            char ch = str.charAt(i);        //알파벳 추리기
            if(ch >= 'a' && ch <= 'z'){
                alphas[ch - 'a']++;   //알파벳의 아스키코드값을 활용해사 카운트값을 배열에 저장하기
            }
        }
        for (char x ='a'; x < 'z'; x++){
            System.out.println(x+"="+(int)alphas[x-'a']); //알파벳별 카운트 출력
        }


    }

}
