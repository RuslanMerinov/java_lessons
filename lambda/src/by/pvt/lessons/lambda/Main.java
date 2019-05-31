package by.pvt.lessons.lambda;

import java.util.Random;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        int i = new Random().nextInt(300);
        System.out.println("First Random " + i);
        int i2 = new Random().nextInt(300);
        System.out.println("Second Random " + i2);


        BiFunction<Integer, Integer, Integer> biMax = (x, y) -> {
            if (x.equals(y)) return null;

            if (x > y) {
                return x;
            } else return y;


        };
        System.out.println("MAX is " + biMax.apply(i, i2));

        BiFunction<Integer, Integer, Integer> biMin = (x, y) -> {
            if (x.equals(y)) return null;

            if (x < y) {
                return x;
            } else return y;
        };
        System.out.println("MIN is " + biMin.apply(i, i2));

    }
}
