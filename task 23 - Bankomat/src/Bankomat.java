import java.util.Scanner;

public class Bankomat {

    private int twenties = 0, fifties = 0, hundreds = 0, totalMoney = 0;
    private Scanner sc = new Scanner(System.in);

    protected Bankomat(int twenties, int fifties, int hundreds) {
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

    void insertBanknotes() {


        System.out.println("How much twenties to add?");
        this.twenties = sc.nextInt();
        System.out.println("How much fifties to add?");
        this.fifties = sc.nextInt();
        System.out.println("How much hundreds to add?");
        this.hundreds = sc.nextInt();
        this.totalMoney = this.twenties * 20 + this.fifties * 50 + this.hundreds * 100;

    }

    boolean giveMoney() {
        int theRest;
        int atwenties = this.twenties, ahundreds = this.hundreds, afifties = this.fifties;
        boolean exit = false;
        boolean ok = false;
        while (!exit) {
            System.out.println("How much cash do you wish to take? [min 40, multiplе of 10] [999 to exit]");
            int howMuch = sc.nextInt();

            if (howMuch == 999) {
                ok = true;
                exit = true;
                System.out.println("I see you want no cash :(");

                return false;

            }

            if (howMuch % 10 != 0 || howMuch < 40) {
                System.out.println("This number isn't beautiful, try again or [999] to exit");
                exit = false;
            } else {

                System.out.println("Ok, let's try to give you " + howMuch + "...");

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
                    System.out.println("Out of money");
                    this.twenties = atwenties;
                    this.fifties = afifties;
                    this.hundreds = ahundreds;
                    exit = true;
                    ok = false;
                } else {
                    System.out.println("You have " + (ahundreds - this.hundreds) + " of [-100-], " +
                            (afifties - this.fifties) + " of [-50-], " +
                            (atwenties - this.twenties) + " of [-20-]");
                    exit = true;
                    ok = true;
                }

            }
        }
        return ok;
    }


}


