package com.ohgiraffers.api.string;

public class StringTest {
    public static void main(String[] args) {
//   String 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
//   int 문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성
//        StringProcess sp = new StringProcess();
//        String result = sp.preChar("hello world");

//        1.문자열을 배열로 변환
//        2.쉼표세기

        String str ="hello world";
        System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));

        int find1 = str.indexOf("s");
        int find2 = str.indexOf('c');

        System.out.println(find1);
        System.out.println(find2);

        char count1 ='c';
        char count2 = 's';
        int countA = 0;
        int countB = 0;

           for(int i = 0; i < str.length(); i++){
               if(str.charAt(i) == count1){
                   countA++;
               }else if(str.charAt(i) == count2){
                   countB++;
               }
           }

        System.out.println(count1+countA+str);
        System.out.println(count2+countB+str);



        }

    }




