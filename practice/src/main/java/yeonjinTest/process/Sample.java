package yeonjinTest.process;

public class Sample extends Thread {

    int seq;

    public Sample(int seq){
        this.seq = seq;
    }

    public void run(){
        System.out.println(this.seq+"thread start");  //스레드 시작

        try{
            Thread.sleep(1000);  // 1초대기
        }catch (Exception e){

        }
        System.out.println(this.seq+"thread end");  //스레드 종료
    }

    public static void main(String[] args) {

        for(int i=0; i <10; i++){         //총 10개의 스레드를 생성하여 실행함
            Thread t = new Sample(i);
            t.start();
        }
        System.out.println("main end" );  //main종료
    }

}
