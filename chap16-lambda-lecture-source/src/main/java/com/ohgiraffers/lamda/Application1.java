package com.ohgiraffers.lamda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Application1 {
    public static void main(String[] args) {

        Application1 app = new Application1();
        app.test1();
        app.date1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();

    }

//    <pre>
//     * @실습문제1
//     * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
//     * </pre>

    private void test1() {

//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
//        String formattedNow = now.format(formatter);
//        System.out.println(formattedNow);

    }

    private void date1() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS")  ;
    Consumer<LocalDateTime> datetime = date -> System.out.println(date.format(formatter));
    datetime.accept(LocalDateTime.now());

    }

//로또를 생성하는 람다식을 작성하세요.
//1~45까지 무작위로 6개의숫자를 선택함
//리턴타입 Set<Integer>
//중복을 없애라

    private void test2() {

        int[] lotto = new int[6];
        Random random = new Random();

        for(int i = 0; i <lotto.length; i++){
            lotto[i] = random.nextInt(45)+1;

            for(int j =0 ; j <i; j++){
                i--;
                break;
            }
        }

        System.out.println(Arrays.toString(lotto));

    }

    private void lottoNum(){

        Supplier<Set<Integer>> lotto = () -> {
            Set<Integer> set = new TreeSet<>();
            while (set.size() < 6) {
                set.add((int) (Math.random() * 45 + 1));
            }
            return set;
        };
        System.out.println("lotto = " + lotto.get());

    }

//     <pre>
//     * @실습문제3
//     * 원화 입력시 환율 계산을 통해
//     얻어진 달러를 출력하는 람다식을 작성
//     * 현재 1달러는 1350원이다. -> 환율은

    //원화로 변경 : 달러 금액 x 환율 = 원화 금액
    //달러로 변경 : 원화 금액 / 환율 = 달러 금액



    private void test3() {

        int kmoney;
        double dmoney = 1350;  //환율계산이후 변수
        double money;

        System.out.println("금액을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        kmoney = sc.nextInt();

        money = kmoney/dmoney;

        System.out.println(money);

    }

    public void exChange(){
        Supplier<Double> exchange = () -> 1350.0;
        Function<Double, Double> convertToUSD = km -> km/exchange.get();



    }



//     * 환율계산 문제를 jdk가 제공하는
//     Function 함수형인터페이스 형식에 맞게 변형하세요.

    private void test4() {
        Function<Integer, Double> calc = won -> {
            double rate = 1350;
            return won /rate;
        };
        double dollar = calc.apply(3000);
        System.out.println(dollar);


    }

//     * 공백을 제외한 문자열의 길이가
//     0인지를 체크하는 람다식을 만들고,
//     * 문자열리스트 {"abc","","대한민국","   "}를 체크하세요.

    private void test5() {
        List<String> strList = Arrays.asList("abc", "", "대한민국", "   ");
        Predicate<String> isLen0 = str -> str.trim().length() == 0;

        for (String str : strList) {
            System.out.println("[" + str + "]의 길이는 0입니까? " + isLen0.test(str));
        }


}}
