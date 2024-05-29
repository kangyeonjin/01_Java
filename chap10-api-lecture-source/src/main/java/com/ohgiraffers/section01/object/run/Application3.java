package com.ohgiraffers.section01.object.run;

import java.awt.print.Book;

public class Application3 {
    //Object의 hashCode()
    public static void main(String[] args) {

        /*
        * object클래스의 명세에 작성된 일반 규약에 따르면
        * equals()메소드를 재정의 하는경우 hashcode()메소드도 재정의 하도록 되어있다
        * => 같은 값을 가지는 동등객체는 같은해시코드값을 가져야한다는 규약
        *(강제성은 없지만 규약대로 해주는게 좋다)
        *
        * */

        Book book1 = new Book(1,"홍길동전","허균","50000");
        Book book2 = new Book(1,"홍길동전","허균","50000");

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

    }



}
