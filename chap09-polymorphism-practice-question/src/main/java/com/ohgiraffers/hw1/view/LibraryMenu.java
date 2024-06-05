package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm;
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
//        프로그램 실행 시 가장 먼저 호출되
//        는 메소드로 회원 이름, 나이, 성별을
//        입력받아 LibraryManager의
//        insertMember 메소드로 전달
//        무한 반복 메뉴를 출력하여 각 메뉴
//        버튼 선택 시 해당 메소드 호출
//        (클래스 구조 참고)

//        이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
// LibraryManager의 insertMember() 메소드에 전달
//==== 메뉴 ====
//        마이페이지  // 무한 반복 실행
//        도서 전체 조회  // LibraryManager의 myInfo() 호출하여 출력
//        도서 검색 // LibraryMenu의 selectAll() 호출
//        도서 대여하기 // LibraryMenu의 searchBook() 호출
//        프로그램 종료하기 // LibraryMenu의 rentBook() 호출
//






    }
    public void selectAll(){
// LibraryManager의 selectAll 메소드 호출
//→ 결과 값을 Book[] 자료형으로 받아준 뒤
// for문을 통해 도서 전체 목록 출력
//➔ Book[] bList = lm.selectAll();

// for문 이용하여 bList의 모든 도서 목록 출력
// 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
// ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true

        LibraryManager libraryManager = new LibraryManager();
        libraryManager.selectAll();



    }

    public void searchBook(){
//→ 결과 값을 Book[] 자료형으로 받아준 뒤 향상된 for문을 이용하여 출력

        System.out.println("제목을 입력하세요 : ");
        Scanner sc =new Scanner();
        sc.nextLine();
// 키워드를 LibraryManager의 searchBook 메소드로 전달


// Book[] searchList = lm.searchBook(keyword);



// for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
// NullPointerException 발생 시 오류 해결하시오 ㅎㅎ


    }

    public void rentBook(){
// 대여할 도서 인덱스를 입력 받아
// LibraryManager의 rentBook 메소드로 전달
//→ 결과 값을 result로 받아
// result가 0일 경우, 1일 경우, 2일 경우 각각에 해당하는 출력문 출력

// 도서대여를 위해 도서번호를 알아야된다. → selectAll() 메소드 호출

        System.out.println("대여할 도서 : ");
        Scanner sc =new Scanner();
        sc.nextInt();  //입력 받음 (index)


// LibraryManager의 rentBook() 에 전달

// 그 결과 값을 result로 받고 그 result가
// 0일 경우 → “성공적으로 대여되었습니다.” 출력
// 1일 경우 → “나이 제한으로 대여 불가능입니다.” 출력
// 2일 경우 → “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.
//  마이페이지를 통해 확인하세요” 출력




    }


}
