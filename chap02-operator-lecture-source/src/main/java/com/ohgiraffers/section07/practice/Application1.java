package com.ohgiraffers.section07.practice;

public class Application1 {
    public static void main(String[] args) {
// 산술연산자
//        1. 변수 `a`가 15이고, `b`가 4일 때, `a / b`의 결과를 구하세요.

        int a = 15;
        int b = 4;

       System.out.println(a/b);

//        2. 두 수 8과 3에 대해 나머지 연산을 수행하는 코드를 작성하세요.
        System.out.println(8%3);

//        3. `5 * 2 - 3`을 계산하고 결과를 출력하는 코드를 작성하세요.
        System.out.println(5*2-3);

//복합 대입 연산자
//   1. 변수 `x`가 10일 때, `x += 5`의 결과는 얼마인가요?
        int x =10;
        System.out.println(x += 5);

//  2. 변수 `y`가 20일 때, `y /= 4`의 결과를 구하세요.
        int y = 20;
        System.out.println(y /= 4);

//  3. 변수 `z`가 8이고, `z %= 3`을 수행한 후의 `z`의 값을 구하세요.
        int z = 8;
        System.out.println(z %=3);

//증감 연산자
//        1. 변수 `i`가 0일 때, `i++`후의 `i`의 값을 출력하세요.
        int i = 0;
        int result1 = i++;
        System.out.println(result1);

//        2. `int j = 10;` 선언 후 `-j`의 결과를 출력하세요.
        int j =10;
        int result2 = -j;
        System.out.println(result2);

//        3. `int k = 5;` 선언 후 `k` 값을 증가시키고, 증가된 값을 출력하는 코드를 작성하세요.

        int k = 5;
        int result = k++;
        System.out.println(result);


//비교 연산자
//        1. 두 변수 `num1 = 10`, `num2 = 20`이 같은지 비교하는 코드를 작성하세요.
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 == num2);

//        2. `15`가 `10`보다 큰지 확인하는 Java 코드를 작성하세요.
        System.out.println(15 > 10);

        int num3 = 15;
        int num4 = 10;
        System.out.println(15 > 10);


//        3. 변수 `age`가 18 이상인지 확인하는 조건문을 작성하세요.
        int age =18;
        System.out.println(age >= 18);

//논리 연산자
//        1. 변수 `a = true`, `b = false`일 때, 둘 다 참이어야 참을 반환하는 조건문을 작성하세요.
        boolean e = true;
        boolean f = false;
        System.out.println( e && f); //and연산은 둘다 참이어야 참을 반환하므로

//        2. `int age = 20;`이 18 이상이면서 65 미만인지 확인하는 코드를 작성하세요.
        int age1 = 20;
        System.out.println(age1 >=18 && age1 <=65);

//        3. 변수 `x = 10`, `y = 20`일 때, `x`가 10이 아니거나 `y`가 25 이상인지 확인하는 코드를 작성하세요.
        int g = 10;
        int h = 20;
        System.out.println(g != 10 || h >= 25);

    }

}
