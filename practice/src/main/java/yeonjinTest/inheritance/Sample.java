package yeonjinTest.inheritance;

class Animal{
    String name;
    void setName(String name){
        this.name = name;
    }
}
class Dog extends Animal{

    void sleep(){
        System.out.println(this.name);
    }
}
class HouseDog extends Dog{

    void sleep(){
        System.out.println(this.name+"zzz");
    }
    void sleep(int hour){
        System.out.println(this.name+hour);
    }
}
public class Sample {
    public static void main(String[] args) {

        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(3);

    }
}
