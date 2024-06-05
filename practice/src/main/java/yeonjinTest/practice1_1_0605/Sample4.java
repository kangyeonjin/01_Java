package yeonjinTest.practice1_1_0605;

class Updater{

    void update(Counter counter){
        counter.count++;
    }
}

class Counter{
    int count =0;
}

public class Sample4 {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println(myCounter.count);

        Updater myupdater = new Updater();
        myupdater.update(myCounter);
        System.out.println(myCounter.count);


    }

}
