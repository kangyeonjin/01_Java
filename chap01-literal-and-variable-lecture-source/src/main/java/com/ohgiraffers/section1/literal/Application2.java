package com.ohgiraffers.section1.literal;

import org.w3c.dom.ls.LSOutput;

public class Application2 {
    public static void main(String[] args) {
//        값을 직접 연산하여 출력 할수있다.
//        값의 형태에 따라 사용할수있는 연산자의 종류와 연산의 결과가 달라진다

//        정수와 정수의 연산
        System.out.println("==============정수와 정수의 연산==============");
        System.out.println(123+456);
        System.out.println(123-23);
        System.out.println(123*10);
        System.out.println(123/10);  //나누기를 한 몫의 값
        System.out.println(123%10); //나누기를 한 나머지 값

//      실수와 실수의 연산
        System.out.println("==============정수와 정수의 연산==============");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10);
        System.out.println(1.23 / 10);

//      정수와 실수의 연산
        System.out.println("==============정수와 실수의 연산==============");
        System.out.println(123 + 0.5);  //항상 실수가 나옴
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 % 0.5);

//      문자와 문자의 연산
        System.out.println("==============문자와 문자의 연산==============");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');
//        문자는 내부적으로 숫자로 인식되어 연산된다
//        문자와 정수의 연산
        System.out.println("==============문자와 정수의 연산==============");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 10);
        System.out.println('a' / 10);
        System.out.println('a' % 10);

//        문자와 실수의 연산
        System.out.println("==============문자와 실수의 연산==============");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 10.0);
        System.out.println('a' / 10.0);
        System.out.println('a' % 10.0);
//      결과는 실수형태로 나오게 된다
/* 결론은 문자는 내부적으로 숫자취급을 한다.
 */

//        문자열과 문자열의 연산
//        문자열과 문자열의 연산은(이어붙이기)가 된다
//        문자열과 문자열의연산은 +연산만 가능하다
        System.out.println("==============문자열와 문자열의 연산==============");
//        System.out.println("helllo" + "world!");
//        System.out.println("helllo" - "world!");
//        System.out.println("helllo" / "world!");
//        System.out.println("helllo" % "world!");
//        문자열과 다른 형태의 값 연산
        System.out.println("==============문자열와 문자열의 연산==============");
        System.out.println("yeonjin" + 123); //정수와의 연산
        System.out.println("yeonjin" + 123.456);
        System.out.println("yeonjin" + 'a');
        System.out.println("yeonjin" + true);

//        주의해야 할점 숫자로된 문자열 형태의 값도 +연산을 했을때 문자열 합치기가 된다
        System.out.println("123" + "456");

//        논리값과 논리값의 연산
//        System.out.println(true + false);
//        System.out.println(true - false);
//        System.out.println(true * false);
//        System.out.println(true / false);
//        System.out.println(true % false);
//  논리값과 정수의 연산도 마찬가지로 안됨
//                논리값과 실수의 연산도 안됨
//                논리값과 문자의 연산도 안됨
//                논리값과 문자열의 연산
        System.out.println("==============논리값과 문자열의 연산==============");
        System.out.println(true + "a");





    }
}



