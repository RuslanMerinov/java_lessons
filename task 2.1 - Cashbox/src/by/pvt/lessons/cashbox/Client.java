package by.pvt.lessons.cashbox;


import java.util.HashSet;


public class Client implements Runnable  {

    private String name;
    private HashSet goods;
    private Shop shop;

    void setShop(Shop shop) {
        this.shop = shop;
    }

    Client() {
        this.name = (Math.round(Math.random()*1000)+"");

    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", goods=" + goods +
                '}';
    }

    @Override
    public void run() {

        System.out.println("Client "+this.name +" came to shop");
        this.goods = shop.newClientSet();

            {shop.newClient (this);}


    }
}
