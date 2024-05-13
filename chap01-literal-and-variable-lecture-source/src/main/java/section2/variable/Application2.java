package section2.variable;

public class Application2 {
    public static void main(String[] args) {
        /*
         * 변수를 사용하는 방법
         * 1. 변수를 준비한다(선언)
         * 2. 변수에 값을 대입한다.(값 대입 및 초기화)
         * 3. 변수를 사용한다.
         * */

        int a = 0;

        int b;

        /*
         * 자료형이란
         * 다양한 값의 형태별로 어느정도의 크기를 하나의 값으로 취급할것인지 미리 컴파일러와 약속한 키워드
         * ex. int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속을 한것
         * 이런한 자료형은 기본자료형, 참조자료형으로 나누어짐
         * */

//        기본자료형
//        정수를 취급하는 자료형 4가지
        byte bnum;  //선언

        bnum = 10;  //초기화

//            Bear bear;

        short snum; //2byte
        int inum; //4byte
        long lnum;  //8byte

//            실수를 취급하는 자료형 2가지
        float fnum;//4byte
        double dnum; //8byte

//            문자를 취급하는 자료형
        char ch;  //2byte
        char ch2;

        boolean isTrue; //1byte

//        참조형 자료형
        String str;

//            초기화
        /*
         * 초기화할때 대입연산자 기준 오른쪽과 왼쪽은 무조건 같은 타입이어야한다.
         * */

        bnum = 1; //초기화
        snum = 2;
        inum = 4;
        lnum = 8; //아무문제 없는것 같지만 뒤에 대문자 L을 붙야한다.
        lnum = 8L;

        fnum = 4.0f; //실수뒤에 'f'를 붙여야한다.
        dnum = 8.0;

        ch = 'a';  //문자형식으로 저장가능
        ch2 = 97;// 숫자로도 저장이 가능함

        isTrue = true;
        isTrue = false; //true 혹은 false 중 한가지의 값만 사용가능 하다

        str = "안녕하세요";

//            선언과 동시에 초기화
        int point = 100;


        System.out.println("===========변수에 저장된 값 출력==========");
        System.out.println("bnum의 값:" + bnum);
        System.out.println("bnum의 값:" + snum);
        System.out.println("bnum의 값:" + inum);
        System.out.println("bnum의 값:" + lnum);

        System.out.println("bnum의 값:" + fnum);
        System.out.println("bnum의 값:" + dnum);

//    문자
        System.out.println("ch의값 : " + ch); //문자형식으로 초기화했던변수 'a'
        System.out.println("ch2의 값 :" + ch2);  //숫자형식으로 초기화했던 번수 'b'

        System.out.println("isTrue의 값:" + isTrue);

        System.out.println("str의값 :" + str);

//        '='대입연산자
//            대입연산자의 왼편에는 공간이라는 의미가 있고, 오른편은 값이라는 의미가 있다.
        point = point + 10;
        System.out.println(point);

        System.out.println("point = " + point);
        System.out.println("point = " + point);


    }
}
