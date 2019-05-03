

public class VisaClassic extends VisaUnembossed {
    public String name;



    public VisaClassic(int serial, int balance, String name) {
        super(serial, balance);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Visa Classic {" +
                "name='" + name + '\'' +
                ", balance= " + balance +
                '}';
    }

    void payAbroad(int sum) {
        sum *= 10;
        this.balance -= sum;
    }

}
