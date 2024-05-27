package com.ohgiraffers.section4.dto;

import com.ohgiraffers.section01.user_type.Member;

public class Application {
    public static void main(String[] args) {
        /*
         * 캡슐화의원칙에는 일부어긋나긴하기잠 다른 목적을 가진 클래스와 객체를 추상화하느 ㄴ기법
         * >DTO(data transfer object)
         * 이러한 객체를 설계할때는 행위가 아닌 데이터가 위주이며
         * 캡슐화의 원칙을 준수하여
         * 모든필드를 private으로 직접접근을 막고 각 필드 값을 변경하거나 반환하는 메소드를
         * 세트로 미리 작성해둔다
         * private필드와 필드 값을 수정하는 설정자(setter)필드에 접근하는 접근자(getter)
         * 주로 계층간 데이터를 주고 받을 목적으로 사용한다.
         * */

        //설정자를 이용해서 사용해보기
//        MemberDTO member = new MemberDTO();
//        member.setNumber(1);
//        member.getName("홍길동");
//        member.getAge(20);
//        member.getGenger('남');
//        member.getHeight(180);
//        member.getWeight(80);
//        member.getIsActivated(true);
//
//        //접근자를 이용해서 출력해보기
//        System.out.println("회원번호 : "+member.getNumber());
//        System.out.println("회원명 : "+ member.getName());
//        System.out.println("회원나이 : "+ member.getAge());
//        System.out.println("회원성별 : "+ member.getGenger());
//        System.out.println("회원키 : "+ member.getHeight());
//        System.out.println("회원 몸뭄게 : "+ member.getWeight());
//        System.out.println("회원 활성화상태 : "+ member.getIsActivated());


    }
}
