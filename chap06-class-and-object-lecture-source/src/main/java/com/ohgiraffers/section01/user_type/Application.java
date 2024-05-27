package com.ohgiraffers.section01.user_type;

import java.security.spec.RSAOtherPrimeInfo;

public class Application {
    public static void main(String[] args) {

        //회원(아이디, 비밀번호, 이름 , 나이 ,성별 , 취미)이 정보들을 관리하려고함

        String id = "user01";
        String passwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[]{"축구", "볼링", "테니스"};

        System.out.println(id);
        System.out.println(passwd);
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(hobby);

        for (int i = 0; i < hobby.length; i++) {
            System.out.println(hobby[i] + " ");
        }
        System.out.println();

        /*
         * 위와같이 각각의 변수로 관리하게 되면 몇가지의 단점이 있다
         * 1. 변수명을 다 관리해야한다
         * 2. 모든 회원정보를 인자로 메소드 호출시, 값을 전달해야하면 너무 많은 값을 인자로 전달해야해서 가독성이 떨어진다
         * 3. 메소드에서 리턴은 1개의 값만 가능하기 때문에 다른 타입의 여러 변수를 묶어서 리턴할수가 없다
         * */

        /*
         * 사용자 정의 자료형 사용하기
         *
         *[자료형][변수명] = new [클래스명]();
         * 사용자정의 자료형인 클래스르르 이용하기 위해서 new연산자로 heap에 할다을 해야한다
         * 객체를 생성하게 되면 클래스에 정의한 필드와 메소드대로 객체가 생성된다
         * 아이디, 비밀번호, 이름 나이 성별 취미를 연속된 메모리 주소에서 사용하도록 heap에 공간을 만들었다
         * */

        Member member01 = new Member();

        /*
         * 필드에 접근하기 위해서는 레퍼런스 변수명, 필드명으로 접근한다
         * "."참조연산자, 레퍼런스 변수가 참고하고 있는 주소로 접근한다는 의미
         * 배열은 인덱스로 접근, 객체는 필드명으로 접근
         * */

        System.out.println("========생성된 객체 필드값 출력===========");
        System.out.println("member id :" + member01.id);
        System.out.println("member.pwd :" + member01.pwd);
        System.out.println("member.name :" + member01.name);
        System.out.println("member.age :" + member01.age);
        System.out.println("member.gender :" + member01.gender);
        System.out.println("member.hobby :" + member01.hobby);

        // 필드에 접근해 변수처럼 사용
        member01.id = "user01";
        member01.pwd = "pass01";
        member01.name = "홍길동";
        member01.age = 20;
        member01.gender = '남';
        member01.hobby = new String[]{"축구", "볼링", "테니스"};

        System.out.println("=========값입력후 객체 필드값 출력==========");
        System.out.println(member01.id);
        System.out.println(member01.pwd);
        System.out.println(member01.name);
        System.out.println(member01.age);
        System.out.println(member01.gender);

        for (int i = 0; i < member01.hobby.length; i++) {
            System.out.println(member01.hobby[i] + " ");
        }
        System.out.println();
    }


}
