package com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {

    /*
    * final
    * :final은 변경불가의 의미를 담고 있는 키워드
    * final이 사용되는곳 >변경불가의 의미
    * 지역변수 : 초기화 이후 값 변경불가
    * 매개변수 : 호출시 전달한 인자 변경불가
    * 전역변수 : 인스턴스 생성후 초기화 이후 값 변경불가
    * 클래스변수 : 프로그램 start이후 값 변경불가
    * non-static메소드 : 메소드 재작성불가
    * 클래스 : 상속 불가
    *
    * */

    /*
    * non-static field에 final사용
    * */

//    private final int nonStaticNum;

    //해결방법 2가지
    //1.선언과 동시에 초기화
    private final int NON_STATIC_NUM =1;

    //2. 생성자를 이용해서 초기화한다
    private final String NON_STATIC_NAME;

    public FinalFieldTest(String NON_STATIC_NAME){
        this.NON_STATIC_NAME = NON_STATIC_NAME;
    }

    //static field에 final사용
        //final키워드 사용시 초기화를 하지 않으면 에러가 발생

//    프로그램시작과 동시에 미리 메모리에 올라감, final붙으면 기본값에서 값을 바꿀수 없음
//    private  static final int STATIC_NUM;

    /*
    * 생성자를 이용한 초기화는 불가능
    * 생성자는 인스턴스가 생성되는 시점에 호출되기 때문에 그전에는 초기화가 일어나지 못한다
    * static은 프로그램이 start될때 할당되기때문에
    * 초기화가 되지않은 상태로 선언된것과 동일하여
    * 기본값으로 초기화된후 값을 변경하지 못하기 때문에 에러가 발생함
    * */

    //선언과 동시에 초기화
    private  static final int STATIC_NUM = 1;

    //생성자를 이용한 초기화
//    private  static final int STATIC_DOUBLE;
//    public FinalFieldTest(double staticDouble){
//        STATIC_DOUBLE = staticDouble;
//    }



}
