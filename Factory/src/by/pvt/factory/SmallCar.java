package by.pvt.factory;

public class SmallCar implements Car {

    private int speedlimit = 10;
    private int size = 10;

    private CarType model = CarType.SMALL;

    public void setModel(CarType model) {
        this.model = model;
    }

    public CarType getModel() {
        return model;
    }


    @Override
    public String toString() {
        return "SmallCar{" +
                "speedlimit=" + speedlimit +
                ", size=" + size +
                ", model=" + model +
                '}';
    }

    public void construct() {
        this.speedlimit = 15;
        this.size = 8;
    }
}


