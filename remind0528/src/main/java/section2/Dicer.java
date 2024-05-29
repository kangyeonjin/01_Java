package section2;

//- Dice를 매개변수로 받는다.
//- 해당 Dice의 getNumber()를 통해 정수를 반환받고
//- dice Number를 출력해준다.
public class Dicer {

    private Dice dice;

    public Dicer(Dice dice){
        this.dice = dice;
    }

    public void thowDice(){

        int diceNumber = dice.getNumber();

        System.out.println(diceNumber);

    }


}
