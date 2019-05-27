package by.pvt.factory;

public class SedanCar implements Car{

    private int speedlimit = 140;
    private String color = "yellow";


    private CarType model = CarType.SEDAN;

    public void setModel(CarType model) {
        this.model = model;
    }

    public CarType getModel() {
        return model;
    }


    @Override
    public String toString() {
        return "SedanCar{" +
                "speedlimit=" + speedlimit +
                ", color='" + color + '\'' +
                ", model=" + model +
                '}';
    }

    public void construct() {
        this.speedlimit = 150;
        this.color = "blue";
    }
}