package by.pvt.factory;

class CarFactory {

    private Car car;

    Car buildCar(CarType type) {

        switch (type) {
            case LUXURY:
                car = new LuxuryCar(); break;
            case SMALL:
                car = new SmallCar(); break;
            case SEDAN:
                car = new SedanCar(); break;

        }
        return car;
    }


}


