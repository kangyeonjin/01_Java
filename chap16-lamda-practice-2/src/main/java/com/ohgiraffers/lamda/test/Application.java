package com.ohgiraffers.lamda.test;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;

public class Application {

    public static void main(String[] args) {
        Application app = new Application();
//        app.test1();
//        app.test1_1();
//        app.test2();
//        app.test2_1();
//        app.test3();
//        app.test3_1();
//        app.test4();
//        app.test4_1();
        app.test5();
        app.test5_1();

    }

    /**
     * <pre>
     * @실습문제1
     * 현재시각 HH:mm:ss을 출력하는 람다식을 작성
     * </pre>
     */
    private void test1() {

        //localtime.now() os에 보이지 않는
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

//        System.out.println(LocalTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        //매개변수도 필요없음, 리턴도 필요없음, Runnable, Consumer

    }

    private void test1_1 (){
        //방법1
        Runnable now =()->{
            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        };

        now.run();

        //방법2
        Consumer<LocalTime> now2 = (time) -> {
            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        };
        now2.accept(LocalTime.now());



    }


    //     * @실습문제2
//     * 로또를 생성하는 람다식을 작성하세요. 1~46까지의 숫자가 6개
//     * - 리턴타입 Set<Integer>
    /*set특징 : 중복저장이 허용되지않음
     * treeset특징 : 자동정렬
     * 컬렉션 -> 컬렉션에서 다룰수있는 데이터는기본적으로 객체만 가능 -> integer를 사용한이유*/

    private void test2_1(){

        Set<Integer> lotto =  new TreeSet<>();  //treeset은 자동으로 정렬해줌
        //숫자 6개
//        int num = ((int) (Math.random() * 45) + 1);
//        System.out.println(num);

        //반복문
        while(lotto.size()<6){
            lotto.add((int) (Math.random() * 45) + 1);
        }
        System.out.println("lotto"+lotto);


    }

    private void test2() {

        Supplier<Set<Integer>> lotto = () -> {
            Set<Integer> set =  new TreeSet<>();
            while(set.size()<6){
                set.add((int) (Math.random() * 45) + 1);
            }
         return set;

        };
        Set<Integer> lottoResult = lotto.get();
        System.out.println(lottoResult);


    }

    /**
     * <pre>
     * @실습문제3
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1300원이다.
     * </pre>
     */
    private void test3_1(){

        //입력받을 값
        int won = 3000;

        //환율
      double rate = 1300;

        //달러로환산
        double dollar = won/rate;

        //출력
        System.out.println(won+" "+dollar);


    }


    private void test3() {

        Consumer<Integer> calc = won -> {
            double rate = 1300;
            double dollar = won /rate;
            System.out.println(won+" "+dollar);

        };

    }

    /**
     *
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
     *
     */
    private void test4_1() {

        BiFunction<Integer, Double, Double> calc = (won, rate) ->{
            return won/rate;

        };
        double dollar = calc.apply(3000, 1300.0);
        System.out.println(dollar);

    }

    private void test4(){

        Function<Integer, Double> calc = won -> {
            double rate =  1300;
            return won/rate;

        };
        double dollar = calc.apply(3000);
        System.out.println(dollar);

    }


    /**
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국","   "}를 체크하세요.
     */

    private void test5_1(){

        //List를 만드는방법1
        List<String> strList1 = new ArrayList<>();
        strList1.add("abc");
        strList1.add(" ");
        strList1.add("대한민국");
        strList1.add("      ");

        //List를 만드는방법 2
        //Arrays.asList(): 나열된 값을 리스트로만들어준다
        //asList()로 만든 리스트의 경우, 컬렉션 프레임 워크가 아닌 Arrays클래스 내부의
        //static inner class로 만들어진다-> 추가 , 삭제 불가능/변경만가능
        List<String> strList2 = new ArrayList<>(Arrays.asList("abc", "", "대한민국", "     "));
        List<String> strAsListTest = Arrays.asList("1","2");
//        strAsListTest.add("3");  //추가와 삭제 불가능 변경만가능함
//        strAsListTest.clear();

        //List를 만드는방법 3
        //List.of(): 펙토리 메소드, 나열된 값을 리스트로 만들어준다
        //List.of()로 만든 리스트는 ImmutableCollections객체의 내부 클래스인ListN클래스로 List를 생성
        List<String> strListOfTest = (List.of("1", "2"));
//        strListOfTest.add("3");
        List<String> strList3 = new ArrayList<>(List.of("","","","   "));

        /*
        * list.of(), arrays.aslist()->추가, 삭제 불가능하게 한 이유
        * 불변객체이어야 다른 컬렉션으로 변환이 용이하기 때문
        * */

        //공백을 제외한 문자열의 길이가 0인지 판단
        for(String str : strList1){
            //문자열을 trim() -> 공백을 앞뒤로 다 지우는 기능
            Boolean isLengthZero = str.trim().length() == 0;
            System.out.println(str+""+isLengthZero);


        }


    }

    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", "   ");
        Predicate<String> isLengthZero = str -> str.trim().length() == 0;
        for(String str : strList){
            System.out.println(str+""+isLengthZero.test(str));
        }


    }

}
