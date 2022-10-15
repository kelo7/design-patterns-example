package decorator.finery;

public class Demo {
    public static void main(String[] args) {
        Person person = new Person("PersonA");

        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        tShirts.Decorate(person);
        bigTrouser.Decorate(tShirts);
        bigTrouser.show();
    }
}
