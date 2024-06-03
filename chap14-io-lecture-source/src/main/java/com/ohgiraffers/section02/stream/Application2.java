package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
    public static void main(String[] args) {
        /*
        * filereader
        * fileinjputstream 과 사용하는 방법이 거의 동일하다
        * 단. byte단위가 아닌 character단위로 읽어들이는 부분이 차이점
        * >2바이트이던 3바이트이던 글자단위로 읽어오기 때문에 한글도 정상적으로 읽을수있다
        * */

        FileReader fr = null;
        try {
            fr =  new FileReader("src/main/java/com/ohgiraffers/section02/stream/testReader" );

//            int value;
//            while ((value = fr.read())!= -1){
//                System.out.println((char)value);
//            }

            int size = (int) new File("src/main/java/com/ohgiraffers/section02/stream/testReader").length();
            System.out.println("size = " + size);
            char[] carr = new char[size];

            fr.read(carr);

            for(int i =0; i < carr.length;i++){
                System.out.println(carr[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

            //자원반납
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
