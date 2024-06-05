package yeonjinTest.practice1_1_0605;

class Animal {

    String name;
    public void setName(String name){
        this.name = name;
    }

}
public class Sample{
    public static void main(String[] args) {

        Animal cat = new Animal();
        cat.setName("boby");  //호출
        System.out.println(cat.name);

    }
}

