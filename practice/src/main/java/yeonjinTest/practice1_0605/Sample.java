package yeonjinTest.practice1_0605;

class Animal {

    String name;  //2

    public void setName(String name) {
        this.name = name;    //4
    }

}

 public class Sample {
        public static void main(String[] args) {

            Animal cat = new Animal();  //1

            cat.setName("boby");   //5 메서드호출

            System.out.println(cat.name);  //3

        }
    }



