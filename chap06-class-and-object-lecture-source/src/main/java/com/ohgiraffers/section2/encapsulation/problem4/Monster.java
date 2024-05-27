package com.ohgiraffers.section2.encapsulation.problem4;

public class Monster {

    /*
    * 접근제한자
    * 클래스 혹은 클래스의 멤버에 참조 연산자로 접근할수있는 범위를 제한하기 위한 키워드이다
    * 1. public : 모든 패키지에 접근허용
    * 2. protected : 동일 패키지에 접근 허용.단, 상속관계에 있는 경우 다른 패키지에서도 접근가능
    * 3.default : 동일 패키지에서만 접근 허용(작성하지 않으면 default)
    * 4.private : 해당 클래스 내부에서만 접근 허용
    * */

    /*위의 네가지 접근제한자는 클래스의 멤버(필드와 메소드)에 모두 사용가능하다
    * 단. 클래스선언시 사용하는 접근제한자 public/ default가 있음
    * */

    private String kinds;
    private int hp;

    public void setkinds(String kinds){
        this.kinds = kinds;
    }

    public void setHp(int hp){

        if(hp >0){
            this.hp = hp;

        }else{
            this.hp =0;
        }
    }
    public String getInfo(){
        return "몬스터의 종류는"+this.kinds+"이고,체력은"+this.hp+"입니다";
    }



}

