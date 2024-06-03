package section2.variable;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 변수에 명명규칙
        * 변수의 이름을 지울때 아무렇게나 짓는것이 정해진 규칙이 존재함
        * 실무적으로 굉장히 중요하기때문에 숙지가 필수적
        * 또한, 규칙에 맞는 올바른 변수명을 짓는것이 좋은 프로그래밍을 하는 첫단추이다
        * */

        /*
        * 변수명명규칙
        * 1. 컴파일 에러를 발생시키는 규칙
        *   1-1 동일한 범위내에서 동일한 변수명을 가질수 없다
        *   1-2 예약어는 사용이 불가능하다
        *       예약어? 자바에서 미리 사용하겠다고, 컴파일러와 약속한 키워드들을 의미한다
        *   1-3 변수명은 대문자와 소문자를 구분함
        *   1-4 변수명은 수사로 시작할수 없다.(시작만 할수없고, 숫자를 섞는건 가능하다)
        *   1-5 특수기호는 '_"와 '$'만 사용가능하다(공백을 사용할수없음)
        *
        * 2.컴파일 에러를 발생시키지는 않지만 개발자들 끼리의 규칙(암묵적 규칙)
        *   2-1 변수명에 길이 제한을 없다
        *   2-2 변수명이 합성어로 이루어진 경우, 첫단어는 소문자, 두번째 시작단어부터는 대문자로 시작한다.(CAMEL-CASE)
        *   2-3 단어와 단어사이의 연결은 언더스코어(_)로 하지않는다.
        *       상수를 사용할때 특수하게 사용한다.
        *   2-4 한글로 변수명을 짓는게 가능하지만,권장되진 않는다.(한글을 취급하는 다양한 방식때문에 에러유발)
        *   2-5 변수안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록한다
        *   2-6 전형적인 변수 이름이 있다면 가급적 사용하도록한다.
        *   2-7 변수명은 명사형으로 작성
        *   2-8 boolean형은 의문문으로 가급적 긍정의 형태로 네이밍함
        *
        * */


        int a;
        int A;

        int number;
        int myAge;
        int 내나이 = 19;

//컴파일에러를 발생시키는 규칙

        int age = 20;
//        int age;  동일한 변수명을 가지므로 에러가 발생함

//        int true;  예약어 사용불가
//        int byte;

        int Age=20; //위에서 만든 age와 다른변수로 취급한다
        int True=20; //예약어 true와 다른 변수로 취급한다.

//        int lage =20;  //숫자로 시작하기 때문에 컴파일 에러가 발생한다.
        int age1 =20;//숫자가 맨앞에 있지 않으면 섞어서 사용가능하다.

        int _age=20;  //언더스코어는 사용가능함, 처음중간 마지막 상관없음
        int $harp =20 ; //사용가능함, 처음 중간 마지막 상관없음
//        int a_ge =20;
//        int a@ge = 20;


//        암묵적약속
        int asdgasldkfeninsdlkfalsdnflskdf ; // 변수명 길이 사용안됨

        /*카멜케이스
        * 합성어 일경우 첫단어는 모두 소문자, 두번쨰 시작단어는 대문자로 시작한다
        * 자바에서는 클래스명만 유일하게 대문자로 시작한다
        * */
        int maxAge = 20;
        int minAge =10;

        String user_name;
        int 나이; //가능하지만 권장하지않음

        String s;  //변수가 어떤 의미인지 파악하기 힘듬
        String name;  //의미를 분명히 해서 변수명을 지어야 의도가 파악이 된다.

//        전형적인 변수명들
        int sum = 0;
        int max = 0;
//        int min = 0;
        int count = 1;

        String goHome;  //동사형
        String home;  //가급적 명사형으로 짓는다

        boolean isAlive =true;
        boolean isTrue = true;
//        boolean isDead = true; 부정형보다 긍정형이 더 나은 방식이다.
















    }
}