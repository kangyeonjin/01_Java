package com.ohgiraffers.section03.use;

import java.io.*;

public class Application01 {

    //io패키지에서 예외처리(외부로 입출력, 연결할때  많이 사용)
    public static void main(String[] args) {

        BufferedReader in = null;

        try{
            //filereader차를 클래스에 fileNotFoundException을
            // throw해놓아서 try-catch로 예외처리를 해주어야함
            in = new BufferedReader(new FileReader("test.dat"));
            //파일을 읽어서 저장할 문자열
            String s;

            //파일을 한줄씩 읽어서 출력하는 기능
            while ((s = in.readLine())!= null){
                System.out.println(s);
            }

        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (IOException e) {

            //IOException
            //in-out 예외클래스
            //catch블럭은 여러개 작성할때, 상위타입이 하단에 오고, 후손타입이 상단에 온다
            throw new RuntimeException(e);

        }finally {
            /*
            * finally
            * 예외처리 구문과 상관없이 반드시 수행하는 경우 작성한다
            * 보통사용한 자원을 반납할 목적으로 사용된다
            *
            * */
            try {

                // BufferReader 객체가 없을때를 대비해서 조건문으로 작성
                // 자원반환
                in.close();

            }catch (IOException e){
                throw new RuntimeException(e);
            }

        }


    }
}
