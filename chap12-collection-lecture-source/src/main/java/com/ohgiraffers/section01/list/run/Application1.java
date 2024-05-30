package com.ohgiraffers.section01.list.run;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        * 컬렉션 프레임 워크
        * 자바에서 컬렉션 프레임워크는 여러개의 다양한 데이터들을 쉽고 효과적으로 처리할수있도록
        * 표준화된 방법을 제공하는 클래스들의 집합이다
        * >데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스
        * */

        /*
        * 컬렛션 프레임워크는 크게 3가지 인터페이스중 한가지를 상속받아 구현해두었다
        * 1. list
        * 2. set
        * 3. map
        * list인터페이스와 set인터페이스의공통부분을 컬렉션 인터페이스에서 정의
        * 하지만 map은 구조상의 차이로 컬렉션 인터페이스에서 정의되지않음*/

        /*
        * 각 인터페이스별 특징
        * list인터페이스
        * 순서가 있는 데이터의 집합으로 데이터의 중복저장을 허용
        * vector, arraylist,linkedlist, stack, queue등이있다
        * set인터페이스
        * 순서가 없는 데이터의 집합으로 데이터의 중복을 허용하지 ㅇ낳는다
        * hashset treeset
        * map인터페이스
        * 키와 값한쌍으로 이루어지는 데이터 집합이다
        * key를 set방식으로 관리하기 때문에 데이터순서를 관리하지않고
        * 중복된 key를 허용하지 않는다
        * hasykey, treemap, hashtable, properties*/

        /*Array list
        * 배열의 단점을 보완하기 위해 만들어졌다
        * 배열의 단점: 크기변경불가, 요소의 추가 , 수정, 삭제, 정렬이 복잡
        * 크기변경(새로운 더큰 배열을 만들고 옮기기),요소의 추가, 수정,삭제, 정렬기능을 미리 메소드로 구현해서 제공
        *
        * */

        ArrayList<Object> alist = new ArrayList<>();

        /*다형성을 적용해 상위 레퍼런스로 arraylist객체를 만들수있다
        * list인터페이스 하위의 다양한 구현체들로 타입변경이 가능하기 떄문에
        * 레퍼런스 타입은 list로 해두는게 더 유연한 코드를 작성가능하다*/

        List<Object> list = new ArrayList<>();

        /*arraylist는 저장순서가 유지되며, index(순번)이 적용된다*/
        /**/
        list.add("apple");
        list.add(123);
        list.add(45.6);
        list.add(LocalDateTime.now());

//     tostring 메서드가 오버라이딩 되어있음

        System.out.println(list);

        //arraylist의 크기는 size() 확인할수있다
        //size()는 사실 요소의 갯수를 반환한다
        System.out.println(list.size());

        //인덱스가 지정되어있기 때문에 for문으로 접근가능
        for(int i=0; i < list.size();i++){
            System.out.println(list.get(i));
        }

        //arraylist는 데이터의중복저장을 허용한다
        list.add("apple");
        System.out.println(list);

        /*원하는 이덱스 위치에 값을 추가할수있다
        * 새로운 값이 들어가는 인덱스 위치에 값을 넣고,
        * 이후 인덱스는 하나씩 뒤로 미리게됨
        * */
        list.add(1, "banana");
        System.out.println(list);

        /*
        * 저장된 값을 삭제할때는 remove()메서드를 사용한다
        * 중간 인덱스의 값을 삭제할 경우 자동으로 인덱스를 하나씩 앞으로 당긴다
        * */
        list.remove(2);
        System.out.println(list);

        //모든 컬렉션 프레임워크 클래스는제네릭 클래스로 작성되어있다
        List<String> Stringlist = new ArrayList<>();
        //타입을 지정해서 타입 이외의 인스턴스는 저장하지 않을수있다
        //stringlise.add(123);
        Stringlist.add("apple");
        Stringlist.add("orange");
        Stringlist.add("banana");
        Stringlist.add("mango");
        Stringlist.add("grape");

        System.out.println(Stringlist);

        //sort 정렬

        /*
        * collection >인터페이스 > 바로 사용불가
        * collection 클래스 사용 > collection 사용 되는 기능을 static 메서드로 구현한 클래스
        * */
        Collections.sort(Stringlist);
        Collections.reverse(Stringlist);

        System.out.println(Stringlist);

        /*
        * Arraylist에는 역순으로 정렬하는 기능이 제공되지않음
        * linkedlist decendingInterator()메소드를 사용하면
        * 내림차순으로 정렬된 Interator타입의 목록으로 반환된다*/

        /*Interator는
        * Colection인터페이스의 interator()메소드를 이용해서 인스턴스를 생성할수있다
        * 컬렉션에서 값을 읽어오는 방식을 통일되게 제공하기 위해서 사용
        *
        * hasNext(); 다음요소를 가지고있는경우 true, 더이상 요소가 없는 경우false 반환
        * next() 다음요소 반환
        * */

        List<String> stringList = new LinkedList<String>();

        Iterator<String> dIter = ((LinkedList<String>) Stringlist).descendingIterator();
        List<String> descList = new ArrayList<>();

        while (dIter.hasNext()){
            descList.add(dIter.next());
        }
        System.out.println(descList);



    }

}
