package by.pvt.lessons.cashbox;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Shop shop1 = new Shop();

        System.out.println("SHOP IS OPEN FOR ABOUT "+ shop1.openTime/1000 + " SECONDS");
        for (int i = 1; i <= 7; i++) {

            Client client1 = new Client();
            client1.setShop(shop1);
            Thread t = new Thread(client1);
            Thread.sleep(200);
            t.start();
        }

        Thread t1 = new Thread(new Cashbox(shop1), "Cashbox 1");
        Thread t2 = new Thread(new Cashbox(shop1), "Cashbox 2");
        Thread t3 = new Thread(new Cashbox(shop1), "Cashbox 3");
        t1.start();
        t2.start();
        t3.start();



    }

}
