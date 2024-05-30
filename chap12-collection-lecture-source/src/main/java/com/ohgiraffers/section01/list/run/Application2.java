package com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application2 {
    //linkedlist
    public static void main(String[] args) {

        /* Linkedlist
        * arraylist가 배열을 이용해서
        *  발생할수있는 성능적인 단점을 보완하고자 고안됨
        *
        * 단일연결리스트
        * :저장한 요소가 순서를 유지하지 않고 저장되지만 이러한요소를
        * 사이클 링크로연결하여 구성하며 마치 연결된 리스트 형태인것처럼 만든 자료구조이다
        * 요소의 저장과 삭제시 다음 요소를 가리키는 참조링크만 변경하면 되기 때문에
        * 요소의 저장과 삭제가 빈번히 일어나는경우 arraylist보다 성능면에서 우수하다
        * 단일연결리스트는 다음 요소만 링크하기떄문에 이전 요소로접근이 어렵다
        *
        * 이중연결리스트
        * 단일 연결리스트는 다음 요소만 링크하는 반면 이중 연결리스트는 이전요소도 링크하여
        * 이전단일 요소로 접근하기 쉽게 고안된 자료이다
        * */

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList.size());
        System.out.println(linkedList.size());

        for(int i=0; i <linkedList.size();i++){
            System.out.println(i+linkedList.get(i));
        }

        //remove() 삭제
        linkedList.remove(1);

        for(String s : linkedList){
            System.out.println(s);
        }

        //set()수정
        linkedList.set(0, "");
        System.out.println(linkedList);

        //isEmpty()메소드로 비어있는지 확인가능
        System.out.println(linkedList.isEmpty());

        //clear()리스트내 모든요소삭제가능
        linkedList.clear();
        System.out.println(linkedList.isEmpty());

    }


}
