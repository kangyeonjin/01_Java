package section2;
//- Dice 인터페이스를 구현한 구현체
//- getNumber() 시 무조건 4를 return 해준다
public class HellDice implements Dice{


    @Override
    public int getNumber() {
        return (4);
    }
}
