package com.ohgiraffers.section01.method;

public class Calculator {
    //삼항연산자로 두수를 비교해서 작은 값을 return해주느 메서드
    public int nonStaticNumberOf(int first, int second) {
//        int result = (first > second) ? second : first;
//        return result;
        return (first > second) ? second : first;
    }

    public static int staticMaxNumberOf(int first, int second) {
        return (first > second) ? first : second;  //큰값
        //더하기 , 빼기, 곱하기, 나누기, 나머지
        //이 각각을 수행할수 있는  메서드를 만들고
        //더히기 |빼기 곱하기,나누기 > non-static
        //나머지 > static
    }

    //더하기
    public int plusTwoNumber(int num1, int num2) {
        int result1 = num1 + num2;
        return result1;
    }

    //빼기
     public int minusTwoNumber(int num1, int num2){
         int result2 = num1 - num2;
         return result2;
     }

     //곱하기
    public int multipleTwoNumber (int num1,  int num2){
        int result3 = num1 * num2;
        return result3;
    }

        //나누기
    public int divideTwoNumber ( int num1, int num2){
        int result4 = num1 / num2;
        return result4;
    }

        //나머지
    public  static int remainTwoNumber (int num1, int num2){
        int result5 = num1 % num2;
        return result5;
    }

}
