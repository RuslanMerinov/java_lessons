package by.pvt.lessons.cashbox;

public class Cashbox implements Runnable {

    private Shop shop;

    Cashbox(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": I can help who’s next");
        try {

            shop.clientWork();
            System.out.println(Thread.currentThread().getName()+ " closed");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
