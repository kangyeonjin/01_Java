package section2.variable;

import org.w3c.dom.ls.LSOutput;

public class Application {
public static void main(String[] args) {
    /*
     * 변수의 사용목적
     * 1. 값에 의미를 부여하기 위한 목적(의미전달이 쉬워야 코드를 읽기 쉬워지고,
     *    협업및 유지보수에 유리하기 때문이다)
     * 2. 한번 저장해둔 값을 재사용 하기ㅜ이한 목적(변수를 이용하여 코드를 작성하면, 값을 변경할때도 보다 간편하게 변경할수있다.
     * 3. 시간에 따라 변하는 값을 저장하고 사욯할수있다(변수는 변하는 값을 저장하기 위한 공간이다.
     * */

    System.out.println("===========값에 의미 부여 테스트==========");
    System.out.println("보너스를 포함한 급여 : "+ (3000000 + 200000) + "원");

    int salary = 3000000;
    int bonus = 200000;
    System.out.println("보너스를 포함한 급여 : " + (salary+bonus)+"원");

    System.out.println("===========변수에 저장한 값 재사용 테스트==========");
//            10명의 고객에게 100 포인트를 지급해주는 내용을 출력
    System.out.println("1번고객에게 100포인트를 지급하였습니다");
    System.out.println("2번고객에게 100포인트를 지급하였습니다");
    System.out.println("3번고객에게 100포인트를 지급하였습니다");
    System.out.println("4번고객에게 100포인트를 지급하였습니다");
    System.out.println("5번고객에게 100포인트를 지급하였습니다");
    System.out.println("6번고객에게 100포인트를 지급하였습니다");
    System.out.println("7번고객에게 100포인트를 지급하였습니다");
    System.out.println("8번고객에게 100포인트를 지급하였습니다");
    System.out.println("9번고객에게 100포인트를 지급하였습니다");
    System.out.println("10번고객에게 100포인트를 지급하였습니다");


    System.out.println("===========변수 사용해서 출력==========");
    int point = 200;
    System.out.println("1번고객에게 "+ point +"포인트를 지급하였습니다");
    System.out.println("2번고객에게 "+ point +"포인트를 지급하였습니다");
    System.out.println("3번고객에게 "+ point +"포인트를 지급하였습니다");
    System.out.println("4번고객에게 "+ point +"포인트를 지급하였습니다");
    System.out.println("5번고객에게 "+ point +"포인트를 지급하였습니다");
    System.out.println("6번고객에게 "+ point +"포인트를 지급하였습니다");
    System.out.println("7번고객에게 "+ point +"포인트를 지급하였습니다");
    System.out.println("8번고객에게 "+ point +"포인트를 지급하였습니다");
    System.out.println("9번고객에게 "+ point +"포인트를 지급하였습니다");
    System.out.println("10번고객에게 "+ point +"포인트를 지급하였습니다");

    System.out.println();

//    변수는 하나의 값을 저장하고 사용하기 위한 공간이기 보다, 변하는 값을 저장하기위한 공간이다
    System.out.println("========변수에 저장된 값 변경테스트==========");
    System.out.println();
    int sum = 0;

    sum = sum +10;
    System.out.println("sum에 10을 더하면 현재 sum의 값은?"+ sum);

    sum = sum +10;
    System.out.println("sum에 10을 더하면 현재 sum의 값은?"+ sum);

    sum = sum +10;
    System.out.println("sum에 10을 더하면 현재 sum의 값은?"+ sum);


}
}
