package yeonjinTest.practice1_0605;

public class Sample4 {
    void sayNick(String nick){
        if("바보".equals(nick)){
            return;
        }
        System.out.println(nick);
    }
    public static void main(String[] args) {
        Sample4 s = new Sample4();
        s.sayNick("야");
        s.sayNick("바보");  //출력되지 않는다

    }


}
