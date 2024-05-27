package com.ohgiraffers.section04.dto;

public class Application {
    public static void main(String[] args) {
        //생성자를 이용한 초기화 vs 설정자를 이용한 초기화

        /*
        * 1. 생성자를 이용한 초기화
        * 장점 : setter메서드를 여러번 호출해서 사용하지 않고
        * 단한번의 호출로 인스턴스 생성 및 초기화 가능
        * 단점 : 필드를 초기화할 매개변수의 갯수를 경우의 수 별로 모두 만들어둬야한다
        *        호출시 인자가 많아지는경우 어떠한 값이 어떤 필드를 의미하는 지 한누에
        *   예:아이디, 비밀번호, 이름이 모두 ohgiraffers인경우
        *    new user("ohgiraffers","ohgiraffers","ohgiraffers");
        * 2. 설정자를 이용한 초기화
        * 장점 : 필드를 초기화하는 각각의 값들이 어떤 필드를 초기화하는지 명확히 볼수있다
        *  예 ) 아이디, 비밀번호, 이름이 모두 ohgiraffers 인경우
        *    User user = new User();
        *    user.setId("ohgiraffers");
        *   호출하는 코드만 봐도 어떤 값이 어떤 필드를 초기화하는 내용인지 쉽게 알수있다
        * 단점 : 하나의 인스턴스를 생성할때, 하나의 호출로 끝나지 않는다
        *
        *
        * */

        //1. 생성자를 이용한 초기화

//        UserDTO user1 = new UserDTO("ohgiraffers","ohgiraffers","ohgiraffers",new java.util.Date());

        //기본 생성자를 이용한 초기화 + 설정자(setter)
        UserDTO user2 = new UserDTO();
        user2.setId("ohgiraffers");
        user2.setId("ohgiraffers");
        user2.setId("ohgiraffers");
//        user2.setEnrollDate(new java.util.Date());

        System.out.println(user2.getInfo());
    }
}
