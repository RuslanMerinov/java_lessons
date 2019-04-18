import java.util.Scanner;

public class MoneyCase {

    public static void main(String[] args) {
        boolean key = true;
        while (key) {
            System.out.println("Сколько у тебя денег?");
            Scanner cScanner = new Scanner(System.in);
            int money = cScanner.nextInt();
            System.out.println("Понятно");
            int x = money % 100;
            int y = money % 10;
           // System.out.println("xxxxxxxx -> "+x);
           // System.out.println("yyyyyyyy -> "+y);
if (money == 777) {key = false;}

            if (y == 1 && x != 11) {
                System.out.println(money + " рубль");
            } else {
                if (20 >= x && x >= 10 || y >= 5 && y < 10 || y == 0) {
                    System.out.println(money + " рублей");
                } else {
                    if (y > 1 && y < 5)  {
                        System.out.println(money + " рубля");
                    }
                }
            }

        }
        System.out.println("777 это очень много, поздравляю, пока!");
    }
}
