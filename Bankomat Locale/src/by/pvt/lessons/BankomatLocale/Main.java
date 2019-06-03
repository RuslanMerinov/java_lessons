package by.pvt.lessons.BankomatLocale;

import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

        Bankomat bankomat = new Bankomat(0, 0, 0);

        bankomat.turnOn();

        bankomat.insertBanknotes();

        System.out.println(bankomat);

        ResourceBundle rb = ResourceBundle.getBundle("texto");

        if (bankomat.giveMoney()) {
            System.out.println(rb.getString("str10"));
        } else {
            System.out.println(rb.getString("str11"));
        }

        System.out.println(bankomat);
    }
}