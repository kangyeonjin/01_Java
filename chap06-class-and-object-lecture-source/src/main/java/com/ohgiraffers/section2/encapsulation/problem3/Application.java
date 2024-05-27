package com.ohgiraffers.section2.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {

        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(200);

        Monster monster2 = new Monster();
        monster1.setInfo("프랑켄슈타인");
        monster1.setHp(300);

        Monster monster3 = new Monster();
        monster1.setInfo("미이라");
        monster1.setHp(400);

        Monster monster4 = new Monster();
        monster1.setInfo("늑대인간");
        monster1.setHp(500);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());
        System.out.println(monster4.getInfo());

        //사람이 실수해서 hp를 음수로 만드는 문제를 해결
        //필드명을 수정했을 때 필드를 직접적으로 사용하는 다른클래스에서 comple error가 나와서
        //유지보수가 어려워지는 문제는 해결

        //하지만 여전히 필드에 직접적으로 접근할수있기 때문에 완벽히 문제가 해결되지 않음

        monster1.kinds = "두치";
        monster1.hp = 1000;

        System.out.println(monster1.getInfo());
    }

}
