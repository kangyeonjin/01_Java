package com.ohgiraffers.product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class App {

    List<Product> list = List.of(
            new Product("아이폰X", "apple", "전자기기류", 1000000),
            new Product("맥프로", "apple", "전자기기류", 6300000),
            new Product("베지밀", "정식품", "음료류", 1000000),
            new Product("파스타면", "de cecco", "식품류", 10000),
            new Product("LG G7", "LG", "전자기기", 700000),
            new Product("기계식키보드", "LEOPOLD", "전자기기류", 100000),
            new Product("고양이", "베르나르베르베르", "도서", 15000),
            new Product("간다, 봐라", "법정스님", "도서", 8900),
            new Product("까페라떼", "디초코", "음료류", 4000),
            new Product("아포가토", "디초코", "디저트류", 4500)
    );

    public static void main(String[] args) {

        App app = new App();

        // 1.전자기기류만 모두 출력하세요.(특정 문자만 출력하기)
        app.list.stream()
                .filter(Product -> Product.getCategory().equals("전자기기류"))
                .forEach(System.out::println);

//        List<String> electronics = list.stream().map(Product::getProductName).toList();
//        System.out.println(electronics);
        //apple사를 필터한다
        //금액리스트를 뽑는다
        //10%할인한다
        //제품명과 할인가격을 출력한다

        app.list.stream()
                .filter(product -> product.getPrice().equals("apple"))
                .map(Product -> (Product.getPrice()*0.9));
                .forEach(System.out::println);

//        // 이름 변경하기 (상표명 dechocolatecoffee > dechocolatecoffee)
//        app.list.stream().forEach(Product -> Product.getBrand.equals("dechocolatecoffee")){
//            Product.setBrand("dechocolatecoffee")};

//
//        //4.금액이 십만원 이상인 상품을 따로 list로 생성하고 출력하세요.
//        List<Product> price10 = stream().filter(Product-> Product.getPrice() >100000)
//                .sorted()
//                .toList();


    }
}




