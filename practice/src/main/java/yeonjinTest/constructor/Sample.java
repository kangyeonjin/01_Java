package yeonjinTest.constructor;

class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}
class Dog extends Animal {

    void sleep(){
        System.out.println(this.name);
    }
}
class HouseDog extends Dog {

    void sleep(){
        System.out.println(this.name+"zzz");
    }
    void sleep(int hour){
        System.out.println(this.name+hour);
    }
}
public class Sample {
    public static void main(String[] args) {

        HouseDog dog = new HouseDog();
        System.out.println(dog.name);


    }
}
