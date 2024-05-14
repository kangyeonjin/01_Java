package com.ohgiraffers.section3.increment;

public class Application {
    public static void main(String[] args) {

        /*증감연산자
        * 피연산자의 앞 or뒤에 사용이 가능하다
        * '++' :1 증가의 의미
        * '--' :1 감소의 의미
        *
        *
        * */

//        단항으로 사용될때
          int num = 20;
        System.out.println("num =" + num);  //20

        num++;
        System.out.println("num =" + num);

        ++num;
        System.out.println("num = " + num);  //21

        --num;
        System.out.println("num = " + num);


//        증감연산자를 다른연산자와 함께 사용
//        증감연산자는 다른연산자와 함께 사용할때 의미가 달라진다
//        '++var :피연산자의 값을 먼저 1을 증가시킨후 다른연산을 진행한다.'
//        'var++"다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1증가시킨다
//        '--var' 피연산자의 값을 먼저 1감소시킨뒤 다른연산을 진행한다
//          'var--'

        int firstNum = 20;
        int result1 = firstNum++ * 3;
        System.out.println(result1);

        int secondNum = 20;

        int result2 =  ++secondNum * 3;
        System.out.println(result2);

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum = " + addNum);
        System.out.println("num1 = " + num);









    }

}
