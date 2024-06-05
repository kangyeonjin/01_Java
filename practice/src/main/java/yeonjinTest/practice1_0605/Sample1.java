public static class Sample1 {

    //입력값이 없는 메서드
    String say() {
        return "hi";
    }

}
public static void main(String[] args){
        Sample1 sample1 =  new Sample1();
        String a = sample1.say();
        System.out.println(a);

    }


