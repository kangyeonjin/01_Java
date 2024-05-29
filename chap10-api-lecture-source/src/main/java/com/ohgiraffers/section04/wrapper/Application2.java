package com.ohgiraffers.section04.wrapper;

public class Application2 {

    //파싱에대해 이해할수있다
    public static void main(String[] args) {

        /*파싱
        * 문자열값을 기본자료형값으로 변경하는것을 pasing이라고함*/

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");  //8l안됨
        float f = Float.parseFloat("4.0f");  //4.0f 는됨
//        double d = double.parseDouble(8.0);
//        boolean b1 = boolean.parseBoolean(true);

        char c = "abc".charAt(0);


    }
}
