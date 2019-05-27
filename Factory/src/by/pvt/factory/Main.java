package by.pvt.factory;

public class Main {
    public static void main(String[] args) {

        Car car1 = new CarFactory().buildCar(CarType.LUXURY);
        Car car2 = new CarFactory().buildCar(CarType.SMALL);
        Car car3 = new CarFactory().buildCar(CarType.SEDAN);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println();
        car1.construct(); car2.construct(); car3.construct();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println();
        car1.setModel(CarType.SMALL);
        System.out.println(car3.getModel());



    }
}
