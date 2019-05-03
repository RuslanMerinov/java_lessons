public class VisaUnembossed {



    private int serial = 0;
    protected int balance;


    public VisaUnembossed(int serial, int balance) {
        this.serial = serial;
        this.balance = balance;
    }

    public int getSerial() {
        return serial;
    }

    public int getBalance() {
        return balance;
    }

    public void income (int sum) {this.balance +=sum;}

    void outcome (int sum) {this.balance -=sum;}

    @Override
    public String toString() {
        return "Visa Unembossed {" +
                " balance = " + balance +
                '}';
    }
}
