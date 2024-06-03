package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

//키보드로 문자열을 입력받아 사용
//countAlpha 메소드로 문자열 전달하고, 실행결과 받아 출력함.
//반드시 try ~ catch 문 사용.
//체크할 문자열 안에 공백 포함할 수 없습니다."

public class Run {

    public void test1() {
        Scanner scanner = new Scanner(System.in);
        CharcterProcess charcterProcess = new CharcterProcess();

        System.out.println("문자열을 입력하세요 :");
        String input = scanner.nextLine();

        try {
            int count = charcterProcess.countAlpha(input);
            System.out.println(count);
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());

        }
    }
    public static void main(String[] args){
        Run  run = new Run();
        run.test1();
    }
}
