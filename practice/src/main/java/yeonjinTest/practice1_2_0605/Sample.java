package yeonjinTest.practice1_2_0605;

class Animal {
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animal{

    void sleep(){
        System.out.println(this.name+"zzz");
    }
}

public class Sample {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}
