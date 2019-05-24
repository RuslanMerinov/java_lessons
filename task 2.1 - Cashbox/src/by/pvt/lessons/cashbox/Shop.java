package by.pvt.lessons.cashbox;

import java.util.ArrayList;
import java.util.HashSet;

class Shop {
    long openTime = 20000;
    private long closeTime = System.currentTimeMillis() + openTime;

    private final ArrayList<Client> clients = new ArrayList<>();

    private ArrayList<String> shopGoods = new ArrayList<>();
    private int count = 0;

    Shop() {

        shopGoods.add("Cola");
        shopGoods.add("Snacks");
        shopGoods.add("Milk");
        shopGoods.add("Cake");
        shopGoods.add("Book");
        shopGoods.add("Cheese");
        shopGoods.add("Meat");
        shopGoods.add("Candy");
        shopGoods.add("Boeing 737-300");
        shopGoods.add("BMW X5");
        shopGoods.add("Eternal Life");

    }

    HashSet newClientSet() {
        ArrayList<String> randomList = new ArrayList<>();
        for (int i = 0; i < Math.round(Math.random() * 10); i++) {
            String s = shopGoods.get((int) Math.round(Math.random() * 10));
            randomList.add(i, s);
        }
        HashSet<String> set = new HashSet<>(randomList);
        if (set.isEmpty()) set.add("Bubblegum");
        return set;
    }

    void newClient(Client client) {
        synchronized (clients) {
            clients.add(client);
            System.out.println(client);

        }
    }

    void clientWork() throws InterruptedException {


        while (System.currentTimeMillis() < closeTime) {

            String st = Thread.currentThread().getName();

            if ((System.currentTimeMillis() < closeTime && count % 5 == 0)) {

                Client client1 = new Client();
                client1.setShop(this);
                Thread t = new Thread(client1);
                Thread.sleep(2000);
                t.start();
            }

            count++;

            synchronized (clients) {

                if (!clients.isEmpty()) {

                    synchronized (clients) {
                        Client currentClient = clients.remove(0);
                        System.out.println(st + ": " + currentClient + " is DONE");

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else return;
            }
        }


    }
}

