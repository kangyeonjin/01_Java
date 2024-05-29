package com.ohgiraffers.section03.stringbuilder;

public class Application1 {
    //string과 stringbuilder의 차이
    public static void main(String[] args) {
        /*
        * string과 stringbuilder
        * string : 불변이라는 특성을 가지고 있다
        *           문자열에+연산으로 합치기하는경우 기존 인스턴스를 수정하는것이아닌
        *           새로운 인스턴스를 반환한다
        *           문자열변경이 자주일어나는경우 성능면에서 좋지않다
        * 하지만, 변하지 않는 문자열 자주 읽어들이는 경우 오히려 더 좋은 성능으 ㄹ낸다
        * stringbuilder : 가변이라는 특징을 갖는다
        *                 문자열에 appand메소드를 이요해 합치는 경우
        *                 기존인스턴스를 수정하기 떄문에 새로운 인스턴스를 만들지 않는다
        *                 따라서 잦은 문자열 변경이 일어나는 경우 string보다 성는이 좋다
        *
        * */

        /*
        * String Builder : 스레드 동기화 기능제공되지않음
        *                  스레드 동기화 처리를 고려하지 않는 상황에서 stringbuffer보다 성능이 좋음
        * string  Buffer: 스레드 동기화기능제공한다
        *                 성능면에서 stringBuilder보다 느리다
        * */

        //stringbuilder 인스턴스 생성
        StringBuilder sb = new StringBuilder("java");

        System.out.println(sb);

        /*hashcode는 오버라이딩 안되있음
        * => 동일한 값을 가지는 경우 같은 해쉬코드를 반환하는 것이 아니라
        *   인스턴스가 동일해야 같은 해쉬코드를 반환한다
        * */

        System.out.println(sb.hashCode());

        sb.append("oracle");

        System.out.println(sb);

        System.out.println(sb.hashCode());

        //stringbuilder는 문자열을 변경했다고 새로운 인스턴스가 생성되지않는다




    }
}
