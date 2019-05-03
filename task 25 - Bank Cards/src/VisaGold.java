import java.util.Scanner;

public class VisaGold extends VisaClassic {

    protected String service = "";

    public VisaGold(int serial, int balance, String name, String service) {

        super(serial, balance, name);
        System.out.println(super.name + ", you found a Visa Gold Card. Enter the service you need:");
        service = new Scanner(System.in).nextLine();
        this.service = service;
    }

    @Override
    public String toString() {
        return "Visa Gold, owner " + name +"," +
                " has a special service: " + service;
    }
}
