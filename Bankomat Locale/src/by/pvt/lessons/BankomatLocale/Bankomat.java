package by.pvt.lessons.BankomatLocale;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Bankomat {
    private String country = "", language = "";
    private int twenties, fifties, hundreds, totalMoney;
    private Scanner sc = new Scanner(System.in);

    Bankomat(int twenties, int fifties, int hundreds) {
        this.twenties = twenties;
        this.fifties = fifties;
        this.hundreds = hundreds;
        this.totalMoney = this.twenties * 20 + this.fifties * 50 + this.hundreds * 100;

    }

    @Override
    public String toString() {
        return "Bankomat{" +
                "twenties=" + twenties +
                ", fifties=" + fifties +
                ", hundreds=" + hundreds +
                '}' + " Total money: " +
                (this.twenties * 20 + this.fifties * 50 + this.hundreds * 100);
    }

    void turnOn() {

        boolean check = false;
        while (!check) {
            System.out.println("Select language / Выберите язык");
            System.out.println("1 - English / Английский");
            System.out.println("2 - Russian / Русский");

            int i = 0;
            try {
                i = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("Incorrect input / Неверный ввод");
            }
            if (i == 1) {
                country = "US";
                language = "EN";
                check = true;
            }
            if (i == 2) {
                country = "RU";
                language = "RU";
                check = true;
            }
            if (i != 1 && i != 2) {
                System.out.println("Try again / Попробуйте еще раз");
            }
        }


    }

    void insertBanknotes() {
        Locale current = new Locale(language, country);
        Locale.setDefault(current);
        System.out.println(current.getCountry());
        ResourceBundle rb = ResourceBundle.getBundle("texto");
        System.out.println(rb.getString("str1"));
        this.twenties = sc.nextInt();
        System.out.println(rb.getString("str2"));
        this.fifties = sc.nextInt();
        System.out.println(rb.getString("str3"));
        this.hundreds = sc.nextInt();
        this.totalMoney = this.twenties * 20 + this.fifties * 50 + this.hundreds * 100;

    }

    boolean giveMoney() {
        ResourceBundle rb = ResourceBundle.getBundle("texto");
        int theRest;
        int atwenties = this.twenties, ahundreds = this.hundreds, afifties = this.fifties;
        boolean exit = false;
        boolean ok = false;
        while (!exit) {
            System.out.println(rb.getString("str4"));
            int howMuch = sc.nextInt();

            if (howMuch == 999) {

                System.out.println(rb.getString("str5"));

                return false;

            }

            if (howMuch % 10 != 0 || howMuch < 40) {
                System.out.println(rb.getString("str6"));
                exit = false;
            } else {

                System.out.println(rb.getString("str7") + howMuch + "...");

                theRest = howMuch % 100;
                this.hundreds -= (howMuch / 100);

                switch (theRest) {

                    case 10:
                        this.hundreds++;
                        this.fifties -= 1;
                        this.twenties -= 3;
                        break;

                    case 20:
                        this.twenties--;
                        break;

                    case 30:
                        this.hundreds++;
                        this.fifties -= 1;
                        this.twenties -= 4;
                        break;

                    case 40:
                        this.twenties -= 2;
                        break;

                    case 50:
                        this.fifties--;
                        break;

                    case 60:
                        this.twenties -= 3;
                        break;

                    case 70:
                        this.fifties--;
                        this.twenties--;
                        break;

                    case 80:
                        this.twenties -= 4;
                        break;

                    case 90:
                        this.fifties--;
                        this.twenties -= 2;
                        break;


                }

                if (this.hundreds < 0) {
                    this.fifties += this.hundreds * 2;
                    this.hundreds = 0;

                }
                if (this.fifties < 0) {
                    if (this.fifties % 2 == 0) {
                        this.twenties += (this.fifties / 2) * 5;
                        this.fifties = 0;
                    } else {

                        this.twenties += (this.fifties / 2) * 5 - 5;
                        this.fifties = 1;
                    }
                }

                if (this.twenties < 0) {
                    System.out.println(rb.getString("str8"));
                    this.twenties = atwenties;
                    this.fifties = afifties;
                    this.hundreds = ahundreds;
                    exit = true;
                    ok = false;
                } else {
                    System.out.println(rb.getString("str9") + (ahundreds - this.hundreds) + " -> [-100-], " +
                            (afifties - this.fifties) + " -> [-50-], " +
                            (atwenties - this.twenties) + " -> [-20-]");
                    exit = true;
                    ok = true;
                }

            }
        }
        return ok;
    }


}



