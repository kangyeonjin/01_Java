package yeonjinTest.practice1_0605;

public class Sample2 {
    //리턴값이 없는 메서드
    void sum(int a, int b){
        System.out.println(a+"와"+b+"의 합"+(a+b));
    }

    public static void main(String[] args) {

        Sample2 s = new Sample2();
        s.sum(3, 4);


    }

}
