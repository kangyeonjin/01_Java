package com.ohgiraffers.section04.constructor;

public class User {

    private  String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    /*
    * 생성자의 작성위치
    * 문법상으로클래스 내부에 적성하면되지만
    * 통상적으로 필드 선언부와 메소드 선언부 사이에 적는 것이 관례
    * */

    /*
    * 생성자의 사용목적
    * 1. 인스턴스 생성시점에 수행할 명령이 있는경우 사용한다
    * 2. 매개변수 있는 생성자의 경우 매개 변수로 전달받은 값으로 필드를 초기화하며
    *   인스턴스 생성할 목적으로 주로 사용된다
    * 3. 작성한 생성자 욍에는 인스턴스를 생성하는 방법을 제공하지 않겠다느 의미
    *   인스텅ㄴ스를 생성하는 방법을 제한하기 위한 용도로 사용(초기값전달강제)
    * */

    /*
    * 생성자 작성시 주의할점
    * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야한다
    * 2. 생성자 메소드는 반환형을 작성하지 않는다 (작성하는 경우에 생성자가 아닌 일반 메소드로 인식)
    *
    * */

    /*생성자의 종류
    * 1. 기본생성자(매개변수가 없는 생성자)
    *
    * 2. 매개변수 있는생성자
    *
    * 매개변수가 있는 생성자가 한개라도 존재하면 기본생성자를 자바 compiler가 자동으로 추가하지 않는다
    * 기본생성자가 필요한 경우에는 반드시 명시적으로 작성을 해야한다
    * */

    //기본생성자
    public User( ){
        System.out.println("User 클래스의 기본생성자 호출함..");
    }

    public String getInfo(){
        return "User [id = " +this.id +",pwd = "+this.pwd+", "+
                "name="+this.name+",enrollDate="+this.enrollDate+"]";
    }

    //매개변수 있는 생성자(id,pwd,name의 초기화를 담당)
    public User(String id,String pwd,String name){
        //매개변수있는 생성자의 주목적 > 인스턴스 생성시점에 필드를 원하는 값으로 초기화하기 위함
        this.id = id;
        this.pwd = pwd;
        this.name = name;

        System.out.println("User클래스의 id, pwd, name을 초기화하는 생성자 호출함..");
    }
 //모든 필드를 초기화하는 생성자(id. pwd,name. enrolldate)
    public User(String id,String pwd,String name, java.util.Date enrollDate){

//        this.id =id;
//        this.pwd = pwd;
//        this.name = name;
//        this.enrollDate = enrollDate;

        /*
        * this() 사용하기
        * this()는 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구문이다
        * 괄호안에 매개변수의 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀한다(메소드 동일)
        * this()는 가장 첫줄에 선언해야하며 그렇지 않은경우 complie error가 발생함
        * */

        /*
        *
        * */

        this(id, pwd, name); //미리 작성한 3개의 필드를 초기화하는 생성자로 매개변수로 받은 값을 전달
        this.enrollDate = enrollDate;

        System.out.println("User클래스의 모든 필드를 초기화하는 생성자 호출함..");

        //모든필드를 초기화하는 생성자를 호출해 인스턴스(객체)생성
        User user3 =  new User("user02","pass02","박태근",new java.util.Date());
    }
    /*복사생성자 > 같은내용의 인스턴스를 만들때 사용
    *동일한 값을 가지지만 새롭게 할당되는 인스턴스이기 때문에 서로다른 주소값을 가지게 된다
    * > 깊은복사
    *
    */
    public User(User otherUser){
        this.id = otherUser.id;
        this.pwd = otherUser.pwd;
        this.name = otherUser.name;
        this.enrollDate = otherUser.enrollDate;

        System.out.println("User클래스의 복사생성자 호출함");
        System.out.println("this의 hashcode : "+this.hashCode());
        System.out.println("otheruser의 hashcode : "+otherUser.hashCode());
    }

}
