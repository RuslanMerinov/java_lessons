
public class Main {
    public static void main(String[] args) {

        Bankomat bankomat = new Bankomat(0, 0, 0);

        bankomat.insertBanknotes();

        System.out.println(bankomat);


        if (bankomat.giveMoney()) {
            System.out.println("Success!");
        } else {
            System.out.println("Sorry, something went wrong...");
        }

        System.out.println(bankomat);
    }
}