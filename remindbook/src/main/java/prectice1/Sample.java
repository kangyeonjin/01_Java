package prectice1;

import java.util.function.BiFunction;

public class Sample {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> mc =(a,b) ->a+b;
//        Calculator mc = Integer::sum;
        int result = mc.apply(3, 4);
        System.out.println(result);

    }

}
