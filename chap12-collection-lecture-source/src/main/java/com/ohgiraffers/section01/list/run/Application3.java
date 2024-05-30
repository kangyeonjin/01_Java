package com.ohgiraffers.section01.list.run;

import java.util.Stack;

public class Application3 {
    public static void main(String[] args) {

        /*
        * Stack
        * 후입선출(LIFO -last in first out)방식의 자료구조*/

        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
//        integerStack.add(6);

        /*add()도 이용가능하지만 vector의 메소드이다
        * push()를 사용하는것이 좋다*/

        System.out.println(integerStack);

        /*
        * 스택에서 요소를 찾을 때 search()
        * 인덱스가 아닌 위에서 부터의 순번을 의미
        * 가장 상단의 위치가 0이아니라 1부터시작
        * */
        System.out.println(integerStack.search(5));

        /*stack에서 값을 꺼내는 메소드
        * peak() : 해당스택의 가장마지막에 있는 요소를 반환
        * pop() :해당 스택의 가장 마지막에 있는 요소를 반환,반환후 제거 * */

        System.out.println(integerStack.peek());
        System.out.println(integerStack.pop());
        System.out.println(integerStack);

        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());  //다지워졌음

//        System.out.println(integerStack.pop());  //EmptystackException



    }

}
