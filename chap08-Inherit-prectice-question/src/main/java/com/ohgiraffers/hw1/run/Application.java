package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //for
        //위의 사용데이터 참고하여 3명의 학생정보 초기화
        //위의 학생정보 모두 출력

        StudentDTO[] stu = new StudentDTO[3];  //배열생성

        stu[0] = new StudentDTO("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
        stu[1] = new StudentDTO("김말똥", 21, 187.3, 70, 35, "경영학과");
        stu[2] = new StudentDTO("강개순", 23, 167.0, 45, 4, "정보통신학과");

//        StudentDTO student  = new StudentDTO();
//        student.StudentDTO(stu);

        for(StudentDTO s : stu){ //for문 사용 배열 반복
            System.out.println(s);
        }

        //while(true)
        //사원들의 정보를 키보드로 계속 입력받고
        //계속 추가할것인지 물어보고, 대소문자 상관없이 y이면 계속 객체추가
        //한명씩 추가 될때마다 카운트함

        Scanner sc = new Scanner(System.in);    //입력받을꺼임
        EmployeeDTO[] em = new EmployeeDTO[10];   //배열 지정

        em[0] = new EmployeeDTO("박보검", 26, 178.2, 70, 100000000, "영업부");
        em[1] = new EmployeeDTO("강동원", 38, 187.3, 70, 200000000, "기획부");

        int count = 0;

        while (true) {
            System.out.print("사원 정보를 입력하세요 ");
            System.out.println("1. 이름");
            String name = sc.nextLine();

            System.out.println("2. 나이");
            int age = sc.nextInt();

            System.out.println("3. 신장");
            double height = sc.nextDouble();

            System.out.println("4. 몸무게");
            double weight = sc.nextDouble();

            System.out.println("5.급여");
            int salary = sc.nextInt();

            System.out.println("6.부서 ");
            String dept = sc.nextLine();

            em[count] = new EmployeeDTO( name, age, height, weight,salary,dept);
            count++;

             System.out.println("계속 추가 하시겠습니까? 1.예, 2.아니오");
             int add = sc.nextInt();

             if (add == 1){
                 break;
             }

            //2명정도의 사원정보를 입력받아 객체 배열에 저장
            //현재 기록된 사원들의 정보를 모두 출력

            for(EmployeeDTO e : em){ //for문 사용 배열 반복
                System.out.println(e.toString());
            }
        }
    }

}
