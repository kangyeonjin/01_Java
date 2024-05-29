package section2;

public class Application {
    public static void main(String[] args) {

        Dice dice = new HellDice();

        Dicer dicer = new Dicer(dice);

        dicer.thowDice();

    }

}
