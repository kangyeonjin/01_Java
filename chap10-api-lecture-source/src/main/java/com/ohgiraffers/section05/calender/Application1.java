package com.ohgiraffers.section05.calender;

import java.util.Date;

public class Application1 {
    public static void main(String[] args) {

        /*
        * Date클래스
        * JDK1.0부터 날짜를 취급하기 위해 사용되던 클래스
        * >생성자를 비롯해 대부분의 메소드가 Deprecated되어 있다
        *
        * date는 java.sql.date와 java.util.date가 존재한다
        * 한클래스에서 두개의 타입을 전부사용하게 되면 import를 하더라도 사용하는 타입이 어느 패키지에 있는 date클래스인지
        * 모호하기때문에 import해도 풀클래스 네임을 작성해줘야한다
        * */

        /*Deprecated
        * 향후 버전이 업데이트되면서 사라지게 될 기능이니 가급적 사용하지 말라
        * 하위버전 호환성때문에 한번에 제거된것은 아니고 남겨두었다*/

        //1.기본생성자를 사용하는 방법
        //기본생성자로 인스턴스를 생성하면 운영체제의 날짜/시간정보를 이용해서 인스턴스를 만들게된다

        Date today = new Date();
        System.out.println(today);

        //2.date(long date)사용하는 방법
        //getTime(): 1970년 1월 1일 0시 0분 0초이후 지난시간을 millisecond로 계산해서 long 타입으로 반환한다
        System.out.println(today.getTime());

//        Date time = new Date(today.getTime());
//        Date time = new Date(1716962327166);
//
////        Wed May 29 14:58:47 KST 2024
//        System.out.println(time);

    }
}
