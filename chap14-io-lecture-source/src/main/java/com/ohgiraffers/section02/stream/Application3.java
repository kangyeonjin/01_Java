package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    //fileoutputStream
    public static void main(String[] args) {

        /*
        * fileOutPutStream
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의스트림
        * 바이트 단위로 데이터를 처리한다
        * */

        FileOutputStream fout = null;
        try {

            //OutputStream의 경우 대상파일이 존재하지않으면 파일을 자동으로 생성
            //두번째 인자로 true를 전달하면 이어쓰기가된다
            //기본값은 false이다

            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream",true); //true가있어야만 덮어쓰지않고 이어씀

            fout.write(97);

            //10 :개행문자
            byte[] barr = {10,98, 99, 100, 101, 102, 10, 103, 10};
            fout.write(barr);
            //1번인덱스에서 3의 길이만큼파일에 작성됨
            fout.write(barr, 1,3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
