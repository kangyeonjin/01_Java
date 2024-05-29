package com.ohgiraffers.section01.object.run;

import java.awt.print.Book;

public class Application01 {
    //object클래스의 tostring

    public static void main(String[] args) {

        /*
        * object
        * 모든 클래스는  object의 후손이다
        *
        * 따라서 object클래스가 가진 메소드를 자신의것처럼사용할수있다
        *또한 부모클래스가 가지는 메소드를 오버라이딩하여 사용하는것도 가능하다
        * object클래스의 메소드중 많이 오버라이딩해서 사용하는 메소드
        *
        * tostring(),equals(),hashcode()
        * */

        Book book1 = new Book(1,"홍길동전","허균",50000);
        Book book2 = new Book(2,"목민심서","정약용",30000);
        Book book3 = new Book(3,"목민심서","정약용",30000);


//        System.out.println("book1="+book1.toString());  //이렇게 생략되있는거임
        System.out.println("book1="+book1);
        System.out.println("book3="+book2);
        System.out.println("book3="+book3);

        System.out.println("========tostring======");
        System.out.println("book1="+book1);
        System.out.println("book2="+book2);
        System.out.println("book3="+book3);
    }

}
