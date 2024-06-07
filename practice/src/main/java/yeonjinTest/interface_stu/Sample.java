package yeonjinTest.interface_stu;
//난 동물원의 사육사이다
//육식동물이 들어오면 난 먹이를 던져준다
//호랑이가 오면 사과를 던져준다
//사자가 오면 바나나를 던져준다
interface Predator{
    String getFood();

    default void printFood(){
        System.out.println(getFood());
    }

    int LEG_COUNT =4;  //인터페이스 상수
    static int speed(){
        return LEG_COUNT * 30;
    }

}
interface Barkable{
    void bark();

}

class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}


class Tiger extends Animal implements Predator,Barkable{

    @Override
    public String getFood() {
        return "apple";
    }

    @Override
    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Animal implements Predator,Barkable{

    @Override
    public String getFood() {
        return "banana";
    }

    @Override
    public void bark() {
        System.out.println("으르렁");
    }
}

class Zookeeper{
    public void feed(Predator predator){
        System.out.println("feed"+predator.getFood());
    }

}

class Bouncer{
    void barkAnimal(Animal animal){
        if(animal instanceof  Tiger){
            System.out.println("어흥");
        } else if (animal instanceof  Lion) {
            System.out.println("으르렁");
        }
    }
    void barkAnimal(Barkable animal){
        animal.bark();
    }
}

public class Sample {

    public static void main(String[] args) {

        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zookeeper.feed(tiger);
        zookeeper.feed(lion);

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal((Barkable) tiger);
        bouncer.barkAnimal((Barkable) lion);

    }
}
