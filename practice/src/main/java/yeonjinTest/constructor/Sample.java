package yeonjinTest.constructor;

class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}
class Dog extends Animal {

    Dog(){
        //생성자 내부에 아무내용이없음 디폴트 생성자
    }
    void sleep(){
        System.out.println(this.name);
    }
}
class HouseDog extends Dog {

    HouseDog(String name){   //메서드명이 클래스명과 동일함,
                             // 리턴자료형을 정의하지 않는 메서드 : 생성자
        this.setName(name);   //void도 사용하지 않음
    }
    HouseDog(int type){
        if(type ==1){
            this.setName("yorkshire");
        }else if(type ==2){
            this.setName("bulldog");
        }
    }

    void sleep(){
        System.out.println(this.name+"zzz");
    }
    void sleep(int hour){
        System.out.println(this.name+hour);
    }
}
public class Sample {
    public static void main(String[] args) {

        HouseDog happy = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(happy.name);
        System.out.println(yorkshire);

//        System.out.println(dog.name);


    }
}
