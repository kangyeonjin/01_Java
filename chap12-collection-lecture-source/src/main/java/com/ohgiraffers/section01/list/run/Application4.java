package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application4 {
    public static void main(String[] args) {
        /*
        * Queue
        * 선입선출(FIFO -first in first out)방식의 자료구조
        * queue 인터페이스를 상속받는 하위 인터페이스를
        * deque, blockingqueue, transferqueue등
        * 대부분의 큐는 linkedlist를 이용한다
        * */

//        Queue<String> que = new Queue<String>() {

            Queue<String> que = new LinkedList<>();
            //offer()를 통해 데이터를 넣는다
        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("forth");
        que.offer("fifth");

        System.out.println(que);

        /*큐에서 데이터를 꺼내는 방식
        * peek(): 해당큐에 가장 앞에있는 요소(먼저들어온 요소)를 반환
        * poll() :해당큐에 가장 앞에 있는 요소(먼저들어온 요소)를 반환, 반환후 제거*/

        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que);



    }
}
