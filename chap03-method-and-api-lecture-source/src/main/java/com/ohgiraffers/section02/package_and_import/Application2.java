package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.staticMaxNumberOf;

public class Application2 {
    public static void main(String[] args) {

        /*
        * 임포트
        * 서로다른 패키지에 존재하는 클래스를 사용하는경우
        * 패키지명을 포함한 풀클래스 이름을 사용해야하지만 길이가 길경우
        * 패키지명을 생략하고 사용할수 있도록한 구문이import구문이다
        *
        * */

        Calculator calc = new Calculator();
        int min = calc.nonStaticNumberOf(50, 60);
        System.out.println("50과 60중 더 작은 것은 ?" + min);

//        static메서드의 경우
        int max = staticMaxNumberOf(100, 200);
        System.out.println("100과  200중 더 큰것은?" + max);

        int max2 = staticMaxNumberOf(100,200);
        System.out.println("100과  200중 더 큰것은 ?" + max2);

    }

}
