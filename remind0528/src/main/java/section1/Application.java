package section1;

public class Application {

    public static void main(String[] args) {

        SaveProvider saveProvider = new FileSaveProvider();

        Person person = new Person(saveProvider);

        person.doSomething();
    }

}
