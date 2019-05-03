public class Main {

    public static void main(String[] args) {

        TimeBox t1 = new TimeBox(2, 0, 15);

        System.out.println(t1.muchSeconds() + " seconds are in first box...");
        System.out.println(t1);

        TimeBox t2 = new TimeBox(9000);
        System.out.println(t2);

        t1.compare(t2);
        t2.compare(t1);

    }
}
