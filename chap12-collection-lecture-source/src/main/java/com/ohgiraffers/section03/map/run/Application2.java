package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /*
        * properties
        * HashMap을 구현하여 사용용법이 거의유사하다
        * key-value 모두 문자열만 사용 할수잇는 자료구조이다
        * 설정파일의 값을 읽어서 어플리케이션에 적용할떄 사용한다
        * */

        Properties prop = new Properties();

        prop.setProperty("driver","orecle.jdbc.driver.OracleDriver");
        prop.setProperty("url","jdbc:oracle:thin:@127.0.0.1:1521:XE");
        prop.setProperty("user","oracle");
        prop.setProperty("password","student");

        System.out.println(prop);

//        try {
//
//            prop.store(new FileOutputStream("driver.dat"),"jdbc driver");
//            prop.store(new FileWriter("driver.txt"),"jdbc driver");
//            prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");
//
//
//        } catch (IOException e) {
//
//            throw new RuntimeException(e);
//        }

        Properties prop2 = new Properties();

        try {

            prop2.load(new FileInputStream("driver.dat"));
            prop2.load(new FileReader("driver.txt"));
//            prop2.loadFromXML(new FileInputStream("driver.xml"));
            System.out.println("prop2 : "+prop2);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }

}
